package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class SimpleImageDto {
    @JsonProperty("imageUrl")
    private final String imageUrl;

    @JsonProperty("altText")
    private final String altText;
}
