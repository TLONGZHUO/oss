package com.tlong.oss.api.client.fallback;

import com.tlong.oss.api.client.OssClient;
import com.tlong.oss.api.dto.OssBaseResultDto;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class OssClientFallbackFactory implements FallbackFactory<OssClient> {

    @Override
    public OssClient create(Throwable throwable) {
        return new OssClient() {
            @Override
            public OssBaseResultDto singleUpload() {
                OssBaseResultDto resultDto = new OssBaseResultDto();
                resultDto.setDetail("服务器异常!请稍后再试");
                return resultDto;
            }
        };
    }
}
