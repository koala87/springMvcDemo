package com.demo.dao;

import com.demo.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * TaskDaoImpl
 */

@Repository
public class TaskDaoImpl implements TaskDao {
    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<Task>();

        Task t1 = new Task();
        t1.setId(1);
        t1.setName("Task 1");
        tasks.add(t1);
        return tasks;
    }

    public Task getTask(int tid) {
        Task t = new Task();
        t.setId(2);
        t.setName("Task 2");
        return t;
    }

    public Task insertTask(Task t1) {
        Task t = new Task();
        t.setId(2);
        t.setName("Task 2");
        return t;
    }

    public int deleteTask(int tid) {
        return 1;
    }

    public Task updateTask(Task t1) {
        Task t = new Task();
        t.setId(2);
        t.setName("Task 2");
        return t;
    }
}