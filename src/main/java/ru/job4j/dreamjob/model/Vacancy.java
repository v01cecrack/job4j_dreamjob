package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;

public class Vacancy {

    private int id;

    private String title;

    private String description;

    private LocalDateTime creationDate;

    public Vacancy(String title, String description) {

        this.title = title;
        this.description = description;
        this.creationDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

}