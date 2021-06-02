package kr.ac.pcu.cyber.userservice.utils;

import kr.ac.pcu.cyber.userservice.errors.EmptyCookieException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.Cookie;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CookieUtilTest {

    private CookieUtil cookieUtil;

    private static final String SECRET = "12345678901234567890123456789012";

    private static final String USER_ID = "2f48f241-9d64-4d16-bf56-70b9d4e0e79a";

    private static final String VALID_TOKEN = "eyJhbGciOiJIUzI1NiJ9." +
            "eyJ1c2VySWQiOiIyZjQ4ZjI0MS05ZDY0LTRkMTYtYmY1Ni03MGI5ZDRlMGU3OWEifQ." +
            "diJ35TNZtRqYIkkiUZX0JC0IQ_Yia8c5p8FDd_FMgYo";

    @BeforeEach
    void setUp() {
        cookieUtil = new CookieUtil(new JwtUtil(SECRET));
    }

    @Test
    @DisplayName("getUserIdFromToken - 정상 access 토큰")
    void getUserIdFromToken_valid_access() {

        Cookie cookie1 = new Cookie("no", "null");
        Cookie cookie2 = new Cookie("access_token", VALID_TOKEN);

        Cookie[] cookies = { cookie1, cookie2 };

        String userId = cookieUtil.getUserIdFromCookies(cookies, TokenType.ACCESS_TOKEN);

        assertEquals(userId, USER_ID);
    }

    @Test
    @DisplayName("getUserIdFromToken - 정상 refresh 토큰")
    void getUserIdFromToken_valid_refresh() {

        Cookie cookie1 = new Cookie("no", "null");
        Cookie cookie2 = new Cookie("refresh_token", VALID_TOKEN);

        Cookie[] cookies = { cookie1, cookie2 };

        String userId = cookieUtil.getUserIdFromCookies(cookies, TokenType.REFRESH_TOKEN);

        assertEquals(userId, USER_ID);
    }

    @Test
    @DisplayName("getUserIdFromToken - 실패 - 토큰 없음")
    void getUserIdFromToken_invalid_empty_cookie() {
        Cookie cookie1 = new Cookie("no", "null");
        Cookie cookie2 = new Cookie("fresh_token", VALID_TOKEN);

        Cookie[] cookies = { cookie1, cookie2 };

        EmptyCookieException exception = assertThrows(EmptyCookieException.class,
                () -> cookieUtil.getUserIdFromCookies(cookies, TokenType.REFRESH_TOKEN)
        );

        assertNotNull(exception);
    }

    @Test
    @DisplayName("")
    void () {
        
    }

}