package com.hanks.instance.pattern.service.Impl;

import com.hanks.instance.pattern.common.FruitUtil;
import com.hanks.instance.pattern.service.LevelService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 意见代表价格计算
 */
@Service("KeyOpinionLeaderImpl")
public class KeyOpinionLeaderImpl implements LevelService {
    @Override
    public String inquiry(String fruitName) {
        if (FruitUtil.APPLE.equals(fruitName)) {
            return "0.5";
        } else if (FruitUtil.BANANA.equals(fruitName)) {
            return "0.6";
        }
        //意见代表，荔枝随机立减
        if (FruitUtil.CHERRY.equals(fruitName)) {
            return String.format("%.1f", new Random().nextDouble());
        }
        return "0.7";
    }
}
