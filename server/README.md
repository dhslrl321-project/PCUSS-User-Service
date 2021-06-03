# 구현 목록

- [x] 의존성 추가
- [x] yml 파일 작성
- [x] api 작성
- [x] ControllerAdvice 생성
- [x] auth controller 작업
- [ ] user controller 작업
- [ ] Test Coverage 80%

# my todo

- [x] UserNotFoundException 테스트
- [x] AuthService login 메서드에 jwt 추가
- [ ] security 추가 (filter 추가, httpSecurity, authentication 추가)
- [ ] 로그아웃 구현
- [ ] Role Endpoint 추가

# 기능

- 사용자 회원가입
- 사용자 로그인
- Silent-Refresh
  - refresh_token 쿠키에 존재하는 토큰 파싱 -> access_token 만료 -> 새로운 access_token 생성 후 ResponseEntity 반환
- 로그아웃
- Role -> RoleRepository -> SecurityService -> SecurityController
  - 쿠키로부터 토큰 파싱 : `String parseTokenStringFromCookies(Cookie[] cookies, TokenType tokenType);`
    - TokenType.ACCESS_TOKEN
    - TokenType.REFRESH_TOKEN
  - 로그아웃에 사용될 요청의 쿠키 제거 `Dto RemoveTokenFromCookies();`
- 사용자
  - 닉네임, 프로필 수정
  - 회원 탈퇴
  - 파싱된 토큰의 소유자가 가지고 있는 Roles `List<Role> getRolesFromUserId(String userId);`

# controller

- controller advice
    - UserNotFoundException
    - InvalidTokenException
    - TokenExpiredException
    - EmptyTokenException
- auth controller
    - **로그인** GET : login/{UUID}
    - **회원가입** POST : register
    - **로그아웃** POST : logout
    - **Silent-Refresh** GET : silent-refresh
- user controller
    - **사용자 정보 변경** PATCH : users/{user_id}
    - **회원 탈퇴** DELETE : users/{user_id}

# 인지 사항

- 현재 포트는 90000 번으로 Random port 로 지정해야 함
- 존재하는 사용자가 회원가입을 할 때 처리도 필요할듯