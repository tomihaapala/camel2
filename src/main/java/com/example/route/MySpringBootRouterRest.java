package com.example;

import java.util.Arrays;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 */
@Controller
@Component
public class MySpringBootRouterRest extends RouteBuilder {

    public Train[] trains = new Train[500];

    @Override
    public void configure() {

        restConfiguration()
                // .component("servlet")
                .bindingMode(RestBindingMode.auto);
        /*
        from("timer://test?period=10000")
                .setHeader(Exchange.HTTP_METHOD, simple("GET"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .setHeader(Exchange.CONTENT_ENCODING, constant("gzip"))
                .to("https://rata.digitraffic.fi/api/v1/train-locations/latest")
                .process(new Processor() {
         */
        rest("/harkka/")
                .post("test").type(Train[].class)
                .route()
                .to("log:mylogger?showAll=true")
                .process(new Processor() {

                    @Override
                    public void process(Exchange exchange) throws Exception {

                        trains = exchange.getMessage().getBody(Train[].class);

                    }
                })
                .transform(simple("POST onnistui"))
                .endRest();

    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("trains", Arrays.asList(trains));
        return "index";
    }
}
