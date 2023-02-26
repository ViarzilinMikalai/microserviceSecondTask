package com.viarzilin.domain;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table
@Data
public class MyNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numberValue;
}
