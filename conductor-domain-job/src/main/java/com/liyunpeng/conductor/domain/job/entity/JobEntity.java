package com.liyunpeng.conductor.domain.job.entity;

import com.liyunpeng.conductor.domain.job.vo.JobStatusVO;
import com.liyunpeng.conductor.domain.job.vo.JobTypeVO;

public class JobEntity {

    private Long id;

    private JobTypeVO jobType;

    private JobStatusVO jobStatusVO;

    private String jobName;

    public JobEntity(Long id,JobTypeVO jobType,String jobName) {
        this.id = id;
        this.jobType = jobType;
        this.jobName = jobName;
    }

    public Long getId() {
        return id;
    }

    /**
     * 启动任务，正常用事件驱动方式的话，直接派发事件，由监听者执行后续操作，若没有事件机制，则只能按传统逻辑总线方式执行
     */
    public void start() {
        jobStatusVO = JobStatusVO.HANDLING;
    }

    public void finished() {
        jobStatusVO = JobStatusVO.FINISHED;
    }
}
