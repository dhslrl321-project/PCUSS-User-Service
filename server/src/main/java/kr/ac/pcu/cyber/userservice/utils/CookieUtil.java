package kr.ac.pcu.cyber.userservice.utils;

import io.jsonwebtoken.Claims;
import kr.ac.pcu.cyber.userservice.errors.EmptyCookieException;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import java.util.Locale;

@Component
public class CookieUtil {

    private final JwtUtil jwtUtil;

    public CookieUtil(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    /**
     * 쿠키 배열로부터 토큰을 파싱한다.
     *
     * @param cookies : RequestHeader 에 getCookies() 연산 반환 값;
     * @param tokenType : access_token 인지 refresh_token 인지 Enum
     * @return userId : 사용자 UUID
     * @throws EmptyCookieException 쿠키에 refresh_token, access_token 쿠키가 없을 때,
     */
    public String getUserIdFromCookies(Cookie[] cookies, TokenType tokenType) {

        String cookieName;

        if(tokenType.equals(TokenType.ACCESS_TOKEN)) {
            cookieName = TokenType.ACCESS_TOKEN.toString().toLowerCase();
        }else if(tokenType.equals(TokenType.REFRESH_TOKEN)) {
            cookieName = TokenType.REFRESH_TOKEN.toString().toLowerCase();
        }else {
            cookieName = "empty";
        }

        for(Cookie cookie : cookies) {
            if(cookie.getName().equals(cookieName)) {
                String token = cookie.getValue();
                Claims claims = jwtUtil.parseToken(token);

                return claims.get("userId", String.class);
            }
        }

        throw new EmptyCookieException();
    }

}
