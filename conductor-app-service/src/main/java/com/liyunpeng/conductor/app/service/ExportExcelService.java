package com.liyunpeng.conductor.app.service;

import com.liyunpeng.conductor.domain.job.aggregate.ExportJobAggregate;
import com.liyunpeng.conductor.domain.job.entity.Attachment;
import com.liyunpeng.conductor.domain.job.entity.AttachmentFactory;
import com.liyunpeng.conductor.domain.job.entity.JobEntity;
import com.liyunpeng.conductor.domain.job.entity.JobFactory;

import com.liyunpeng.conductor.domain.job.repository.JobRepo;
import com.liyunpeng.conductor.domain.job.vo.JobTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @author liyunpeng@live.com
 * @date 2021/2/21 19:08
 */
@Service
public class ExportExcelService {
    @Autowired
    private JobRepo jobRepo;

    public void export() {
        JobEntity job = JobFactory.createJob(JobTypeVO.EXPORT_JOB);
        //存储任务
        jobRepo.saveJob(job);
        job.start();
        //查询数据

        //---------------------------
        //这部分要放到业务系统当中处理，解耦开，当前系统仅负责

        //将数据写入Excel
        File file = new File("");
        //将附件保存
        Attachment attachment = AttachmentFactory.createAttachment(file.length(),file.getName());

        //---------------------------
        //存储附件到任务信息中
        jobRepo.updateJobAttachment(job.getId(),attachment.getId());

        //保存附件至资源服务器

        //发送邮件通知

        job.finished();
    }
}
