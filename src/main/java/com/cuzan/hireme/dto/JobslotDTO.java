package com.cuzan.hireme.dto;

import com.cuzan.hireme.model.Recruiter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobslotDTO {

    private String roleName;
    private String companyName;
    private String description;
    private Long recruiterId;
}
