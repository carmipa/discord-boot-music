package br.com.boot.discordbootmusic.model;

public class UserAccount {

    private DiscordUser user;

    private YouTubeToken tokenData;

    public UserAccount() {
    }

    public UserAccount(DiscordUser user, YouTubeToken tokenData) {
        this.user = user;
        this.tokenData = tokenData;
    }

    public DiscordUser getUser() {
        return user;
    }

    public void setUser(DiscordUser user) {
        this.user = user;
    }

    public YouTubeToken getTokenData() {
        return tokenData;
    }

    public void setTokenData(YouTubeToken tokenData) {
        this.tokenData = tokenData;
    }
}
