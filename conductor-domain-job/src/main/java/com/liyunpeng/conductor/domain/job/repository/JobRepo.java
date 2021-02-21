package com.liyunpeng.conductor.domain.job.repository;

import com.liyunpeng.conductor.domain.job.aggregate.ExportJobAggregate;
import com.liyunpeng.conductor.domain.job.entity.JobEntity;

/**
 * @author liyunpeng@live.com
 * @date 2021/2/21 19:28
 */
public interface JobRepo {

    /**
     * 保存任务
     * @param jobEntity
     */
    void saveJob(JobEntity jobEntity);

    /**
     * 更新任务附件
     * @param jobId
     * @param attachmentId
     */
    void updateJobAttachment(Long jobId,Long attachmentId);
}
