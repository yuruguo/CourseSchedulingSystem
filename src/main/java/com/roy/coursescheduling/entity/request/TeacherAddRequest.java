package com.roy.coursescheduling.entity.request;

import lombok.Data;

/**
 * @author ROY
 */
@Data
public class TeacherAddRequest {

    private String teacherNo;

    private String username;

    private String password;

    private String realname;

    private String jobtitle;

    private String teach;

    private String telephone;

    private String email;

    private String address;

    private Integer age;
}
