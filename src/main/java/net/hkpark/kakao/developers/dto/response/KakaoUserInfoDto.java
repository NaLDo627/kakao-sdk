package net.hkpark.kakao.developers.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@SuperBuilder
public class KakaoUserInfoDto {
    /**
     * 회원번호
     */
    @JsonProperty("id")
    private final long id;

    /**
     * 카카오계정 정보
     */
    @JsonProperty("kakao_account")
    private final KakaoAccountDto kakaoAccount;

    /**
     * 카카오싱크 간편가입을 통해 로그인한 시각, UTC
     */
    @JsonProperty("synched_at")
    private final String synchedAt;

    /**
     * 서비스에 연결 완료된 시각, UTC
     */
    @JsonProperty("connected_at")
    private final String connectedAt;

    /**
     * 추가 정보
     */
    @JsonProperty("properties")
    private final Map<String, Object> refreshTokenExpiresIn;
}
