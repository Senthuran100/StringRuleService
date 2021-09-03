package com.beta.ruleService;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "rule")
public class RuleConfig {

    private Map<Integer, String> stringRule;

    public Map<Integer, String> getStringRule() {
        return stringRule;
    }

    public void setStringRule(Map<Integer, String> stringRule) {
        this.stringRule = stringRule;
    }
}
