package com.educative.pubsubtemplatedemo;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "pubsubOutputChannel")
public interface OutboundMessagingGateway {
	void sendToPubsub(String text);
}