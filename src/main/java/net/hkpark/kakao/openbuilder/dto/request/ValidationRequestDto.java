package net.hkpark.kakao.openbuilder.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@NoArgsConstructor
@ToString
public class ValidationRequestDto {
    @JsonProperty("bot")
    private BotDto bot;

    @JsonProperty("utterance")
    private String utterance;

    @JsonProperty("params")
    private Map<String, Object> params;

    @JsonProperty("isInSlotFilling")
    private boolean isInSlotFilling;

    @JsonProperty("user")
    private UserDto user;

    @JsonProperty("value")
    private ValueDto value;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("lang")
    private String lang;
}
