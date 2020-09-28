package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class CarouselHeaderDto {
    /**
     * 케로셀 헤드 제목
     * 최대 2줄
     * (한 줄에 들어갈 수 있는 글자 수는 기기에 따라 달라집니다.)
     */
    @JsonProperty("title")
    private final String title;

    /**
     * 케로셀 헤드 설명
     * 최대 3줄
     * (한 줄에 들어갈 수 있는 글자 수는 기기에 따라 달라집니다.)
     */
    @JsonProperty("description")
    private final String description;

    /**
     * 케로셀 헤드 배경 이미지
     * 현재 imageUrl 값만 지원합니다.
     */
    @JsonProperty("thumbnail")
    private final ThumbnailDto thumbnail;
}
