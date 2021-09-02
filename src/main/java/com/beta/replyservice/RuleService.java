package com.beta.replyservice;

import com.beta.ruleService.RulesValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RuleService {
    @Autowired
    private RulesValidatorService rulesValidatorService;

    public String processedString;

    public String checkString(String message){
        String[] parts = message.split("-");
        String partOneString = parts[0];
        String partTwoString = parts[1];
        processedString = partTwoString;
        for (int i = 0; i < partOneString.length(); i++){
            char c = partOneString.charAt(i);
            processedString = rulesValidatorService.validateStringRule(Character.toString(c),processedString);
        }
        return processedString;
    }

//    public boolean checkRuleNumberExsist(string rule){
//
//    }
}
