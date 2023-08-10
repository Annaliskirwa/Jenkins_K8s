package com.ezra.ezra_mock.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kannel/v1/")
@Slf4j
public class KannelController {
    @GetMapping(value = "send")
    public ResponseEntity<String> sendSms(@RequestParam String user, @RequestParam String pass, @RequestParam String from,
                                     @RequestParam String to, @RequestParam String text, @RequestParam Integer mclass){
        log.info("The request parameters are user {} pass {} from {} to {} body {} mclass {}", user, pass, from, to, text, mclass);
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }
}
