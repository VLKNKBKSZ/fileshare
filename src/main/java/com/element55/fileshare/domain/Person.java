package com.element55.fileshare.domain;

import lombok.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private String lastName;
    private int age;
    private double length;
}
