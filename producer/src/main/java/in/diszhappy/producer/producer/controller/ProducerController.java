package in.diszhappy.producer.producer.controller;

import in.diszhappy.producer.producer.service.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private ProducerService service;
    private Logger logger = LoggerFactory.getLogger(ProducerController.class);
    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String msg){
        logger.info("message is"+msg);
        return ResponseEntity.ok("Execution time in ms is :"+service.updateMessage(msg));

    }

}
