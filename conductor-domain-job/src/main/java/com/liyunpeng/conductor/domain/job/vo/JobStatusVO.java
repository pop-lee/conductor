package com.liyunpeng.conductor.domain.job.vo;

/**
 * @author liyunpeng@live.com
 * @date 2021/2/21 16:09
 */
public enum JobStatusVO {

    /**
     * 任务已创建
     */
    CREATED(0),

    /**
     * 处理中
     */
    HANDLING(10),

    /**
     * 处理失败
     */
    HANDLE_FAILD(90),

    /**
     * 处理完成
     */
    FINISHED(100);

    private int status;

    JobStatusVO(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
