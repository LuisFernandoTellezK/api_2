package com.evidencia.api_2.Repository;

     import com.evidencia.api_2.Entity.Product;
     import org.springframework.data.jpa.repository.JpaRepository;
     import org.springframework.stereotype.Repository;

     @Repository
     public interface ProductRepository extends JpaRepository<Product, Long> {
     }