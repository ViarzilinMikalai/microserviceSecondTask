package com.viarzilin.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class MyNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numberValue;
}
