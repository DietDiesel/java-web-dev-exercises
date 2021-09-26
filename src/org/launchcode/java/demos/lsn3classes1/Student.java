package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String aName, int aStudentId, int aCreds, double aGpa) {
        this.name = aName;
        this.studentId = aStudentId;
        this.numberOfCredits = aCreds;
        this.gpa = aGpa;
    }

    public String getName() {
        return this.name;
    }

    protected boolean setName(String aName) {
        try {
            this.name = aName;
        }
        catch (Exception e){
            System.out.println("Type error: I needed a string but got something else");
            System.out.println(e);
            return false;
        }
        return true;
    }

    public int getStudentId() {
        return this.studentId;
    }

    protected boolean setStudentId(int aStudentId) {
        try {
            this.studentId = aStudentId;
        }
        catch (Exception e) {
            System.out.println("Type error: I needed an integer but got something else");
            System.out.println(e);
            return false;
        }
        return true;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    protected boolean setNumberOfCredits(int aCreds) {
        try {
            this.numberOfCredits = aCreds;
        }
        catch (Exception e) {
            System.out.println("Type error: I needed an integer, but got something else");
            System.out.println(e);
            return false;
        }
        return true;
    }

    public double getGpa() {
        return this.gpa;
    }

    protected boolean setGpa(double aGpa) {
        try {
            this.gpa = aGpa;
        }
        catch (Exception e) {
            System.out.println("Type error: I needed an double, but got something else");
            System.out.println(e);
            return false;
        }
        return true;
    }

    public String getGradeLevel(double credits) {
        if (credits >= 30) {
            if (credits >= 60) {
                if (credits >= 90) {
                    return "Senior";
                }
                return "Junior";
            }
            return "Sophomore";
        }
        return "Freshman";
    }

    public void addGrade(double aCreds, double aGrade) {
        double qualityScore = gpa * numberOfCredits;
        qualityScore += (aCreds * aGrade);
        numberOfCredits += aCreds;
        gpa = qualityScore / numberOfCredits;
    }

    public boolean equals(Object o) {
        Student target = (Student) o;
        return target.getStudentId() == getStudentId();
    }

    public String toString() {
        return name + " ID: " + studentId + " GPA: " + gpa + " Credits: " + numberOfCredits;
    }
}