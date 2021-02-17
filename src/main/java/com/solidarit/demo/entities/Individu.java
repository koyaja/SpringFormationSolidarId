package com.solidarit.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Individu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fistName;
    private  String LastName;
    private int age;
    private Date dateCreated;

    @Version
    private Timestamp lasteUpdate;
    @OneToOne
    private Abonnement abonnement;

}
