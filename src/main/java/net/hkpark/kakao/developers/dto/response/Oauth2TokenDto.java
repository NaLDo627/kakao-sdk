package net.hkpark.kakao.developers.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Oauth2TokenDto {
    @JsonProperty("token_type")
    private final String tokenType;

    @JsonProperty("access_token")
    private final String accessToken;

    @JsonProperty("expires_in")
    private final Integer expiresIn;

    @JsonProperty("refresh_token")
    private final String refreshToken;

    @JsonProperty("refresh_token_expires_in")
    private final Integer refreshTokenExpiresIn;

    @JsonProperty("scope")
    private final String scope;
}
