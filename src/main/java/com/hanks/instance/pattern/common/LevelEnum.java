package com.hanks.instance.pattern.common;

/**
 * 会员等级枚举
 */
public enum LevelEnum {
    KEY_OPINION_LEADER("KOL", "KeyOpinionLeaderImpl"),
    SUPER_VERY_IMPORTANT_PERSON("SVIP", "SuperVIPImpl"),
    VERY_IMPORTANT_PERSON("VIP", "VIPImpl");

    private String levelName;
    private String serviceName;

    LevelEnum(String levelName, String serviceName) {
        this.levelName = levelName;
        this.serviceName = serviceName;
    }

    public String getLevelName() {
        return levelName;
    }

    public String getServiceName() {
        return serviceName;
    }

    /**
     * 通过等级名称获取输入名称
     * @param levelName
     * @return
     */
    public static String getServiceNameBylevelName(String levelName) {
        for (LevelEnum levelEnum : values()) {
            if (levelEnum.getLevelName().equals(levelName)) {
                return levelEnum.getServiceName();
            }
        }
        return null;
    }
}
