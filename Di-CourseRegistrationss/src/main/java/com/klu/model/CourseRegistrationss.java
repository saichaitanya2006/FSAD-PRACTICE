package com.klu.model;

public class CourseRegistrationss {
  private int rollNo;
  private String studentName;
  private String CourseName;
  private String semester;
  
  public CourseRegistrationss(int rollNo, String studentName) {
  this.rollNo=rollNo;
  this.studentName=studentName;

}

  public void setCourseName(String courseNmae) {
      this.CourseName=CourseName;
    }
  public void setsemester(String semester) {
    this.semester=semester;
  }
  
  public void display() {
    System.out.println("RollNo"+rollNo);
    System.out.println("Name"+studentName);
    System.out.println("CourseName"+CourseName);
    System.out.println("Semester"+semester);

  }
}