package com.dev.auth.webSocket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatEvent {
    private String username;
    private String groupId;
    private EventType eventType;
    private long timestamp;
}
