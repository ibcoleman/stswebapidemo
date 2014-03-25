package com.wireandwheel.demonstrations.ws.processors;

import com.wireandwheel.demonstrations.ws.model.BitcoinPrice;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by icoleman on 3/23/2014.
 */
public class ItemRetriever implements Processor
{
    private static final Log log = LogFactory.getLog(ItemRetriever.class);

    @Override
    public void process(Exchange exchange) throws Exception
    {
        exchange.setPattern(ExchangePattern.InOut);
        Message message = exchange.getIn();
        Object o = message.getBody();
    }
}
