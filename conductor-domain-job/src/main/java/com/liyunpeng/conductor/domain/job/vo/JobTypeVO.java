package com.liyunpeng.conductor.domain.job.vo;

/**
 * @author liyunpeng@live.com
 * @date 2021/2/21 19:34
 */
public enum JobTypeVO {

    /**
     * 导出任务
     */
    EXPORT_JOB(10),
    /**
     * 导入任务
     */
    IMPORT_JOB(11),
    ;

    /**
     * 类型
     */
    private int type;

    JobTypeVO(int type) {
        this.type = type;
    }
}
