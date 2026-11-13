package com.roy.coursescheduling.entity.request;

import lombok.Data;

/**
 * @author ROY
 */
@Data
public class PasswordVO {

    private Integer id;

    private String oldPass;

    private String newPass;

    private String rePass;
}
