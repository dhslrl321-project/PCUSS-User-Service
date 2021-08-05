# PCUSS-User-Service

# 디렉토리 구조



```
./
├── HELP.md
├── README.md
└── src
    ├── main
    │   ├── java.kr.ac.pcu.cyber
    │   │         │
    │   │         └── userservice
    │   │             ├── UserServiceApplication.java // Application 시작점
    │   │             │
    │   │             ├── config // Security 및 Boot 설정 디렉토리
    │   │             │   ├── ApplicationConfig.java 
    │   │             │   └── SecurityConfig.java 
    │   │             │  
    │   │             ├── controller // API Endpoints
    │   │             │   ├── AuthenticationController.java
    │   │             │   ├── ExceptionControllerAdvice.java
    │   │             │   └── UserController.java
    │   │             │
    │   │             ├── domain // Data
    │   │             │   ├── dto // 네트워크 통신에서 사용될 객체
    │   │             │   │   ├── AuthResponseData.java
    │   │             │   │   ├── ErrorResponseData.java
    │   │             │   │   ├── ModifyRequestData.java
    │   │             │   │   ├── RegisterRequestData.java
    │   │             │   │   └── SilentRefreshResponseData.java
    │   │             │   ├── entity  // Spring Data JPA Entity
    │   │             │   │   ├── Role.java
    │   │             │   │   ├── RoleType.java
    │   │             │   │   └── User.java
    │   │             │   └── repository // Spring Data JPA Ifs
    │   │             │       ├── RoleRepository.java
    │   │             │       └── UserRepository.java
    │   │             │
    │   │             ├── errors  // 커스텀 Errors
    │   │             │   ├── EmptyCookieException.java
    │   │             │   ├── InvalidTokenException.java
    │   │             │   ├── TokenExpiredException.java
    │   │             │   └── UserNotFoundException.java
    │   │             │    
    │   │             ├── filter  // Security 에서 사용될 토큰 관련 Filter
    │   │             │   ├── AuthenticationErrorFilter.java
    │   │             │   └── AuthenticationFilter.java
    │   │             │
    │   │             ├── security // Authentication 객체
    │   │             │   └── CustomUserAuthentication.java
    │   │             │
    │   │             ├── service // Business Logic
    │   │             │   ├── AuthenticationService.java
    │   │             │   └── UserService.java
    │   │             │
    │   │             └── utils // 토큰 파싱 관련 객체들
    │   │                 ├── CookieUtil.java
    │   │                 ├── JwtUtil.java
    │   │                 └── TokenType.java
    │   └── resources
    │       ├── application.yml // Application Environments Properties
    │       ├── static
    │       └── templates
    │
    │
    └── test // 테스트 코드
        └── java.kr.ac.pcu.cyber
            └── userservice
                │
                ├── UserServiceApplicationTests.java
                │
                ├── controller
                │   ├── AuthenticationControllerTest.java
                │   └── UserControllerTest.java
                │
                ├── domain
                │   ├── entity
                │   │   ├── RoleTest.java
                │   │   └── UserTest.java
                │   └── repository
                │       ├── RoleRepositoryTest.java
                │       └── UserRepositoryTest.java
                │
                ├── service
                │   ├── AuthenticationServiceTest.java
                │   └── UserServiceTest.java
                │
                └── utils
                    ├── CookieUtilTest.java
                    └── JwtUtilTest.java
```
