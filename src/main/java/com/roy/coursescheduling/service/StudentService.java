package com.roy.coursescheduling.service;

import com.roy.coursescheduling.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author ROY
 */
public interface StudentService extends IService<Student> {

    Student studentLogin(String username, String password);

    int getSize();

    int getStudentReg(String yesday);
}
