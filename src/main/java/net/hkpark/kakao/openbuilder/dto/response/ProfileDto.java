package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ProfileDto {
    /**
     * 프로필 이름
     */
    @JsonProperty("nickname")
    private final String nickname;

    /**
     * 프로필 이미지
     */
    @JsonProperty("imageUrl")
    private final String imageUrl;
}
