package com.hmhub.utils;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.MapUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Map;
import java.util.TreeMap;

/**
 * 注释
 *
 * @author WangShuai
 * @date 2020/3/18 13:45
 */
@Data
@Log4j2
@Component
@RequiredArgsConstructor
@ConfigurationProperties("jingdong")
public class RequestUtils {
    private String jokeUrl;
    private String appKey;

    private final RestTemplate restTemplate;

    public JSONObject executeRequest(String url, Map<String, Object> params) {
        url = url + "?appkey=" + appKey + "&page=" + MapUtils.getInteger(params, "page")
                + "&maxResult=" + MapUtils.getInteger(params, "maxResult");
        //params.put("appkey", appKey);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAcceptCharset(Lists.newArrayList(StandardCharsets.UTF_8));
        headers.setAccept(Lists.newArrayList(MediaType.APPLICATION_JSON));
        //HttpEntity<String> httpEntity = new HttpEntity<>(JSONObject.toJSONString(params), headers);
        ResponseEntity<JSONObject> result = restTemplate.exchange(url, HttpMethod.GET, null, JSONObject.class);
        return result.getBody();
    }

}
