package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ListItemDto {
    /**
     * header에 들어가는 경우, listCard의 제목이 됩니다.
     * items에 들어가는 경우, 해당 항목의 제목이 됩니다.
     */
    @JsonProperty("title")
    private final String title;

    /**
     * header에 들어가는 경우, 아무런 작동을 하지 않습니다.
     * items에 들어가는 경우, 해당 항목의 설명이 됩니다.
     */
    @JsonProperty("description")
    private final String description;

    /**
     * header에 들어가는 경우, listCard 제목의 배경이 됩니다.
     * items에 들어가는 경우, 해당 항목의 우측 안내 사진이 됩니다.
     */
    @JsonProperty("imageUrl")
    private final String imageUrl;

    /**
     * 	클릭시 작동하는 링크입니다.
     */
    @JsonProperty("link")
    private final LinkDto link;
}
