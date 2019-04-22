package com.tlong.oss.api.client;

import com.tlong.oss.api.OssApi;
import com.tlong.oss.api.client.fallback.OssClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "OSS-CLIENT", path = "/api/oss", fallbackFactory = OssClientFallbackFactory.class)
public interface OssClient extends OssApi {
}
