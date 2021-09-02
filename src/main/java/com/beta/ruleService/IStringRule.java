package com.beta.ruleService;

public interface IStringRule {
    boolean shouldApplyRule(String number);
    String processString(String word);
}
