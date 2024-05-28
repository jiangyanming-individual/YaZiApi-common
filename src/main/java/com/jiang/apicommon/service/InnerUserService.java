package com.jiang.apicommon.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jiang.apicommon.model.entity.User;
/**
 * 用户服务
 *
 */
public interface InnerUserService extends IService<User> {

    /**
     *
     * (1) 实际情况是去数据库中查是否分配给用户密钥（accessKey ,secretKey是否合法，
     * User getInvokeUser(accesskey) ;
     *  1. 先根据 ak 判断用户是否存在，查看sk
     *  2. 对比 sk 和用户传的加密后的 sk 是否一致
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
