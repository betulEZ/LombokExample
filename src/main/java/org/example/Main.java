package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        Student student1=new Student("1","name1","address1",10);
        Student student2=new Student("2","name2","address2",2);
        studentList.add(student2);
        studentList.add(student1);

        List<Teacher> teacherList=new ArrayList<>();
        Teacher teacher1=new Teacher("1","teacherName1","subject1");
        Teacher teacher2=new Teacher("2","teacherName2","subject2");
        teacherList.add(teacher2);
        teacherList.add(teacher1);

        List<Course> courseList=new ArrayList<>();
        Course course=new Course("1",4,studentList,teacherList);
        Course course2=new Course("4",1,studentList,teacherList);
        courseList.add(course);
        courseList.add(course2);
        //course2.setId(5);
        //System.out.println(course.getId());
        //System.out.println(course);

        //Course newCourse=Course.builder().name("newCourse").build();
        // System.out.println(newCourse);

        //Student modifierdStudent= student1.withId("6");
        //System.out.println(modifierdStudent);

        UniversityService universityService=new UniversityService();
        System.out.println(universityService.averagegradeofaCourse(course));

        University university=new University("1","uni1",courseList);



    }
}