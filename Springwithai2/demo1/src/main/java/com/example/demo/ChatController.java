package com.example.demo;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatModel chatModel;

    public ChatController(ChatModel chatModel){
        this.chatModel = chatModel;
    }
    @GetMapping("/")
    public String prompt(@RequestParam String m){
        return chatModel.call(m);
    }
}
