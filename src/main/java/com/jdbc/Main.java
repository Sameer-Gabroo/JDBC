package com.jdbc;

import com.jdbc.dao.StudentDao;
import com.jdbc.dao.StudentDaoImple;
import com.jdbc.entity.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        System.out.println("My programe is runing ........");
        //spring jdbc => jdbc template
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
//        JdbcTemplate template = context.getBean("jdbctem",JdbcTemplate.class);

        //insert query
//        String query = "insert into student (Name,City) values(?,?)";
        //fire the query
//        int result =template.update(query,"sameer ali","pakistan");
        StudentDao StudentDao = context.getBean("studentdao", StudentDao.class);

        // for insert query

//        student student = new student();
//        student.setID(345);
//        student.setName("Imran khan");
//        student.setCity("karachi");
//
//       int result = StudentDao.insert(student);
//        System.out.println("student added "+result);

       // for update  query

//        student student = new student();
//        student.setID(5656);
//        student.setName("Arslan");
//        student.setCity("larkana");
//        int result = StudentDao.change(student);
//        System.out.println("result inserted "+ result);

          //for delete query

        int result = StudentDao.delete(5658);
        System.out.println("result deleted "+ result);
    }
}