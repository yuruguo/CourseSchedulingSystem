package com.roy.coursescheduling.entity.request;

import lombok.Data;

/**
 * @author ROY
 */
@Data
public class StudentLoginRequest {

    private String username;

    private String password;
}
