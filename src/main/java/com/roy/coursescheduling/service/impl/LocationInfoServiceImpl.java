package com.roy.coursescheduling.service.impl;

import com.roy.coursescheduling.dao.LocationInfoDao;
import com.roy.coursescheduling.entity.LocationInfo;
import com.roy.coursescheduling.service.LocationInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ROY
 */
@Service
public class LocationInfoServiceImpl extends ServiceImpl<LocationInfoDao, LocationInfo> implements LocationInfoService {

}
