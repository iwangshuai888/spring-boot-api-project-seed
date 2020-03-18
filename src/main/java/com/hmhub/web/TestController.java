package com.hmhub.web;

import com.hmhub.common.constants.RequestMappingConstant;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 注释
 *
 * @author WangShuai
 * @date 2020/3/18 10:28
 */
@RequiredArgsConstructor
@RestController
@Log4j2
@RequestMapping(value = RequestMappingConstant.SERVICE_TEST_PREFIX)
@Validated
public class TestController {

    @GetMapping(value = "/getTestNew")
    public Map<String, Object> getTestNew() {
        Map<String, Object> resultMap = new HashMap<>(4, 0.9F);
        resultMap.put("key", "value");
        return resultMap;
    }
}
