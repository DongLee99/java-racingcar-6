package racingcar.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingCarGameUtilTest {

    @Test
    @DisplayName("자동차 이름 타입 검증 성공 케이스")
    void 자동차_이름_타입_검증_성공() {
        assertThat(RacingCarGameUtil.validNameType("현대")).isTrue();
    }

    @Test
    @DisplayName("자동차 이름 타입 검증 실패 케이스")
    void 자동차_이름_타입_검증_실패() {
        assertThatThrownBy(() -> RacingCarGameUtil.validNameType(1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("잘못된 입력 값 입니다.");
    }

    @Test
    @DisplayName("자동차 이름 길이 검증 성공 케이스")
    void 자동차_이름_길이_검증_성공() {
        assertThat(RacingCarGameUtil.validNameLength("기아")).isTrue();
    }

    @Test
    @DisplayName("자동차 이름 길이 검증 실패 케이스")
    void 자동차_이름_길이_검증_실패() {
        assertThatThrownBy(() -> RacingCarGameUtil.validNameLength("기아같은현대"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("잘못된 입력 값 입니다.");
    }

    @Test
    @DisplayName("랜덤 숫자 생성 성공 케이스")
    void 랜덤_숫자_생성_성공() {
        assertThat(RacingCarGameUtil.getRandomNumber()).isBetween(0, 9);
    }
}