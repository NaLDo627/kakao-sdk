package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * 아래 중 한 가지 데이터만 사용하여 응답
 */
@Getter
@SuperBuilder
public class ComponentDto {
    /**
     * 간단 텍스트
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("simpleText")
    private final SimpleTextDto simpleText;

    /**
     * 간단 이미지
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("simpleImage")
    private final SimpleImageDto simpleImage;

    /**
     * 기본 카드
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("basicCard")
    private final BasicCardDto basicCard;

    /**
     * 커머스 카드
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("commerceCard")
    private final CommerceCardDto commerceCard;

    /**
     * 리스트 카드
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("listCard")
    private final ListCardDto listCard;

    /**
     * 커머스 카드
     */
    @JsonProperty("carousel")
    private final CarouselDto carousel;
}
