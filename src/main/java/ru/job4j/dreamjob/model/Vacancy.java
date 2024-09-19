package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;

public class Vacancy {

    private int id;

    private String title;

    private String description;

    private LocalDateTime creationDate = LocalDateTime.now();

    private boolean visible;

    public Vacancy(String title, String description, LocalDateTime creationDate) {

        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
    }

    public Vacancy(int id, String title, String description, LocalDateTime creationDate, boolean visible) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.visible = visible;
    }

    public Vacancy() {
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

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}