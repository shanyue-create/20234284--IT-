package org.example.itjob.service;

import org.example.itjob.model.JobApplication;
import org.example.itjob.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    // 创建职位申请
    public JobApplication createJobApplication(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }

    // 获取所有职位申请
    public List<JobApplication> getAllJobApplications() {
        return jobApplicationRepository.findAll();
    }

    // 根据ID获取职位申请
    public Optional<JobApplication> getJobApplicationById(Long id) {
        return jobApplicationRepository.findById(id);
    }

    // 更新职位申请
    public JobApplication updateJobApplication(Long id, JobApplication jobApplication) {
        jobApplication.setId(id);
        return jobApplicationRepository.save(jobApplication);
    }

    // 删除职位申请
    public void deleteJobApplication(Long id) {
        jobApplicationRepository.deleteById(id);
    }
}