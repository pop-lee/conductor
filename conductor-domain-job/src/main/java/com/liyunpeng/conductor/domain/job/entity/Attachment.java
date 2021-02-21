package com.liyunpeng.conductor.domain.job.entity;

import java.io.InputStream;

/**
 * 任务附件，如果将附件单独成为domain也是可行的，可后续再做拆分
 * @author liyunpeng@live.com
 * @date 2021/2/21 16:05
 */
public class Attachment {

    private Long id;

    private long size;

    private String originFileName;

    public Attachment(Long id,long size,String originFileName) {
        this.id = id;
        this.size = size;
        this.originFileName = originFileName;
    }

    public Long getId() {
        return id;
    }
}
