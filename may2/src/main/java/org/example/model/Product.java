package org.example.model;

//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double price;

//    @ManyToOne
//    private User user;


}
