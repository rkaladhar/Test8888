package com.nt.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

@RestController
public class GitWebHookController {

    @PostMapping("/github-webhook")
    public ResponseEntity<String> handleWebhook(@RequestBody String payload) {
        System.out.println("Webhook payload: " + payload);
        return ResponseEntity.ok("Webhook received");
    }
}
