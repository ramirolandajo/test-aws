package org.uade.testaws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uade.testaws.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
