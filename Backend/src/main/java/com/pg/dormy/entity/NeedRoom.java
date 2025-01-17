package com.pg.dormy.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "need_room")
public class NeedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Integer roomId;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User userData;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "room_city", nullable = false, length = 100)
    private String roomCity;

    @Column(name = "location", nullable = false, length = 100)
    private String location;

    @Column(name = "room_area")
    private String roomArea;

    @Column(name = "room_type", nullable = false, length = 50)
    private String roomType;

    @Column(name = "rent", nullable = false, precision = 10, scale = 2)
    private BigDecimal rent;

    @Column(name = "looking_for", nullable = false, length = 100)
    private String lookingFor;

    @Column(name = "self_highlights", columnDefinition = "TEXT")
    private String selfHighlights;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "mobile_no_visibility")
    private Boolean mobileNoVisibility;

    // Getters and setters

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public User getUserData() {
        return userData;
    }

    public void setUserData(User userData) {
        this.userData = userData;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRoomCity() {
        return roomCity;
    }

    public void setRoomCity(String roomCity) {
        this.roomCity = roomCity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(String roomArea) {
        this.roomArea = roomArea;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getRent() {
        return rent;
    }

    public void setRent(BigDecimal rent) {
        this.rent = rent;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }

    public String getSelfHighlights() {
        return selfHighlights;
    }

    public void setSelfHighlights(String selfHighlights) {
        this.selfHighlights = selfHighlights;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getMobileNoVisibility() {
        return mobileNoVisibility;
    }

    public void setMobileNoVisibility(Boolean mobileNoVisibility) {
        this.mobileNoVisibility = mobileNoVisibility;
    }
}
