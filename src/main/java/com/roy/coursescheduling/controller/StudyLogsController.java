package com.roy.coursescheduling.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.roy.coursescheduling.common.ServerResponse;
import com.roy.coursescheduling.entity.StudyLogs;
import com.roy.coursescheduling.service.StudyLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ROY
 */
@RestController
@RequestMapping("/studylogs")
public class StudyLogsController {

    @Autowired
    private StudyLogsService sls;

    /**
     * 添加或更新学习进度
     * @param s
     * @return
     */
    @PostMapping("/add")
    public ServerResponse addLogs(@RequestBody StudyLogs s) {
        boolean b = sls.saveOrUpdate(s);
        if (b) {
            return ServerResponse.ofSuccess();
        }
        return ServerResponse.ofError();
    }

    /**
     * 根据学生id获取学习记录，上次看到哪个视频了
     */
    @GetMapping("/get/{id}")
    public ServerResponse getLog(@PathVariable("id") Integer id) {
        List<StudyLogs> list = sls.list(new QueryWrapper<StudyLogs>().eq("student_id", id));
        return ServerResponse.ofSuccess(list);
    }

}

