package com.java.pattern.Design.iteractor;

import java.util.Iterator;

public class CourseRepository implements Iterable<String> {

    private String[] courses;
    private int index = 0;

    public CourseRepository() {
        courses = new String[0];
        index = 0;
    }

    public void addCourse(String course) {
        if(index == courses.length) {
            System.out.println("Adding new item"+course);
            String[] moreCourses = new String[courses.length + 1];
            System.arraycopy(courses, 0, moreCourses, 0, courses.length);
            courses = moreCourses;
            moreCourses = null;
        }
        courses[index] = course;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < courses.length;
            }

            @Override
            public String next() {
                return courses[index++];
            }
        };
        return iterator;
    }
}
