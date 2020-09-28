package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@SuperBuilder
public class CommerceCardDto extends CardDto {
    /**
     * 제품에 대한 상세 설명입니다.
     * 최대 76자
     */
    @JsonProperty("description")
    private final String description;

    /**
     * 제품의 가격입니다.
     */
    @JsonProperty("price")
    private final int price;

    /**
     * 제품의 가격에 대한 통화입니다.
     * 현재 won만 가능
     */
    @JsonProperty("currency")
    private final String currency;

    /**
     * 제품의 가격에 대한 할인할 금액입니다.
     */
    @JsonProperty("discount")
    private final int discount;

    /**
     * 제품의 가격에 대한 할인율입니다.
     */
    @JsonProperty("discountRate")
    private final int discountRate;

    /**
     * 제품의 가격에 대한 할인가(할인된 가격)입니다.
     */
    @JsonProperty("discountedPrice")
    private final int discountedPrice;

    /**
     * 제품에 대한 사진입니다.
     * 현재 1개만 가능
     */
    @Builder.Default
    @JsonProperty("thumbnails")
    private final List<ThumbnailDto> thumbnails = new ArrayList<>();

    /**
     * 제품을 판매하는 프로필 정보입니다.
     */
    @JsonProperty("profile")
    private final ProfileDto profile;

    /**
     * 다양한 액션을 수행할 수 있는 버튼입니다.
     * 1개 이상, 3개 이하
     */
    @Builder.Default
    @JsonProperty("buttons")
    private final List<ButtonDto> buttons = new ArrayList<>();
}
