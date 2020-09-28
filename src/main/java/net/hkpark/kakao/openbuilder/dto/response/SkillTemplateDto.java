package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class SkillTemplateDto {
    /**
     * <strong>outputs (출력 그룹)</strong>
     * 출력 그룹(outputs)은 여러 종류의 출력 요소(component)를 포함합니다.
     * 이를 통하여 종류가 다르거나 구분해야 할 필요가 있는 콘텐츠를 여러 출력 요소로 나눠서 표현할 수 있습니다. 출력 요소는 텍스트, 음성, 주소, 카드형 등 다양한 모습을 갖습니다.
     */
    @JsonProperty("outputs")
    List<ComponentDto> outputs;

    @JsonProperty("quickReplies")
    List<QuickReplyDto> quickReplies;
}
