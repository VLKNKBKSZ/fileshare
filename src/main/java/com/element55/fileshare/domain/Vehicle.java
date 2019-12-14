package com.element55.fileshare.domain;

import lombok.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    private String modelName;
    private int constructionYear;
    private double price;
}
