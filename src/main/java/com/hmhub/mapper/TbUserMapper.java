package com.hmhub.mapper;

import com.hmhub.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author Leon
 * @since 2020-03-18
 */
@Repository
@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {

}
