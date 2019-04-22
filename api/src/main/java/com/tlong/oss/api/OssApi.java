package com.tlong.oss.api;

import com.tlong.oss.api.dto.OssBaseResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api("文件上传相关接口")
public interface OssApi {

    @ApiOperation("普通单个文件上传")
    @GetMapping("/singleUpload")
    OssBaseResultDto singleUpload();
}
