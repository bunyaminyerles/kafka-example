package com.byerles.producerapplication.Controller;

import com.byerles.producerapplication.Service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {

        private final ProducerService producerService;

        @RequestMapping("/send/{message}")
        public String sendMessage(@PathVariable String message) {
            producerService.sendMessage(message);
            return "Message sent to Kafka Topic";
        }
}
