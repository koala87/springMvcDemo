package com.demo.dao;

import com.demo.model.Task;

import java.util.List;

/**
 * Task Dao
 */

public interface TaskDao {
    public Task insertTask(Task t);

    public int deleteTask(int tid);

    public Task updateTask(Task t);

    public List<Task> getTasks();

    public Task getTask(int tid);
}