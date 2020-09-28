package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@SuperBuilder
public class CarouselDto {
    /**
     * 케로셀의 타입입니다.
     * basicCard 혹은 commerceCard
     */
    @JsonProperty("type")
    private final String type;

    /**
     * 케로셀 아이템입니다.
     * 최대 10개
     */
    @Builder.Default
    @JsonProperty("items")
    private final List<? extends CardDto> items = new ArrayList<>();

    /**
     * 케로셀의 커버를 제공합니다.
     * CommerceCard 만 지원하고 있습니다. 추후 BasicCard 도 지원할 예정입니다.
     */
    @JsonProperty("header")
    private final CarouselHeaderDto header;
}
