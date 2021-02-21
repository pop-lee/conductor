package com.liyunpeng.conductor.domain.job.entity;

/**
 * @author liyunpeng@live.com
 * @date 2021/2/21 20:37
 */
public class AttachmentFactory {

    public static Attachment createAttachment(long fileSize,String originFileName) {
        Long id = null;

        return new Attachment(id,fileSize,originFileName);
    }


}
