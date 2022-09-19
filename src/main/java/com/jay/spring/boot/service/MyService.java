package com.jay.spring.boot.service;

import com.jay.spring.boot.config.FooProperties;

/**
 * @author xiang.wei
 * @create 2018/4/4 11:19
 */
public interface MyService {
    /**
     * 获得属性
     * @return
     */
    String getProperties();
    String getUserName();
}
