package com.practice.ussd.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ussd_session_tbl")
public class UssdSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "session_id")
    private String sessionId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "current_menu")
    private String currentMenu;

    @Column(name = "language")
    private String language;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "last_interaction_time")
    private LocalDateTime lastInteractionTime;
    
}
