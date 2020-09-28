package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@Getter
@SuperBuilder
public class ContextValueDto {
    @JsonProperty("name")
    private final String name;

    @JsonProperty("lifeSpan")
    private final int lifeSpan;

    @Builder.Default
    @JsonProperty("params")
    private final Map<String, String> params = new HashMap<>();
}
