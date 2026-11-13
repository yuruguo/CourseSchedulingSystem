package com.roy.coursescheduling.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.roy.coursescheduling.dao.TeacherDao;
import com.roy.coursescheduling.entity.Teacher;
import com.roy.coursescheduling.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ROY
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherDao, Teacher> implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Teacher teacherLogin(String username, String password) {
        QueryWrapper<Teacher> wrapper = new QueryWrapper();
        wrapper.eq("teacher_no", username);
        wrapper.eq("password", password);
        return teacherDao.selectOne(wrapper);
    }

    @Override
    public List<Teacher> selectTeacherAll() {
        List<Teacher> teacherList = teacherDao.selectList(null);
        return teacherList;
    }

    @Override
    public Teacher selectByRealName(String substring) {
        QueryWrapper<Teacher> qw = new QueryWrapper<>();
        qw.eq("realName", substring);
        Teacher teacher = teacherDao.selectOne(qw);
        return teacher;
    }

    @Override
    public int getSize() {
        int teacherSize = teacherDao.getSize();
        return teacherSize;
    }

    @Override
    public int getTeacherReg(String yesday) {
        int teacherReg = teacherDao.teacherReg(yesday);
        return teacherReg;
    }
}
