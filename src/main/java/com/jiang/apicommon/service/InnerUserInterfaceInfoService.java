package com.jiang.apicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiang.apicommon.model.entity.InterfaceInfo;
import com.jiang.apicommon.model.entity.User;
import com.jiang.apicommon.model.entity.UserInterfaceInfo;

/**
* @author jiangyanming
* @description 针对表【user_interface_info(yazi_Api.`interface_info`)】的数据库操作Service
* @createDate 2024-05-15 20:53:22
*/
public interface InnerUserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * (3) 调用接口，统计次数加+1
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    Boolean invokeCount(long interfaceInfoId, long userId);
}
