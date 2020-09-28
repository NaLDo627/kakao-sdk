package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class ListCardDto {
    /**
     * 카드의 상단 항목
     */
    @JsonProperty("header")
    private final ListItemDto header;

    /**
     * 카드의 각각 아이템
     * 최대 5개
     */
    @JsonProperty("items")
    private final List<ListItemDto> items;

    /**
     * 최대 2개
     */
    @JsonProperty("buttons")
    private final List<ButtonDto> buttons;
}
