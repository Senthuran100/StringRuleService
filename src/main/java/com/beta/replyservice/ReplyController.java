package com.beta.replyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ReplyController {

	@Autowired
	private RuleService ruleService;

	@GetMapping("/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

	@GetMapping("/reply/{message}")
	public ReplyMessage replying(@PathVariable String message) {
		if(message.contains("-")){
			 return new ReplyMessage(ruleService.checkString(message));
		} else {
			return new ReplyMessage("Message should contain -");
		}

	}


}