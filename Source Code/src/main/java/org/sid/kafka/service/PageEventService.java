package org.sid.kafka.service;

import org.sid.kafka.entities.pageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Service
public class PageEventService {
    @Bean
    public Consumer<pageEvent> pageEventConsumer() {
        return (input) -> {
            System.out.println("***************");
            System.out.println(input.toString());
            System.out.println("***************");
        };
    }

    @Bean
    public Supplier<pageEvent> pageEventSupplier() {
        return ()-> new pageEvent("S1", "U1", new Date(), 5000);
    }
}
