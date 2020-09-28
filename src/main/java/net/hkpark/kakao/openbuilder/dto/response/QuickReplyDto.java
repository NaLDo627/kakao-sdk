package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * 바로가기 응답은 발화와 동일합니다. 대신, 사용자가 직접 발화를 입력하지 않아도 선택을 통해서 발화를 전달하거나 다른 블록을 호출할 수 있습니다.
 */
@Getter
@SuperBuilder
public class QuickReplyDto {
    /**
     *  사용자에게 노출될 바로가기 응답의 표시
     */
    @JsonProperty("label")
    private final String label;

    /**
     * 바로가기 응답의 기능
     * 'message' 혹은 'block'
     */
    @JsonProperty("action")
    private final String action;

    /**
     * 사용자 측으로 노출될 발화
     */
    @JsonProperty("messageText")
    private final String messageText;

    /**
     * 바로가기 응답이 '블록연결' 기능일 때, 연결될 블록의 id
     * action이 'block'일 때, 필수값
     */
    @JsonProperty("blockId")
    private final String blockId;

    /**
     * 블록을 호출 시 추가적으로 제공하는 정보
     */
    @JsonProperty("extra")
    private final Object extra;
}
