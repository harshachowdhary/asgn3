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
public class ProfessorDataModel {

    private List<ProfessorCourseModel> professorCourseLi = new ArrayList<>();

    /**
     * @return the professorCourseLi
     */
    public List<ProfessorCourseModel> getProfessorCourseLi() {
        return professorCourseLi;
    }

    /**
     * @param professorCourseLi the professorCourseLi to set
     */
    public void setProfessorCourseLi(List<ProfessorCourseModel> professorCourseLi) {
        this.professorCourseLi = professorCourseLi;
    }

}
