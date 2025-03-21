package com.employee.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.math.BigInteger;


@Getter
@Setter
@Builder
public class Employee {
    private String name;
    private String designation;
    private BigDecimal salary;

}
