package net.hkpark.kakao.developers.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@NoArgsConstructor
public class KakaoAccountDto {
    /**
     * 프로필 정보
     */
    @JsonProperty("profile")
    private ProfileDto profile;

    /**
     * 카카오계정 대표 이메일
     * 기본적으로 선택 항목 설정이 가능하고, 비즈 앱은 검수 없이 필수 또는 선택 동의 항목으로 설정 가능합니다.
     * 사용자의 카카오계정 이메일이 없을 수 있습니다. 이 경우, 카카오계정 정보를 통한 수집(수집 후 제공) 옵션을 쓰거나 자체 수집해야 합니다.
     * 카카오계정 이메일이 인증 받지 않은 이메일일 수 있습니다. 인증 받은 이메일만 사용해야 하는 서비스라면 인증 여부를 확인 후, 미인증 이메일 사용자에게 자체적으로 인증 절차를 진행해야 합니다.
     * 카카오계정의 이메일 정보는 사용자 요청에 따라 변경될 수 있습니다. 이러한 이유로 이메일을 ID로 삼거나 동일 사용자를 확인하는 방식을 권장하지 않습니다.
     */
    @JsonProperty("email")
    private String email;

    /**
     * 사용자 동의 시 이메일 제공 가능
     */
    @JsonProperty("email_needs_agreement")
    private boolean emailNeedsAgreement;

    /**
     * 이메일이 다른 카카오계정에 사용돼 만료되었다면 무효(false)
     */
    @JsonProperty("is_email_valid")
    private boolean isEmailValid;

    /**
     * 이메일 인증 여부
     */
    @JsonProperty("is_email_verified")
    private boolean isEmailVerified;

    /**
     * 연령대
     * 기본적으로 선택 항목 설정이 가능하고, 필수 동의 항목으로 설정하려면 카카오 for 비즈니스 권한 검수를 거쳐야 합니다.
     * 한국 나이 기준입니다.
     */
    @JsonProperty("age_range")
    private String ageRange;

    /**
     * 사용자 동의 시 연령대 제공 가능
     */
    @JsonProperty("age_range_needs_agreement")
    private boolean ageRangeNeedsAgreement;

    /**
     * 생일, MMDD 형식
     * 기본적으로 선택 항목 설정이 가능하고, 필수 동의 항목으로 설정하려면 카카오 for 비즈니스 동의항목 권한 검수를 거쳐야 합니다.
     */
    @JsonProperty("birthday")
    private String birthday;

    /**
     * 사용자 동의 시 생일 제공 가능
     */
    @JsonProperty("birthday_needs_agreement")
    private boolean birthdayNeedsAgreement;

    /**
     * 생일 양력/음력 구분, 양력(SOLAR)/음력(LUNAR)
     */
    @JsonProperty("birthday_type")
    private String birthdayType;

    /**
     * 태어난 해, YYYY 형식
     * 기본 제공되지 않습니다.
     * 비즈 앱은 카카오 for 비즈니스에서 하나 이상의 비즈니스 채널을 연결하면 별도 검수 없이 선택 동의항목으로 설정 가능합니다.
     * 필수 동의 항목으로 설정하려면 카카오 for 비즈니스 동의항목 권한 검수를 거쳐야 합니다.
     */
    @JsonProperty("birthyear")
    private String birthyear;

    /**
     * 사용자 동의 시 태어난 해 제공 가능
     */
    @JsonProperty("birthyear_needs_agreement")
    private boolean birthyearNeedsAgreement;

    /**
     * 성별, female/male
     * 기본적으로 선택 항목 설정이 가능하고, 필수 동의 항목으로 설정하려면 카카오 for 비즈니스 동의항목 권한 검수를 거쳐야 합니다.
     */
    @JsonProperty("gender")
    private String gender;

    /**
     * 사용자 동의 시 성별 제공 가능
     */
    @JsonProperty("gender_needs_agreement")
    private boolean genderNeedsAgreement;

    /**
     * 전화번호, +00 00-0000-0000 또는 +00 00 0000 0000 형식, 국가마다 하이픈(-) 위치나 값 다를 수 있음
     * 기본 제공되지 않습니다.
     * 비즈 앱은 카카오 for 비즈니스에서 하나 이상의 비즈니스 채널을 연결하면 별도 검수 없이 필수 또는 선택 동의 항목으로 설정 가능합니다.
     * 전화번호는 수집 후 제공 설정이 불가능합니다.
     * 카카오계정에 연결된 카카오톡의 전화번호입니다. 연계정보(CI) 생성 시 사용된 전화번호와 무관합니다.
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * 사용자 동의 시 전화번호 제공 가능
     */
    @JsonProperty("phone_number_needs_agreement")
    private boolean phoneNumberNeedsAgreement;

    /**
     * 연계정보
     * 기본 제공되지 않습니다.
     * 카카오 for 비즈니스 동의 항목 권한 검수를 거쳐야 필수 또는 선택 동의 항목으로 사용할 수 있습니다.
     * 기존 회원 데이터베이스에 동일한 회원이 있는지 대조하는 등 최소한의 목적으로만 참고해야 합니다.
     * 카카오는 본인인증기관이 아닙니다. 카카오계정의 연계정보로 서비스에 필요한 본인 인증을 대신할 수 없습니다.
     */
    @JsonProperty("ci")
    private String ci;

    /**
     * 사용자 동의 시 CI 참고 가능
     */
    @JsonProperty("ci_needs_agreement")
    private boolean ciNeedsAgreement;

    /**
     * 본인인증기관이 CI를 발급한 시각, UTC
     */
    @JsonProperty("ci_authenticated_at")
    private String ciAuthenticatedAt;
}
