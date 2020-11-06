package net.hkpark.kakao.developers.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * 카카오 로그인 사용 시 필수 또는 선택으로 설정 가능합니다.
 */
@Getter
@SuperBuilder
public class ProfileDto {
    /**
     * 닉네임
     */
    @JsonProperty("nickname")
    private final String nickname;

    /**
     * 	프로필 이미지 URL, 640px * 640px 또는 480px * 480px
     */
    @JsonProperty("profile_image")
    private final String profileImage;

    /**
     * 프로필 미리보기 이미지 URL, 110px * 110px 또는 100px * 100px
     */
    @JsonProperty("thumbnail_image_url")
    private final String thumbnailImageUrl;

    /**
     * 사용자 동의 시 프로필 제공 가능
     */
    @JsonProperty("profile_needs_agreement")
    private final boolean profileNeedsAgreement;
}
