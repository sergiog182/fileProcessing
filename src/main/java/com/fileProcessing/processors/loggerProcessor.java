package com.fileProcessing.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class loggerProcessor implements Processor{
	final static Logger log = Logger.getLogger(loggerProcessor.class);
			
	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("Country: " + exchange.getIn().getHeader("country", String.class));
		log.info("OrderId: " + exchange.getIn().getHeader("orderId", String.class));
		log.info("Provider: " + exchange.getIn().getHeader("provider", String.class));
		log.info("FileName: " + exchange.getIn().getHeader("fileName", String.class));
	}
}
