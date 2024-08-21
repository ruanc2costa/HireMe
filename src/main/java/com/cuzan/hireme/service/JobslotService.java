package com.cuzan.hireme.service;

import com.cuzan.hireme.dto.JobslotDTO;
import com.cuzan.hireme.model.JobSlot;
import com.cuzan.hireme.repository.JobslotRepository;
import com.cuzan.hireme.repository.RecruiterRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JobslotService {

    private final JobslotRepository jobslotRepository;
    private final RecruiterRepository recruiterRepository;

    public JobslotService(JobslotRepository jobslotRepository, RecruiterRepository recruiterRepository) {
        this.jobslotRepository = jobslotRepository;
        this.recruiterRepository = recruiterRepository;
    }

    public JobslotDTO createJobSlot(JobslotDTO jobslotDTO) {
        Long id = jobslotDTO.getRecruiterId();
        JobSlot jobSlot = new JobSlot(jobslotDTO);
        jobSlot.setRecruiter(recruiterRepository.findById(id).orElseThrow(EntityNotFoundException::new));
        jobslotRepository.save(jobSlot);
        return jobslotDTO;
    }
}
