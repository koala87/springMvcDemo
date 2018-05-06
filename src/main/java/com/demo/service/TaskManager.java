package com.demo.service;

import java.util.List;

import com.demo.model.Task;

/**
 * Created by harryjin on 18/5/6.
 */
public interface TaskManager {
    public Task insertTask(Task t);

    public int deleteTask(int tid);

    public Task updateTask(Task t);

    public List<Task> getTasks();

    public Task getTask(int tid);
}
