package com.hmhub.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.hmhub.common.ServiceException;
import com.hmhub.common.error.CommonErrorCodeEnum;
import com.hmhub.entity.TbJoke;
import com.hmhub.mapper.TbJokeMapper;
import com.hmhub.service.ITbJokeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hmhub.utils.RequestUtils;
import jdk.nashorn.internal.scripts.JS;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * <p>
 * 区域表 服务实现类
 * </p>
 *
 * @author Leon
 * @since 2020-03-18
 */
@Log4j2
@Service
@RequiredArgsConstructor
public class TbJokeServiceImpl extends ServiceImpl<TbJokeMapper, TbJoke> implements ITbJokeService {

    private final RequestUtils requestUtils;

    @Override
    public void updateJoke() {
        for (int page = 1; page < 470; page++) {
            Map<String, Object> resultMap = new HashMap<>(8, 0.9F);
            resultMap.put("page", page);
            resultMap.put("maxResult", 20);
            JSONObject bodyJson = requestUtils.executeRequest(requestUtils.getJokeUrl(), resultMap);
            JSONObject resultJson = bodyJson.getJSONObject("result");
            if (0 != resultJson.getInteger("showapi_res_code")) {
                throw new ServiceException(CommonErrorCodeEnum.ERROR_10005);
            }
            JSONObject dataJson = resultJson.getJSONObject("showapi_res_body");
            List<TbJoke> jokeList = Lists.newArrayList();
            dataJson.getJSONArray("contentlist").forEach(content -> {
                if (Objects.nonNull(content)) {
                    JSONObject contentJson = JSONObject.parseObject(content.toString());
                    TbJoke tbJoke = new TbJoke();
                    tbJoke.setCustomerId(MapUtils.getString(contentJson, "id"));
                    tbJoke.setImg(MapUtils.getString(contentJson, "img"));
                    tbJoke.setTitle(MapUtils.getString(contentJson, "title"));
                    jokeList.add(tbJoke);
                }
            });
            if (CollectionUtils.isNotEmpty(jokeList)) {
                this.saveBatch(jokeList);
            }
        }
    }
}
