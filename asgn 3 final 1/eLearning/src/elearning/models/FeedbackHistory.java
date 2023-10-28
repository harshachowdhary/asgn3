/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elearning.models;

import java.util.ArrayList;

/**
 *
 * @author Snehal
 */
public class FeedbackHistory {
    
    private ArrayList<Feedback> feedback;

    public ArrayList<Feedback> getFeedback() {
        return feedback;
    }

    public void setFeedback(ArrayList<Feedback> feedback) {
        this.feedback = feedback;
    }
    
    public FeedbackHistory(){
        this.feedback = new ArrayList<Feedback>();
    }
    
     public Feedback addNewVitals(){
        
        Feedback newVitals = new Feedback();
        feedback.add(newVitals);
        return newVitals;
    }  
    
}
