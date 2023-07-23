package com.example.kakao.product.option;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OptionJPARepository extends JpaRepository<Option, Integer> {
    List<Option> findByProductId(int productId);
}
