package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@Builder
public class Student {

    @With
    private final String id;
    private String name;
    private String address;
    private int grad;
}
