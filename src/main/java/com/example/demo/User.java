package com.example.demo;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "MyUser")
public class User {
    @Column
    String name;
    @Id /*Primkey Column*/
    @GeneratedValue(generator = "system-uuid") /*Automatische Zuweisung einer ID*/
    @GenericGenerator(name = "system-uuid", strategy = "uuid2") /*Generierung nach uuid2*/
    String id;
}