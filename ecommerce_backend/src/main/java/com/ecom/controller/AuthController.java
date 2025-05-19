package com.ecom.controller;

import com.ecom.model.User;
import com.ecom.model.dtos.AuthResponse;
import com.ecom.model.dtos.LoginRequest;
import com.ecom.model.dtos.OtpVerificationRequestDTO;
import com.ecom.model.dtos.RegisterRequest;
import com.ecom.service.AuthService;
import com.ecom.service.MailService;
import com.ecom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private Map<String, User> pendingUsers = new HashMap<>();
    private Map<String, String> otpStore = new HashMap<>();

    @Autowired
    private  AuthService authService;

    @Autowired
    private UserService userService;

    @Autowired
    private MailService mailService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        if (userService.existsByEmail(request.getEmail())) {
            return ResponseEntity.badRequest().body("Email already exists");
        }

        String otp = generateOtp();
        otpStore.put(request.getEmail(), otp);

        User tempUser = new User();
        tempUser.setEmail(request.getEmail());
        tempUser.setName(request.getName());
        tempUser.setPassword(request.getPassword());
        pendingUsers.put(request.getEmail(), tempUser);

        String html = loadTemplate("templates/otp-email-temp.html");
        String body = html.replace("{{name}}", tempUser.getName()).replace("{{otp}}", otp);

        boolean sent = mailService.sendMail(tempUser.getEmail(), "OTP Verification", body);

        if (sent) {
            return ResponseEntity.ok("OTP sent to " + request.getEmail());
        } else {
            return ResponseEntity.status(500).body("Failed to send OTP");
        }
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<?> verifyOtp(@RequestBody OtpVerificationRequestDTO request) {
        String email = request.getEmail();
        String otp = request.getOtp();
        String correctOtp = otpStore.get(email);

        if (correctOtp != null && correctOtp.equals(otp)) {
            User user = pendingUsers.get(email);
            if (user != null) {
                userService.saveUser(user);
                otpStore.remove(email);
                pendingUsers.remove(email);
                return ResponseEntity.ok("OTP verified. Registration complete.");
            }
        }
        return ResponseEntity.badRequest().body("Invalid OTP, please try again.");
    }

    private String generateOtp() {
        return String.valueOf(new Random().nextInt(899999) + 100000); // 6-digit OTP
    }

    private String loadTemplate(String path) {
        try (InputStream inputStream = new ClassPathResource(path).getInputStream()) {
            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "Dear {{name}}, Your OTP is {{otp}}";
        }
    }


    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
