package com.roy.coursescheduling.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.roy.coursescheduling.dao.AdminDao;
import com.roy.coursescheduling.entity.Admin;
import com.roy.coursescheduling.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ROY
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminDao, Admin> implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin adminLogin(String username, String password) {
        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper.eq("admin_no", username);
        wrapper.eq("password", password);
        return adminDao.selectOne(wrapper);
    }
}
