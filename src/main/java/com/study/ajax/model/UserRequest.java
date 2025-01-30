package com.study.ajax.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
// PropertyNamingStrategy는 deprecated
public class UserRequest {
//    private String name;
    private String userName;
    private int age;

//    @JsonProperty("phone_number")
    private String phoneNumber;











    @Override
    public String toString() {
        return "UserRequest{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
