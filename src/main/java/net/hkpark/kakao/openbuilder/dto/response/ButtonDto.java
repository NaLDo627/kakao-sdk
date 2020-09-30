package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@Getter
@SuperBuilder
public class ButtonDto {
    /**
     * 버튼에 적히는 문구입니다.
     * 버튼 14자(가로배열 2개 8자)
     */
    @JsonProperty("label")
    private final String label;

    /**
     * 버튼 클릭시 수행될 작업입니다.
     */
    @JsonProperty("action")
    private final String action;

    /**
     * 웹 브라우저를 열고 webLinkUrl 의 주소로 이동합니다
     */
    @JsonProperty("webLinkUrl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String webLinkUrl;

    /**
     * message: 사용자의 발화로 messageText를 내보냅니다. (바로가기 응답의 메세지 연결 기능과 동일)
     * block: 블록 연결시 사용자의 발화로 노출됩니다.
     */
    @JsonProperty("messageText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String messageText;

    /**
     * phoneNumber에 있는 번호로 전화를 겁니다.
     */
    @JsonProperty("phoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String phoneNumber;

    /**
     * blockId를 갖는 블록을 호출합니다. (바로가기 응답의 블록 연결 기능과 동일)
     */
    @JsonProperty("blockId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String blockId;

    /**
     * block이나 message action으로 블록 호출시, 스킬 서버에 추가적으로 제공하는 정보
     */
    @Builder.Default
    @JsonProperty("extra")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private final Map<String, Object> extra = new HashMap<>();
}
