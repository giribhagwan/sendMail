package com.controller;

import com.domain.MailData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

/**
 * Created by bhagwan on 17/1/17.
 */
@RepositoryRestController
@RequestMapping("api")
public class Controller {

    @Autowired
    private SimpleMailMessage simpleMailMessage;
    @Autowired
    private MailSender mailSender;
    @Autowired
    private Logger logger;
    @RequestMapping(value = "send", method = RequestMethod.POST)
    public Callable<ResponseEntity<Map<String, Object>>> searchForFirstPageProject(@RequestBody MailData MailData) {
        return () -> {
            simpleMailMessage.setTo(MailData.getTo());
            simpleMailMessage.setText(MailData.getData());
            simpleMailMessage.setSubject(MailData.getSubject());
            mailSender.send(simpleMailMessage);
            logger.info("message send successfully");
            ResponseEntity<Map<String, Object>> resEntity;
            resEntity = new ResponseEntity("succss", HttpStatus.OK);
            return resEntity ;
        };
    }



}
