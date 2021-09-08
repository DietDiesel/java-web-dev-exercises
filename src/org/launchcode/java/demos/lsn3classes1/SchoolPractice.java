package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn4classes2.Teacher;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student studentBrad = new Student("Brad Gravett", 303808909, 1, 4.0);

        class Course {
            String courseName;
            String courseCatalogNumber;
            Teacher courseInstructor;
            int courseCredits;
            ArrayList<Student> courseRoster = new ArrayList<>();

            public Course(String aName, String aCatalog, Teacher aInstructor, int aCreds) {
                this.courseName = aName;
                this.courseCatalogNumber = aCatalog;
                this.courseInstructor = aInstructor;
                this.courseCredits = aCreds;
            }
        }

        class Teacher {
            private String firstName;
            private String lastName;
            private String subject;
            private int yearsTeaching;

            public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.subject = subject;
                this.yearsTeaching = yearsTeaching;
            }

            public void setFirstName(String firstName) {this.firstName = firstName;}
            public void setLastName(String lastName) {this.lastName = lastName;}
            public void setSubject(String subject) {this.subject = subject;}
            public void setYearsTeaching(int yearsTeaching) {this.yearsTeaching = yearsTeaching;}

            public String getFirstName() {return firstName;}
            public String getLastName() {return lastName;}
            public String getSubject() {return subject;}
            public int getYearsTeaching() {return yearsTeaching;}
        }
    }
}
