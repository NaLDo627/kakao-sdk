package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import net.hkpark.kakao.openbuilder.dto.request.BotDto;
import net.hkpark.kakao.openbuilder.dto.request.UserDto;
import net.hkpark.kakao.openbuilder.dto.request.ValueDto;

import java.util.HashMap;
import java.util.Map;

@Getter
@SuperBuilder
@ToString
public class ValidationResponseDto {
    /**
     * enum : SUCCESS|FAIL|ERROR|IGNORE
     * 현재는 SUCCESS 만 다룸.(SUCCESS - 성공, FAIL - 실패,
     *     ERROR - API 실행중 ERROR 발생, IGNORE - 그냥 이 결과를 무시)
     */
    @JsonProperty("status")
    private final String status;

    /**
     * Action 에 의해서 해석된 value
     */
    @JsonProperty("value")
    private final String value;

    /**
     * something to pass to client(API 가 Action 으로 전달하고자 하는 데이터를 담는 곳, 아직 구현되지 않음)
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("data")
    @Builder.Default
    private final Map<String, Object> data = new HashMap<>();

    /**
     * status가 FAIL일 경우 검증실패 에러 메시지
     */
    @JsonProperty("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String message;
}
