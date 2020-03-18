package com.hmhub.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 区域表
 * </p>
 *
 * @author Leon
 * @since 2020-03-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_joke")
public class TbJoke extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String customerId;

    /**
     * 标题
     */
    private String title;

    /**
     * 英文名称
     */
    private String img;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
