package org.uade.testaws.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uade.testaws.models.Product;
import org.uade.testaws.models.User;
import org.uade.testaws.repositories.ProductRepository;
import org.uade.testaws.repositories.UserRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@Service
public class DateService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;


    public String returnDate() {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        return date.toString();
    }

    public Product returnProduct() {
        Optional<Product> product = this.productRepository.findById(1);
        Product actualProd = product.get();
        System.out.println(actualProd.getPrice());
        return actualProd;
    }

    public User returnUser() {
        Optional<User> user = this.userRepository.findById(1);
        User actualUser = user.get();
        return actualUser;
    }

}
