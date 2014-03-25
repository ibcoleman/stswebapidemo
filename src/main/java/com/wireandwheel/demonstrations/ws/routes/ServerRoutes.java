package com.wireandwheel.demonstrations.ws.routes;

import com.wireandwheel.demonstrations.ws.model.BitcoinPrice;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by icoleman on 3/23/2014.
 */
public class ServerRoutes extends RouteBuilder
{
    private static final Log log = LogFactory.getLog(ServerRoutes.class);

    @Override
    public void configure() throws Exception
    {
        Processor aProcessor = new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception
            {
                exchange.setPattern(ExchangePattern.InOut);
                Message message = exchange.getIn();
                message.setHeader(Exchange.HTTP_METHOD, "GET");
                message.setHeader(Exchange.HTTP_PATH, "/currentprice.json");
                message.setHeader(CxfConstants.CAMEL_CXF_RS_RESPONSE_CLASS, BitcoinPrice.class);
                //message.getBody();
                BitcoinPrice price = (BitcoinPrice)exchange.getOut().getBody();

            }
        };

        //TWO OPTIONS:
        /**
         * 1) Just declare the endpoint as "http://etc...."
         * 2) End the first route and start the second route from cxfrs
         */

        from("timer:aTimer?fixedRate=true&period=10s")
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                .to("http4://api.wmata.com/Bus.svc/json/jRoutes?api_key=kfgpmgvfgacx98de9q3xazww")
                .unmarshal("json")
                .to("bean:itemRetriever")
                .to("log:com.wireandwheel.demonstrations?level=INFO")
                .process(aProcessor);

    }

}
