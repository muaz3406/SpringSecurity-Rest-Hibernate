package com.muaz.Chart.domain;


import javax.persistence.*;


@Entity
@Table(name = "todolist")
public class ToDoList{


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="todolist_id")
    private Long id;

    private String name;
    private int questions;
    private String date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuestions() {
        return questions;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }
}
