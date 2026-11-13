package com.roy.coursescheduling.service;

import com.roy.coursescheduling.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author ROY
 */
public interface AdminService extends IService<Admin> {

    Admin adminLogin(String username, String password);

}
