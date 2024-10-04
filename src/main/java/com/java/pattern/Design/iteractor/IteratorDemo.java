package com.java.pattern.Design.iteractor;

public class IteratorDemo {
    public static void main(String[] args) {
        CourseRepository courseRepository = new CourseRepository();
        courseRepository.addCourse("Java");
        courseRepository.addCourse("C++");
        courseRepository.addCourse("Python");
        courseRepository.addCourse("JavaScript");
        courseRepository.addCourse("PHP");
        courseRepository.addCourse("Ruby");
        courseRepository.addCourse("Go");
        courseRepository.addCourse("Rust");
        courseRepository.addCourse("Swift");

        System.out.println("Iterating over the courses");

        for (String course : courseRepository) {
            System.out.println(course);
        }
    }
}
