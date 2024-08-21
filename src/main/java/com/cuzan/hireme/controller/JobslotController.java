package com.cuzan.hireme.controller;

import com.cuzan.hireme.dto.JobslotDTO;
import com.cuzan.hireme.service.JobslotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobslot")
public class JobslotController {

    private JobslotService jobslotService;

    public JobslotController(JobslotService jobslotService){
        this.jobslotService = jobslotService;
    }

    @PostMapping
    public ResponseEntity<JobslotDTO> createJobslot(@RequestBody JobslotDTO jobslotDTO){
        jobslotService.createJobSlot(jobslotDTO);
        return ResponseEntity.ok(jobslotDTO);
    }
}
