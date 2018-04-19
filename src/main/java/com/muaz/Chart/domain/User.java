package com.muaz.Chart.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="user_id")
    private Long id;

    @Column(name="name")
    private String name;
    private String surname;
    private String password;




    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Set<ToDoList> toDoLists=new HashSet<>();


    public Set<ToDoList> getToDoLists() {
        return toDoLists;
    }

    public void setToDoLists(Set<ToDoList> toDoLists) {
        this.toDoLists = toDoLists;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
