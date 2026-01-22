package br.com.boot.discordbootmusic.model;

import java.util.Objects;

public class DiscordUser {

    private String discordUserId;

    public DiscordUser() {
    }

    public DiscordUser(String discordUserId) {
        this.discordUserId = discordUserId;
    }

    public String getDiscordUserId() {
        return discordUserId;
    }

    public void setDiscordUserId(String discordUserId) {
        this.discordUserId = discordUserId;
    }

}
