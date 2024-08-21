package com.cuzan.hireme.model;

import com.cuzan.hireme.dto.JobslotDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity(name = "jobslot")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobSlot {



    public JobSlot(JobslotDTO jobslotDTO){
        this.roleName = jobslotDTO.getRoleName();
        this.companyName = jobslotDTO.getCompanyName();
        this.description = jobslotDTO.getDescription();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobslot_id")
    private Long id;

    @NotNull
    private String roleName;

    @NotNull
    private String companyName;

    private Date startingDate;

    @NotNull
    private Date endDate;

    private String description;

    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private Recruiter recruiter;

    @OneToMany (mappedBy = "jobSlot")
    private List<Application> applications;

}
