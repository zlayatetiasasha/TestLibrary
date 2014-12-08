/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.panels;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author hp
 */

@Entity
@Table(name = "AnsweredTest")
public class AnsweredTest implements Serializable{
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="id")
    private BigInteger id;
          
    @OneToOne(mappedBy="test_id")
    private Test test;
    
    @OneToOne(mappedBy="student_id")
    private Student student;
        
    @Column(name = "score")
    private Integer score;
    
    @Column(name = "grade")
    private String grade;
    
    @Column(name = "correct")
    private Integer correct;
    
    @Column(name = "wrong")
    private Integer wrong;
    
    @Column(name = "open")
    private Integer open;
    
    public AnsweredTest() {}
    
    public AnsweredTest(BigInteger id, Integer score, String grade, Integer correct, Integer wrong, Integer open) {
        this.id = id;
        this.score = score;
        this.grade = grade;
        this.correct = correct;
        this.wrong = wrong;
        this.open = open;
    }  
    
    public AnsweredTest(Integer score, String grade, Integer correct, Integer wrong, Integer open) {
        this.score = score;
        this.grade = grade;
        this.correct = correct;
        this.wrong = wrong;
        this.open = open;
    }
    
    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }   
    
    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }   
    
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }   
    
    public void setCorrect(Integer correct) {
        this.correct = correct;
    }

    public Integer getCorrect() {
        return correct;
    } 
    
    public void setWrong(Integer wrong) {
        this.wrong = wrong;
    }

    public Integer getWrong() {
        return wrong;
    } 
    
    public void setOpen(Integer open) {
        this.open = open;
    }

    public Integer getOpen() {
        return open;
    }
}
