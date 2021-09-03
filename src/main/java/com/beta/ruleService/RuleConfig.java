package com.beta.ruleService;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "rule")
public class RuleConfig {
    public static String ruleNotValid = "RULE IS NOT VALID";
    private Map<String, String> stringRule;

    public Map<String, String> getStringRule() {
        return stringRule;
    }

    public void setStringRule(Map<String, String> stringRule) {
        this.stringRule = stringRule;
    }
}
