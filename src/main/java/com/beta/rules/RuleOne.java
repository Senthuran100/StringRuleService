package com.beta.rules;

import com.beta.rules.IStringRule;

public class RuleOne implements IStringRule {
    @Override
    public boolean shouldApplyRule(String number) {
        return number.equals("1");
    }

    @Override
    public String processString(String word) {
        StringBuilder input1 = new StringBuilder();
        input1.append(word);
        return input1.reverse().toString();
    }
}
