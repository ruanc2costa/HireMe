package com.cuzan.hireme.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String roleName;

    @NotNull
    private String companyName;


    private Date startingDate;

    @NotNull
    private Date endDate;

    private String description;

    @OneToOne
    @JoinColumn(name = "recruiter_id")
    private Recruiter recruiter;
}
