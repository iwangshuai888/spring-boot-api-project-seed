package com.hmhub.common.configurer;

import com.hmhub.common.returnhandler.ResponseBodyWrapFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注释
 *
 * @author WangShuai
 * @date 2020/3/18 10:25
 */
@Configuration
public class ReturnMessageHandlerAutoConfig {

    @Bean
    public ResponseBodyWrapFactoryBean getResponseBodyWrap() {
        return new ResponseBodyWrapFactoryBean();
    }
}
