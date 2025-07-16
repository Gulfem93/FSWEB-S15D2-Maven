package org.example.entity;

public class Task {
    // Task sınıfı içerisinde 5 tane instance variable olmalı. 
    // project => string description => string assignee => string

    private  String project;
    private  String description;
    private  String assignee;

    private  Priority priority;
    private Status status;

    public Task(String assignee, String description, String project, Status status, Priority priority) {
        this.assignee = assignee;
        this.description = description;
        this.priority = priority;
        this.project = project;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



}
