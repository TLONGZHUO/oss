package com.tlong.oss.service.controller;

import com.tlong.oss.api.OssApi;
import com.tlong.oss.api.dto.OssBaseResultDto;
import com.tlong.oss.service.service.OssService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhuo
 */
@RestController
@RequestMapping("/api/oss")
public class OssController implements OssApi {

    private final OssService ossService;

    public OssController(OssService walletService) {
        this.ossService = walletService;
    }


    @Override
    public OssBaseResultDto singleUpload() {
        return ossService.singleUpload();
    }
}
