package com.luv2code.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_Price")
    private BigDecimal unitPrice;

    @Column(name = "image_Url")
    private String imageUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_Stock")
    private int unitsInStock;

    @UpdateTimestamp
    @Column(name = "date_Created")
    private Date dateCreated;

    @UpdateTimestamp
    @Column(name = "last_Updated")
    private Date lastUpdated;
}
