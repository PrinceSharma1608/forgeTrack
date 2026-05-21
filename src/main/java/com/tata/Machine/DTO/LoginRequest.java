package com.tata.Machine.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class LoginRequest {

    private Integer userTkt;
    private String userPassword;

}