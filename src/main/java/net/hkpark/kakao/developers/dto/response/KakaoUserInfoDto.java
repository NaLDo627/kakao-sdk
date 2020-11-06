package net.hkpark.kakao.developers.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@NoArgsConstructor
public class KakaoUserInfoDto {
    /**
     * 회원번호
     */
    @JsonProperty("id")
    private long id;

    /**
     * 카카오계정 정보
     */
    @JsonProperty("kakao_account")
    private KakaoAccountDto kakaoAccount;

    /**
     * 카카오싱크 간편가입을 통해 로그인한 시각, UTC
     */
    @JsonProperty("synched_at")
    private String synchedAt;

    /**
     * 서비스에 연결 완료된 시각, UTC
     */
    @JsonProperty("connected_at")
    private String connectedAt;

    /**
     * 추가 정보
     */
    @JsonProperty("properties")
    private Map<String, Object> refreshTokenExpiresIn;
}
