//package com.email.app;
//
//import jakarta.annotation.PostConstruct;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/email")
//@AllArgsConstructor
//public class EmailGeneratorController {
//
//
//    private final EmailGeneratorService emailGeneratorService;
//
//    @PostMapping("/generate")
//    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
//        String response = emailGeneratorService.generateEmailReply(emailRequest);
//        return ResponseEntity.ok(response   );
//    }
//
//    @GetMapping("/test")
//    public String testEndpoint() {
//        return "Controller is active!";
//    }
//
//
//}
