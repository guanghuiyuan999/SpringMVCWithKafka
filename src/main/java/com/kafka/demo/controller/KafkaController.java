package com.kafka.demo.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/kafka")
public class KafkaController {

	private static final Logger logger = LoggerFactory.getLogger(KafkaController.class);


	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;

	@RequestMapping("/test2")
	public String test2(){
		int i = 0;
		while (i < 10) {
			kafkaTemplate.sendDefault(i, "haha" + i);
			i++;
		}

		return "index";
	}
}
