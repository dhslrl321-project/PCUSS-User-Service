# 구현 목록

- [x] 의존성 추가
- [x] yml 파일 작성
- [ ] api 작성
- [ ] ControllerAdvice 생성
- [ ] auth controller 작업
- [ ] user controller 작업
- [ ] Test Coverage 100% 

# my todo

- [ ] UserNotFoundException 테스트
- [ ] AuthService login 메서드에 jwt 추가

# 기능

- 사용자 회원가입
- 사용자 로그인
- Silent-Refresh
- 로그아웃
- 닉네임, 프로필 수정
- 회원 탈퇴

# controller

- controller advice
    - UserNotFoundException
    - InvalidTokenException
    - ExpiredTokenException
- auth controller
    - **로그인** GET : login/{UUID}
    - **회원가입** POST : register
    - **로그아웃** POST : logout
    - **Silent-Refresh** GET : silent-refresh
- user controller
    - **사용자 정보 변경** PATCH : users/{user_id}
    - **회원 탈퇴** DELETE : users/{user_id}

### 사용자 회원가입

body 로 들어온 email, nickname, profile_url 을 받아서 회원 저장 후 해당 회원의 UUID, access_token, refresh_token 반환

### 사용자 로그인

path var 로 들어온 UUID 에 따라서 access_token, refresh_token 문자열 반환

### Silent-Refresh

request cookie 의 refresh_token 

### 로그아웃

user 의 unregisteredAt 에 추가

### 닉네임, 프로필 수정

request cookie 의 access-token 이 valid 하고 파싱한 UUID 값이 동일할 때 수정 가능, 그 이외에는 403

### 회원 탈퇴

request cookie 의 access-token 이 valid 하고 파싱한 UUID 값이 동일할 때 탈퇴 가능, 그 이외에는 403


# 인지 사항

- 현재 포트는 90000 번으로 Random port 로 지정해야 함 