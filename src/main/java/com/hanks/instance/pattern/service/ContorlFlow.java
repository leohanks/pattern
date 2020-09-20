package com.hanks.instance.pattern.service;

public interface ContorlFlow {
    /**
     * 不适用模式实现询价
     * @param fruitName 水果名
     * @return
     */
    String inquiryWithOutPattern(String fruitName, String level);

    /**
     * 使用模式实现询价
     * @param fruitName 水果名
     * @return
     */
    String inquiryWithPattern(String fruitName, String level);
}
