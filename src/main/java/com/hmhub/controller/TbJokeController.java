package com.hmhub.controller;


import com.hmhub.common.constants.RequestMappingConstant;
import com.hmhub.service.ITbJokeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 区域表 前端控制器
 * </p>
 *
 * @author Leon
 * @since 2020-03-18
 */
@RequiredArgsConstructor
@RestController
@Log4j2
@RequestMapping(value = RequestMappingConstant.SERVICE_TEST_PREFIX)
@Validated
public class TbJokeController {

    private final ITbJokeService iTbJokeService;

    @GetMapping(value = "/findJoke")
    public Map<String, Object> findJoke() {
        Map<String, Object> resultMap = new HashMap<>(4, 0.9F);
        resultMap.put("key", "value");
        return resultMap;
    }

    @GetMapping(value = "/updateJoke")
    public void updateJoke() {
        iTbJokeService.updateJoke();
    }
}