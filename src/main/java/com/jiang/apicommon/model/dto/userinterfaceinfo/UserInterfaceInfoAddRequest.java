package com.jiang.apicommon.model.dto.userinterfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 */
@Data
public class UserInterfaceInfoAddRequest implements Serializable {

    /**
     * 接口调用者
     */
    private Long userId;

    /**
     * 接口调用者
     */
    private Long interfaceInfoId;

    /**
     * 总的调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

    /**
     * 接口调用状态（0-关闭 1-开启）
     */
    private Integer status;


    private static final long serialVersionUID = 1L;
}