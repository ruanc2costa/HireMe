package com.cuzan.hireme.service;

import com.cuzan.hireme.dto.RecruiterDTO;
import com.cuzan.hireme.model.Recruiter;
import com.cuzan.hireme.repository.RecruiterRepository;
import org.springframework.stereotype.Service;

@Service
public class RecruiterService {

    private RecruiterRepository recruiterRepository;

    public RecruiterService(RecruiterRepository recruiterRepository){
        this.recruiterRepository = recruiterRepository;
    }

    public RecruiterDTO createUser(RecruiterDTO recruiterDTO){
        Recruiter recruiter = new Recruiter(recruiterDTO);
        recruiterRepository.save(recruiter);
        return recruiterDTO;
    }

}
