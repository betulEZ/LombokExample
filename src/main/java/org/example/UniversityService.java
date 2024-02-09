package org.example;

import lombok.Data;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

@Data
public class UniversityService {

    public OptionalDouble averagegradeofaCourse (Course course){
        return course.getStudents().stream().mapToInt(Student::getGrad).average();
    }
}
