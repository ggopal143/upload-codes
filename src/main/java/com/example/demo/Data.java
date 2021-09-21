package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CODES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Data {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @Column(name = "CODE")
    private String code;

}
