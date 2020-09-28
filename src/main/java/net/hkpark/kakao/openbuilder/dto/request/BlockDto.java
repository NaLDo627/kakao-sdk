package net.hkpark.kakao.openbuilder.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BlockDto {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;
}
