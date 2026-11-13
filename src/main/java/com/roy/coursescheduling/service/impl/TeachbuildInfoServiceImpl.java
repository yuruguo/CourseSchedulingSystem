package com.roy.coursescheduling.service.impl;

import com.roy.coursescheduling.dao.TeachBuildInfoDao;
import com.roy.coursescheduling.entity.TeachbuildInfo;
import com.roy.coursescheduling.service.TeachbuildInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ROY
 */
@Service
public class TeachbuildInfoServiceImpl extends ServiceImpl<TeachBuildInfoDao, TeachbuildInfo> implements TeachbuildInfoService {

    @Override
    public int getSize() {

        return 0;
    }
}
