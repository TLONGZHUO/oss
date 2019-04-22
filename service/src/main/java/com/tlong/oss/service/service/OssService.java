package com.tlong.oss.service.service;

import com.tlong.oss.api.dto.OssBaseResultDto;
import com.tlong.wallet.api.client.CoinClient;
import com.tlong.wallet.api.client.WalletClient;
import com.tlong.wallet.api.dto.WalletBaseResultDto;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class OssService {


    private final CoinClient coinClient;

    public OssService(CoinClient coinClient) {
        this.coinClient = coinClient;
    }


    /**
     * 测试文件上传
     */
    public OssBaseResultDto singleUpload() {
        //调用userInfo获取用户信息
        WalletBaseResultDto userResponseDto = coinClient.findOne(1L);
        System.out.println("文件上传项目oss");
        OssBaseResultDto baseResultDto = new OssBaseResultDto();
        baseResultDto.setDetail(userResponseDto.getDetail());
        return baseResultDto;
    }
}
