package com.hanks.instance.pattern.service.Impl;

import com.hanks.instance.pattern.common.FruitUtil;
import com.hanks.instance.pattern.service.LevelService;
import org.springframework.stereotype.Service;

/**
 * 超级会员价格计算
 */
@Service("SuperVIPImpl")
public class SuperVIPImpl implements LevelService {
    @Override
    public String inquiry(String fruitName) {
        if (FruitUtil.APPLE.equals(fruitName) || FruitUtil.BANANA.equals(fruitName)) {
            return "0.6";
        }
        return "0.7";
    }
}
