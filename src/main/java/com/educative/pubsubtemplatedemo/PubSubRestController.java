package com.educative.pubsubtemplatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubSubRestController {

	@Autowired
	OutboundMessagingGateway outboundMessagingGateway;
	
	@GetMapping("/publish")
	public String publishMessage(@RequestParam(value="message", required=true) String message) {
		outboundMessagingGateway.sendToPubsub(message);
		return "Message published into the Google Cloud Pub/Sub topic";
	}
	
}
