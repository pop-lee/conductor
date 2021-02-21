package com.liyunpeng.conductor.domain.job.aggregate;

import com.liyunpeng.conductor.domain.job.entity.Attachment;
import com.liyunpeng.conductor.domain.job.entity.JobEntity;

/**
 * @author liyunpeng@live.com
 * @date 2021/2/21 19:26
 */
public class ExportJobAggregate {

    private JobEntity jobEntity;

    private Attachment attachment;

    public ExportJobAggregate(JobEntity jobEntity) {
        this.jobEntity = jobEntity;
    }


}
