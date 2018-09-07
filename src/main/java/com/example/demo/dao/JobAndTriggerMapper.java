package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.JobAndTrigger;
import org.apache.ibatis.annotations.Mapper;


public interface JobAndTriggerMapper {
    public List<JobAndTrigger> getJobAndTriggerDetails();
}
