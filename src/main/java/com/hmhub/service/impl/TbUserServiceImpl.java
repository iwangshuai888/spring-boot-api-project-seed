package com.hmhub.service.impl;

import com.hmhub.entity.TbUser;
import com.hmhub.mapper.TbUserMapper;
import com.hmhub.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Leon
 * @since 2020-03-18
 */
@Service
@Log4j2
@RequiredArgsConstructor
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
