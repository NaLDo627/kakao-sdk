package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@SuperBuilder
public class BasicCardDto extends CardDto {
    /**
     * 	카드의 제목입니다.
     * 	최대 2줄
     */
    @JsonProperty("title")
    private final String title;

    /**
     * 카드에 대한 상세 설명입니다.
     * 최대 230자
     */
    @JsonProperty("description")
    private final String description;

    /**
     * 카드의 상단 이미지입니다. (필수)
     */
    @JsonProperty("thumbnail") @NonNull
    private final ThumbnailDto thumbnail;

    /**
     * 카드의 프로필 정보입니다.
     * 현재 미 지원
     */
    @JsonProperty("profile")
    private final ProfileDto profile;

    /**
     * 카드의 소셜 정보입니다.
     * 현재 미 지원
     */
    @JsonProperty("social")
    private final SocialDto social;

    /**
     * 카드의 버튼들을 포함합니다.
     * 최대 3개
     */
    @Builder.Default
    @JsonProperty("buttons")
    private final List<ButtonDto> buttons = new ArrayList<>();
}
