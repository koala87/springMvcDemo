package com.demo.service;

import com.demo.dao.TaskDao;
import com.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by harryjin on 18/5/6.
 */
public class TaskManagerImpl implements TaskManager {
    @Autowired
    TaskDao dao;

    public Task insertTask(Task t) {
        return dao.insertTask(t);
    }

    public int deleteTask(int tid) {
        return dao.deleteTask(tid);
    }

    public Task updateTask(Task t) {
        return dao.updateTask(t);
    }

    public List<Task> getTasks() {
        return dao.getTasks();
    }

    public Task getTask(int tid) {
        return dao.getTask(tid);
    }
}
