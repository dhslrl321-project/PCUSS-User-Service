package kr.ac.pcu.cyber.userservice.service;

import kr.ac.pcu.cyber.userservice.domain.dto.LoginResponseData;
import kr.ac.pcu.cyber.userservice.domain.entity.User;
import kr.ac.pcu.cyber.userservice.domain.repository.UserRepository;
import kr.ac.pcu.cyber.userservice.errors.UserNotFoundException;
import kr.ac.pcu.cyber.userservice.utils.JwtUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class AuthenticationServiceTest {

    private static final Long USER_ID = 1004L;
    private static final String NICKNAME = "james";
    private static final String SECRET = "12345678901234567890123456789012";
    private static final String VALID_UUID = "2f48f241-9d64-4d16-bf56-70b9d4e0e79a";
    private static final String INVALID_UUID = "3d87cc41-i5d6-7da0-5bbf-0e7b9d4e9a70";
    private static final String EMAIL = "james123@gmail.com";
    private static final String PROFILE_URL = "https://cdn.kakao.com/images/james";

    private AuthenticationService authenticationService;

    private final UserRepository userRepository = mock(UserRepository.class);

    @BeforeEach
    void setUp() {
        ModelMapper modelMapper = new ModelMapper();

        JwtUtil jwtUtil = new JwtUtil(SECRET);
        authenticationService = new AuthenticationService(modelMapper, userRepository, jwtUtil);

        User user = User.builder()
                .id(USER_ID)
                .nickname(NICKNAME)
                .email(EMAIL)
                .profileUrl(PROFILE_URL)
                .UUID(VALID_UUID)
                .build();

        given(userRepository.findByUUID(VALID_UUID)).willReturn(Optional.of(user));
        given(userRepository.findByUUID(INVALID_UUID)).willReturn(Optional.empty());

    }

    @Test
    @DisplayName("login 테스트")
    void login_valid() {
        LoginResponseData loginResponseData = authenticationService.login(VALID_UUID);

        assertEquals(loginResponseData.getNickname(), NICKNAME);
        assertNotEquals(loginResponseData.getAccessToken(), "");
    }

    @Test
    @DisplayName("login 존재하지 않는 uuid")
    void login_invalid_uuid() {
        UserNotFoundException exception = assertThrows(
                UserNotFoundException.class,
                () -> authenticationService.login(INVALID_UUID)
        );
        assertNotNull(exception.getMessage());
    }
}