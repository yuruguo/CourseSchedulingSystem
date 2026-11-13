package com.roy.coursescheduling.entity.request;

import lombok.Data;

/**
 * @author ROY
 */
@Data
public class ClassAddVO {

    // 讲师id
    private Integer id;

    private String gradeNo;

    private String classNo;

    private String className;

    private Integer num;

    private String realname;
}
