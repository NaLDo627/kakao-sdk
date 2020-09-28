package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@SuperBuilder
public class ContextValueDto {
    @JsonProperty("name")
    private final String name;

    @JsonProperty("lifeSpan")
    private final int lifeSpan;

    @JsonProperty("params")
    private final Map<String, String> params;
}
