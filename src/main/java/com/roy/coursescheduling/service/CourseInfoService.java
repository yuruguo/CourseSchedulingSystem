package com.roy.coursescheduling.service;

import com.roy.coursescheduling.entity.CourseInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author ROY
 */
public interface CourseInfoService extends IService<CourseInfo> {
    List<CourseInfo> selectCourse ();


    CourseInfo selectByName(String courseName);

    int getSize();
}
