package com.hmhub.service;

import com.hmhub.entity.TbJoke;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 区域表 服务类
 * </p>
 *
 * @author Leon
 * @since 2020-03-18
 */
public interface ITbJokeService extends IService<TbJoke> {

    void updateJoke();
}
