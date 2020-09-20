package com.hanks.instance.pattern.factory;

import com.hanks.instance.pattern.common.LevelEnum;
import com.hanks.instance.pattern.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 会员等级简单工厂
 */
@Service
public class LevelStrategyFactory {
    @Autowired
    private Map<String, LevelService> levelServiceMap = new ConcurrentHashMap<>();

    public LevelService getServiceByLevel(String level) {
        String serviceName = LevelEnum.getServiceNameBylevelName(level);
        if (Objects.isNull(serviceName)) {
            return null;
        }

        return levelServiceMap.get(serviceName);
    }
}
