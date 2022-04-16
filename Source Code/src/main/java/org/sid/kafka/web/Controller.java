package org.sid.kafka.web;

import org.sid.kafka.entities.pageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class Controller {
    @Autowired
    private StreamBridge streamBridge;

    @GetMapping("/publish/{topic}/{name}")
    public pageEvent publish(@PathVariable String topic, @PathVariable String name) {
        pageEvent pEvent = new pageEvent(name,
                Math.random() > 0.5 ? "U1" : "U2",
                new Date(),
                new Random().nextInt());
        streamBridge.send(topic, pEvent);
        return pEvent;
    }
}
