package com.hanks.instance.pattern.service.Impl;

import com.hanks.instance.pattern.service.LevelService;
import org.springframework.stereotype.Service;

/**
 * 普通会员价格计算
 */
@Service("VIPImpl")
public class VIPImpl implements LevelService {
    @Override
    public String inquiry(String fruitName) {
        return "0.8";
    }
}
