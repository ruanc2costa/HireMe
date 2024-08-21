package com.cuzan.hireme.model;

import com.cuzan.hireme.dto.RecruiterDTO;
import com.cuzan.hireme.enums.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity(name = "recruiter")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recruiter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private Date birthDate;

    @OneToMany(mappedBy = "recruiter")
    private List<JobSlot> jobSlots;

    private Roles role;

    public Recruiter(RecruiterDTO recruiterDTO) {

        this.name = recruiterDTO.getName();
        this.email = recruiterDTO.getEmail();
        this.password = recruiterDTO.getPassword();
    }
}
