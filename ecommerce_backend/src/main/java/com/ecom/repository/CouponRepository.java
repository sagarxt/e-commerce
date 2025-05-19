package com.ecom.repository;

import com.ecom.model.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CouponRepository extends MongoRepository<Coupon, String> {
}
