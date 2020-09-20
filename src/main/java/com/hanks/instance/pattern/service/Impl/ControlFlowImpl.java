package com.hanks.instance.pattern.service.Impl;

import com.hanks.instance.pattern.common.FruitUtil;
import com.hanks.instance.pattern.common.LevelEnum;
import com.hanks.instance.pattern.factory.LevelStrategyFactory;
import com.hanks.instance.pattern.service.ContorlFlow;
import com.hanks.instance.pattern.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Random;

@Service
public class ControlFlowImpl implements ContorlFlow {
    @Autowired
    private LevelStrategyFactory levelStrategyFactory;

    @Override
    public String inquiryWithOutPattern(String fruitName, String level) {
        if (LevelEnum.KEY_OPINION_LEADER.getLevelName()
                .equals(level)) {
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
        } else if (LevelEnum.SUPER_VERY_IMPORTANT_PERSON.getLevelName()
                .equals(level)) {
            if (FruitUtil.APPLE.equals(fruitName) || FruitUtil.BANANA.equals(fruitName)) {
                return "0.6";
            }
            return "0.8";
        } else if (LevelEnum.VERY_IMPORTANT_PERSON.getLevelName()
                .equals(level)) {
            return "0.8";
        }
        return "1.0";
    }

    @Override
    public String inquiryWithPattern(String fruitName, String level) {
        LevelService levelService = levelStrategyFactory.getServiceByLevel(level);
        if (Objects.isNull(levelService)) {
            return "1.0";
        }
        return levelService.inquiry(fruitName);
    }
}
