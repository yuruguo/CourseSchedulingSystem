package com.roy.coursescheduling.entity.response;

import com.roy.coursescheduling.entity.ClassInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ROY
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassInfoVO extends ClassInfo {

    // 班主任姓名
    private String realname;

    private String gradeName;
}
