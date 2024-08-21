package com.cuzan.hireme.controller;

import com.cuzan.hireme.dto.RecruiterDTO;
import com.cuzan.hireme.service.RecruiterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {

    private final RecruiterService recruiterService;

    public RecruiterController(RecruiterService recruiterService){
        this.recruiterService = recruiterService;
    }

    @PostMapping
    public ResponseEntity<RecruiterDTO> createRecruiter(@RequestBody RecruiterDTO recruiterDTO){
        recruiterService.createUser(recruiterDTO);
        return ResponseEntity.ok(recruiterDTO);
    }
}
