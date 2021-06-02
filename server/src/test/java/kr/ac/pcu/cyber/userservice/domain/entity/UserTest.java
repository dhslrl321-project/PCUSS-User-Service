package kr.ac.pcu.cyber.userservice.domain.entity;

import kr.ac.pcu.cyber.userservice.domain.dto.RegisterRequestData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User();

    @Test
    @DisplayName("register")
    void register() {
        // given
        String nickname = "james";

        RegisterRequestData registerRequestData = RegisterRequestData.builder()
                .nickname(nickname)
                .email("jame102@gmail.com")
                .profileUrl("https://cdn.kakao.com/sf")
                .build();

        // when
        user.enroll(registerRequestData);

        // then
        assertEquals(user.getNickname(), nickname);
        assertNotNull(user.getUserId());
    }

}