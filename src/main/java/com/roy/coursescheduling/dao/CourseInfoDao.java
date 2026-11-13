package com.roy.coursescheduling.dao;

import com.roy.coursescheduling.entity.CourseInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Mapper 接口
 * @author ROY
 */
@Mapper
public interface CourseInfoDao extends BaseMapper<CourseInfo> {

    @Select("select count(*) from tb_course_info")
    int getSize();
}
