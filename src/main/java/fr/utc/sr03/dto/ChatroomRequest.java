package fr.utc.sr03.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ChatroomRequest {
    private int id;
    private String channel;
    private String description;
    private LocalDateTime date;
    private int lifespan;
    private List<Integer> userIds;
    private List<UsersDTO> usersDTO;
    private int idInvit;

    // Constructeurs
    public ChatroomRequest() {}

    public ChatroomRequest(String channel, String description, LocalDateTime date, int lifespan, List<Integer> userIds) {
        this.channel = channel;
        this.description = description;
        this.date = date;
        this.lifespan = lifespan;
        this.userIds = userIds;
    }

    // Getters & Setters
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public int getIdInvit() {
        return idInvit;
    }

    public void setIdInvit(int idInvit) {
        this.idInvit = idInvit;
    }

    public List<UsersDTO> getUsersDTO() {
        return usersDTO;
    }

    public void setUsersDTO(List<UsersDTO> usersDTO) {
        this.usersDTO = usersDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
