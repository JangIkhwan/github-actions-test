package org.example.jpacrud.domain.product.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
//@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long price;
    @Column(nullable = false)
    private Long stock;
    private String status;
//    @Column(name = "created_at")
    private LocalDateTime createdAt;
//    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
