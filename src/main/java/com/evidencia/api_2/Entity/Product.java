package com.evidencia.api_2.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_product")
@Data
public class Product {
    @Id
    private Long idProduct;
    private String name;
    private String brand;
    private boolean expired;
    private float price;

    @ManyToOne
    @JoinColumn(name = "id_local", referencedColumnName = "id_local")
    private Local local;
}