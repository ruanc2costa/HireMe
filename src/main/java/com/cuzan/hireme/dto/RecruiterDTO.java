package com.cuzan.hireme.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecruiterDTO {

    private String name;
    private String email;
    private String password;
    private Date birthDate;
}