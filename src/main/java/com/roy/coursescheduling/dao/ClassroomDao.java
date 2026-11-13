package com.roy.coursescheduling.dao;

import com.roy.coursescheduling.entity.Classroom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ROY
 */
public interface ClassroomDao extends BaseMapper<Classroom> {

//    查询某个教学楼下的教室管理
    @Select("select * from tb_classroom where teachbuild_no = #{teachbuildNo}")
    List<Classroom> selectByTeachbuildNo(@Param("teachbuildNo") String teachbuildNo);

//    @Select("select * from tb_classroom where teachbuild_no in #{teachBuildNoList}") // 这里肯定需要优化的
//    List<Classroom> selectByTeachbuildNoList(List<String> teachBuildNoList);
}
