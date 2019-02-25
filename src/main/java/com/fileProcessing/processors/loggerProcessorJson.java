package com.fileProcessing.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class loggerProcessorJson implements Processor{
	final static Logger log = Logger.getLogger(loggerProcessorJson.class);
			
	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("Country JSON: " + exchange.getIn().getHeader("countryJson", String.class));
		log.info("OrderId JSON: " + exchange.getIn().getHeader("orderIdJson", String.class));
		log.info("Provider JSON: " + exchange.getIn().getHeader("providerJson", String.class));
		log.info("FileName JSON: " + exchange.getIn().getHeader("fileNameJson", String.class));
	}
}
