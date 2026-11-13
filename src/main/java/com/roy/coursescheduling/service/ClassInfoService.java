package com.roy.coursescheduling.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.roy.coursescheduling.entity.ClassInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.roy.coursescheduling.entity.response.ClassInfoVO;

/**
 * @author ROY
 */
public interface ClassInfoService extends IService<ClassInfo> {


    IPage<ClassInfoVO> selectClassAndTeacher(Page<ClassInfoVO> pg, String gradeNo);

    IPage<ClassInfoVO> selectClassAndTeacherAll(Page<ClassInfoVO> pg);

    int getSize();

    ClassInfo selectByClassNo(String substring);
}
