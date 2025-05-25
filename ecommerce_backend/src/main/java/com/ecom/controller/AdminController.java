package com.ecom.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @GetMapping
    public ResponseEntity<?> dashboard() {
        return null;
    }

    @GetMapping("/profile")
    public ResponseEntity<?> profile() {
        return null;
    }

    @GetMapping("/profile/edit")
    public ResponseEntity<?> editProfile() {
        return null;
    }

    @PostMapping("/profile/edit")
    public ResponseEntity<?> updateProfile() {
        return null;
    }

    @GetMapping("/users")
    public ResponseEntity<?> users() {
        return null;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> user(@PathVariable Long userId) {
        return null;
    }

    @GetMapping("/users/{id}/edit")
    public ResponseEntity<?> editUser(@PathVariable Long userId) {
        return null;
    }

    @PostMapping("/users/{id}/edit")
    public ResponseEntity<?> updateUser(@PathVariable Long userId) {
        return null;
    }

    @GetMapping("/users/{id}/deactivate")
    public ResponseEntity<?> deactivateUser(@PathVariable Long userId) {
        return null;
    }

    @GetMapping("/users/{id}/activate")
    public ResponseEntity<?> activateUser(@PathVariable Long userId) {
        return null;
    }

    @GetMapping("/users/deactivated")
    public ResponseEntity<?> deactivatedUsers() {
        return null;
    }

    @GetMapping("/users/{id}/orders")
    public ResponseEntity<?> userOrders(@PathVariable Long userId) {
        return null;
    }

    @GetMapping("/sellers")
    public ResponseEntity<?> sellers() {
        return null;
    }

    @GetMapping("/sellers/{id}")
    public ResponseEntity<?> seller(@PathVariable Long sellerId) {
        return null;
    }

    @GetMapping("/sellers/pending")
    public ResponseEntity<?> pendingSellers() {
        return null;
    }

    @GetMapping("/sellers/{id}/approve")
    public ResponseEntity<?> approveSeller(@PathVariable Long sellerId) {
        return null;
    }

    @GetMapping("/sellers/{id}/reject")
    public ResponseEntity<?> rejectSeller(@PathVariable Long sellerId) {
        return null;
    }

    @GetMapping("/sellers/{id}/edit")
    public ResponseEntity<?> editSeller() {
        return null;
    }

    @PostMapping("/sellers/{id}/edit")
    public ResponseEntity<?> updateSeller(@PathVariable Long sellerId) {
        return null;
    }

    @GetMapping("/sellers/{id}/deactivate")
    public ResponseEntity<?> deactivateSeller(@PathVariable Long sellerId) {
        return null;
    }

    @GetMapping("/sellers/{id}/activate")
    public ResponseEntity<?> activateSeller(@PathVariable Long sellerId) {
        return null;
    }

    @GetMapping("/sellers/deactivated")
    public ResponseEntity<?> deactivatedSellers() {
        return null;
    }

    @GetMapping("/sellers/{id}/products")
    public ResponseEntity<?> sellerProducts(@PathVariable Long sellerId) {
        return null;
    }

    @GetMapping("/categories")
    public ResponseEntity<?> categories() {
        return null;
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<?> category(@PathVariable Long categoryId) {
        return null;
    }

    @GetMapping("/categories/{id}/edit")
    public ResponseEntity<?> editCategory(@PathVariable Long categoryId) {
        return null;
    }

    @PostMapping("/categories/{id}/edit")
    public ResponseEntity<?> updateCategory(@PathVariable Long categoryId) {
        return null;
    }

    @GetMapping("/categories/{id}/deactivate")
    public ResponseEntity<?> deactivateCategory(@PathVariable Long categoryId) {
        return null;
    }

    @GetMapping("/categories/{id}/activate")
    public ResponseEntity<?> activateCategory(@PathVariable Long categoryId) {
        return null;
    }

    @GetMapping("/categories/deactivated")
    public ResponseEntity<?> deactivatedCategories() {
        return null;
    }

    @GetMapping("/categories/{id}/products")
    public ResponseEntity<?> categoryProducts(@PathVariable Long categoryId) {
        return null;
    }

    @GetMapping("/products")
    public ResponseEntity<?> products() {
        return null;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> product(@PathVariable Long productId) {
        return null;
    }

    @GetMapping("/products/{id}/edit")
    public ResponseEntity<?> editProduct(@PathVariable Long productId) {
        return null;
    }

    @PostMapping("/products/{id}/edit")
    public ResponseEntity<?> updateProduct(@PathVariable Long productId) {
        return null;
    }

    @GetMapping("/products/{id}/deactivate")
    public ResponseEntity<?> deactivateProduct(@PathVariable Long productId) {
        return null;
    }

    @GetMapping("/products/{id}/activate")
    public ResponseEntity<?> activateProduct(@PathVariable Long productId) {
        return null;
    }

    @GetMapping("/products/deactivated")
    public ResponseEntity<?> deactivatedProducts(@PathVariable Long productId) {
        return null;
    }

    @GetMapping("/products/{id}/orders")
    public ResponseEntity<?> productOrders(@PathVariable Long productId) {
        return null;
    }

    @GetMapping("/orders")
    public ResponseEntity<?> orders() {
        return null;
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<?> order(@PathVariable Long orderId) {
        return null;
    }

    @GetMapping("/orders/{id}/edit")
    public ResponseEntity<?> editOrder(@PathVariable Long orderId) {
        return null;
    }

    @PostMapping("/orders/{id}/edit")
    public ResponseEntity<?> updateOrder(@PathVariable Long orderId) {
        return null;
    }

}
