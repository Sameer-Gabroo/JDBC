package com.jdbc.dao;

import com.jdbc.entity.student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImple implements StudentDao{
    private JdbcTemplate JdbcTemplate;

    public org.springframework.jdbc.core.JdbcTemplate getJdbcTemplate() {
        return JdbcTemplate;
    }

    public void setJdbcTemplate(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) {
        JdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(student student) {
        //insert query
        String query = "insert into student (Name,City) values(?,?)";
        int r = JdbcTemplate.update(query,student.getName(),student.getCity());
        return r;
    }

    @Override
    public int change(student student) {
        //update query
        String query ="update student set Name=? ,City=? where ID=?";
        int d =JdbcTemplate.update(query,student.getName(),student.getCity(),student.getID());
        return d;
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where ID=?";
        int d = JdbcTemplate.update(query,studentId);
        return d;
    }
}
