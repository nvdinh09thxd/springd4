package edu.vinaenter.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping("message")
	@ResponseBody
	public String message() {
		return messageSource.getMessage("message", null, Locale.getDefault());
	}

}
