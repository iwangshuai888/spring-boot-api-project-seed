package com.hmhub.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Leon
 * @since 2020-03-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键
     */
    private String userNo;

    /**
     * 是电话号码，也是账号（登录用）
     */
    private String mobile;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 状态值（1：启用，2：禁用，3：删除）
     */
    private Integer status;

    /**
     * 职位
     */
    private String job;


}
