package com.roy.coursescheduling.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.roy.coursescheduling.dao.ClassInfoDao;
import com.roy.coursescheduling.entity.ClassInfo;
import com.roy.coursescheduling.entity.response.ClassInfoVO;
import com.roy.coursescheduling.service.ClassInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ROY
 */
@Service
public class ClassInfoServiceImpl extends ServiceImpl<ClassInfoDao, ClassInfo> implements ClassInfoService {


    @Autowired
    public ClassInfoDao classInfoDao;


    @Override
    public IPage<ClassInfoVO> selectClassAndTeacher(Page<ClassInfoVO> pg, String gradeNo) {

        IPage<ClassInfoVO> classInfoVOs = classInfoDao.selectClassAndTeacher(pg, gradeNo);

        return classInfoVOs;
    }

    @Override
    public IPage<ClassInfoVO> selectClassAndTeacherAll(Page<ClassInfoVO> pg) {
        IPage<ClassInfoVO> classInfoVOs = classInfoDao.selectClassAndTeacherAll(pg);
        return classInfoVOs;
    }

    @Override
    public int getSize() {
        int classSize = classInfoDao.getSize();
        return classSize;
    }

    @Override
    public ClassInfo selectByClassNo(String substring) {
        ClassInfo classInfo = classInfoDao.selectByClassNo(substring);
        return classInfo;
    }
}
