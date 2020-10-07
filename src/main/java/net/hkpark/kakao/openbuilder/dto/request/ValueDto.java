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
public class ValueDto {
    /**
     * original value
     */
    @JsonProperty("origin")
    private String origin;

    /**
     * resolved value(by AIU or etc.)
     */
    @JsonProperty("resolved")
    private String resolved;
}
