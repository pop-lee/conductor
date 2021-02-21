package com.liyunpeng.conductor.domain.job.entity;

import com.liyunpeng.conductor.domain.job.aggregate.ExportJobAggregate;
import com.liyunpeng.conductor.domain.job.entity.JobEntity;
import com.liyunpeng.conductor.domain.job.vo.JobTypeVO;

/**
 * @author liyunpeng@live.com
 * @date 2021/2/21 19:30
 */
public class JobFactory {

    public static JobEntity createJob(JobTypeVO jobType) {
        //TODO 生成任务名规则
        String jobName = "";
        Long id = null;
        return new JobEntity(id,jobType,jobName);
    }

    public static ExportJobAggregate createExportJob() {
        //TODO 生成任务名规则
        String jobName = "";
        Long id = null;
        JobEntity jobEntity = new JobEntity(id,JobTypeVO.EXPORT_JOB,jobName);
        ExportJobAggregate jobAggregate = new ExportJobAggregate(jobEntity);

        return jobAggregate;
    }
}
