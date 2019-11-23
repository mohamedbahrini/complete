package com.training.complete.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebSocketChatMessage {
    private String type;
    private String content;
    private String sender;
}
