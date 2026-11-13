package com.roy.coursescheduling.entity.response;

import com.roy.coursescheduling.entity.LocationInfo;
import lombok.Data;

/**
 * @author ROY
 */
@Data
public class LocationVO extends LocationInfo {

    private String teachBuildName;

    private String gradeName;
}
