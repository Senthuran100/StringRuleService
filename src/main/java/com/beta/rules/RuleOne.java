package com.beta.ruleService;

import com.beta.ruleService.IStringRule;

public class RuleOne implements IStringRule {
    @Override
    public boolean shouldApplyRule(String number) {
        return number.equals("1");
    }

    @Override
    public String processString(String word) {
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(word);

        // reverse StringBuilder input1
        return input1.reverse().toString();

    }
}
