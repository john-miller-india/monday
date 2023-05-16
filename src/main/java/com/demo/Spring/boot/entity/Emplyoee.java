package com.demo.Spring.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Emplyoee {

    @Id
    @GeneratedType(Strategy=GenratedValue.AUTO)
    private int employeeName;

    private String employeeName;
    private String gender;
}
