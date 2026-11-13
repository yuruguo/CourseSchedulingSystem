package com.roy.coursescheduling.service;

import com.roy.coursescheduling.common.ServerResponse;
import com.roy.coursescheduling.entity.ClassTask;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * @author ROY
 */
public interface ClassTaskService extends IService<ClassTask> {

//    Boolean classScheduling(ClassTask classTask);
    ServerResponse classScheduling(@Param("semester") String semester);


}
