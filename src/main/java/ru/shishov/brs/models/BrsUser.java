package ru.shishov.brs.models;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "BRSUser")
public class BrsUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "bot_user_id")
    private Long botUserId;
    @Column(name = "bot_user_name")
    private String botUserName;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public BrsUser() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getBotUserId() {
        return botUserId;
    }

    public void setBotUserId(Long botUserId) {
        this.botUserId = botUserId;
    }

    public String getBotUserName() {
        return botUserName;
    }

    public void setBotUserName(String botUserName) {
        this.botUserName = botUserName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
