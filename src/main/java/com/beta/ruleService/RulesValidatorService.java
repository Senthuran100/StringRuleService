package com.beta.ruleService;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class RulesValidatorService {
    private final List<IStringRule> rules;

    public RulesValidatorService(){
        rules = Collections.unmodifiableList(Arrays.asList(new RuleOne(), new RuleTwo()));
    }

    public  String validateStringRule(String number, String message){
        if (number.isEmpty()){
            return "Rule Number cannot be empty";
        }

        for ( IStringRule rule : rules){
            if(rule.shouldApplyRule(number)){
                return rule.processString(message);
            }
        }
        return message;
    }
}
