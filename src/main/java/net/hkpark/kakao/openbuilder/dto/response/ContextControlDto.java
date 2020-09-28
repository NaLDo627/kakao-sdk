package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * context control 필드는 블록에서 생성한 outputContext의 lifeSpan, params 등을 제어할 수 있습니다.
 */
@Getter
@SuperBuilder
public class ContextControlDto {
    @Builder.Default
    @JsonProperty("values")
    private final List<ContextValueDto> values = new ArrayList<>();
}
