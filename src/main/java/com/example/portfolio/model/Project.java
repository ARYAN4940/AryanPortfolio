package com.example.portfolio.model;

public class Project {

    private String title;
    private String description;
    private String technology;

    public Project(String title, String description,
                   String technology) {
        this.title = title;
        this.description = description;
        this.technology = technology;
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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}