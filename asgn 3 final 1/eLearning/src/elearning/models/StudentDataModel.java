/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elearning.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harsh
 */
public class StudentDataModel {

    private List<StudentCourseModel> studentCourseLi = new ArrayList<>();

    /**
     * @return the studentCourseLi
     */
    public List<StudentCourseModel> getStudentCourseLi() {
        return studentCourseLi;
    }

    /**
     * @param studentCourseLi the studentCourseLi to set
     */
    public void setStudentCourseLi(List<StudentCourseModel> studentCourseLi) {
        this.studentCourseLi = studentCourseLi;
    }

}
