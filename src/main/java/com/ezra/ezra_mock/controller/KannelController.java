package com.ezra.ezra_mock.controller;

import com.ezra.ezra_mock.models.AcsResponse;
import com.ezra.ezra_mock.models.ResponseDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "acs")
    public ResponseEntity<AcsResponse> checkEligibility(@RequestParam String sub, @RequestParam String txnid, @RequestParam String src){
        log.info("REQUEST COMING IN: {} {} {}",sub, txnid,src);
        AcsResponse acsResponse = new AcsResponse();
        ResponseDetails responseDetails =  new ResponseDetails();
        responseDetails.setInLoanBalance(200);
        responseDetails.setLoanBalance(200);
        responseDetails.setMaxLoanable(200);
        responseDetails.setMaxQualified(200);
        responseDetails.setQueueCount(0);
        acsResponse.setResponse(responseDetails);
        acsResponse.setCode(0);
        acsResponse.setErrorMessage("success");
        log.info("RESPONSE {}", acsResponse);
        return new ResponseEntity<>(acsResponse,HttpStatus.OK);
    }
}
