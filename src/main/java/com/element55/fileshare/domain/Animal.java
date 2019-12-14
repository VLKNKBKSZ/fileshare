package com.element55.fileshare.domain;

import lombok.*;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@AllArgsConstructor
public class Animal  implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String type;
    private int age;
    private long id;
}
