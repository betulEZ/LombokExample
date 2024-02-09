package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


public record Teacher(
        String id,
        String name,
        String subject

) {
}
