package com.programmers.coffeeorder.repository.product;

import com.programmers.coffeeorder.entity.CoffeeProduct;

import java.util.List;
import java.util.Optional;

public interface CoffeeProductRepository {
    List<CoffeeProduct> listCoffeeProducts();
    Optional<CoffeeProduct> findById(long id);
}
