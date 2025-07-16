package org.example.entity;

import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()) {
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                Set<Task> allTasks = new java.util.HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                allTasks.addAll(unassignedTasks);
                return allTasks;
            default:
                throw new IllegalArgumentException("Invalid input: " + name);
        }
    }

    public Set<Task> getDifferences(Set<Task> taskSet, Set<Task> taskSet2) {
        taskSet.removeAll(taskSet2);
        return  taskSet;
    }

    public Set<Task> getIntersection(Set<Task> taskSet, Set<Task> taskSet2) {
        taskSet.retainAll(taskSet2);
        return  taskSet;
    }

    public Set<Task> getUnion(Set<Task> taskSet, Set<Task> taskSet2) {
        taskSet.removeAll(taskSet2);
        return taskSet;
    }
}
