package com.jdbc.dao;

import com.jdbc.entity.student;

public interface StudentDao {
    public int insert(student student);
    public int change(student student);

    public int delete(int studentId);
}
