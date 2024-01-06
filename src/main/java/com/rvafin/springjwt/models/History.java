package com.rvafin.springjwt.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTimeCreate;

    private String body;

    @ManyToOne
    @JoinColumn(name = "request_creator_id")
    private User requestCreator;

    public User getRequestCreator() {
        return requestCreator;
    }

    public void setRequestCreator(User requestCreator) {
        this.requestCreator = requestCreator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTimeCreate() {
        return dateTimeCreate;
    }

    public void setDateTimeCreate(LocalDateTime dateTimeCreate) {
        this.dateTimeCreate = dateTimeCreate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
