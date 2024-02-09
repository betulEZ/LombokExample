package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.List;
@Data
@Value
@AllArgsConstructor
@Builder
public class Course {
    private String name;
    private int id;
    private List<Student> students;
    private List<Teacher> teachers;
}
