package com.hmhub.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiehao
 * @date 2019-07-25
 */
@Data
public class MessageConvert<T> implements Serializable {
    private static final long serialVersionUID = -529441887658646467L;

    private Long code;
    private String message;
    private T data;
}
