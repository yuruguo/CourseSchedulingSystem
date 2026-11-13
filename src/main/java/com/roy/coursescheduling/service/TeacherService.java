package com.roy.coursescheduling.service;

import com.roy.coursescheduling.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author ROY
 */
public interface TeacherService extends IService<Teacher> {



    Teacher teacherLogin(String username, String password);

    List<Teacher> selectTeacherAll();

    Teacher selectByRealName(String substring);

    int getSize();

    int getTeacherReg(String yesday);
}
