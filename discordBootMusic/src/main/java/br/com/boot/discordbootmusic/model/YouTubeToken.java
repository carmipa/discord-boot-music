package br.com.boot.discordbootmusic.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class YouTubeToken {

    private String accessToken;

    private String refreshToken;

    private LocalDateTime expiryDate;

    private String youtubeChannelId;

    public YouTubeToken() {
    }

    public YouTubeToken(String accessToken, String refreshToken, LocalDateTime expiryDate, String youtubeChannelId) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiryDate = expiryDate;
        this.youtubeChannelId = youtubeChannelId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getYoutubeChannelId() {
        return youtubeChannelId;
    }

    public void setYoutubeChannelId(String youtubeChannelId) {
        this.youtubeChannelId = youtubeChannelId;
    }

}
