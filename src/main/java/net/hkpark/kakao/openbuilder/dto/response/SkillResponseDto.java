package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * 스킬 응답은 크게 version/template/context/data 총 4가지 부분으로 구성됩니다.
 */
@Getter
@SuperBuilder
@ToString
public class SkillResponseDto {
    /**
     * 스킬 응답의 version을 나타냅니다.
     * <major-version>.<minor-version>의 모습을 갖습니다. 따라서 2.0, 2.1, 3.0과 같은 모습을 갖습니다.
     */
    @Builder.Default
    @JsonProperty("version")
    private final String version = "2.0";

    /**
     * 스킬 응답의 출력 모양을 담고 있는 항목입니다.
     * 출력으로 사용할 요소 그룹, 바로가기 응답 그룹 등을 포함합니다.
     */
    @JsonProperty("template")
    private final SkillTemplateDto template;

    /**
     * 블록의 context 설정을 제어할 수 있습니다.
     */
    @JsonProperty("context")
    private final ContextControlDto context;

    /**
     * 필요에 따라 커스텀한 데이터를 넣을 수 있는 항목입니다.
     */
    @Builder.Default
    @JsonProperty("data")
    private final Map<String, Object> data = new HashMap<>();
}
