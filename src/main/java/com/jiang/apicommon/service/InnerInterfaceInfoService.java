package com.jiang.apicommon.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jiang.apicommon.model.entity.InterfaceInfo;
/**
* @author jiangyanming
* @description 针对表【interface_info(yazi_Api.`interface_info`)】的数据库操作Service
* @createDate 2024-04-29 13:47:39
*/
public interface InnerInterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * (2) 查看请求模拟接口是否存在
     * InterfaceInfo getInterfaceInfo (url ,method,)
     * @param accessKey
     * @return
     */
    InterfaceInfo getInterfaceInfo(String accessKey);

}
