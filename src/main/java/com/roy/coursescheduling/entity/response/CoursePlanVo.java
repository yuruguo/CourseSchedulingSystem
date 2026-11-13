package com.roy.coursescheduling.entity.response;

import com.roy.coursescheduling.entity.CourseInfo;
import com.roy.coursescheduling.entity.CoursePlan;
import com.roy.coursescheduling.entity.Teacher;
import lombok.Data;

/**
 * @author ROY
 */
@Data
public class CoursePlanVo extends CoursePlan {

    private Teacher teacher;

    private CourseInfo courseInfo;
}
