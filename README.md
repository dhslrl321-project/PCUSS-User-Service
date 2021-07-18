# PCUSS-User-Service

# 디렉토리 구조



```
./
├── HELP.md
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── kr
    │   │       └── ac
    │   │           └── pcu
    │   │               └── cyber
    │   │                   └── userservice
    │   │                       ├── UserServiceApplication.java
    │   │                       ├── config
    │   │                       │   ├── ApplicationConfig.java
    │   │                       │   └── SecurityConfig.java
    │   │                       ├── controller
    │   │                       │   ├── AuthenticationController.java
    │   │                       │   ├── ExceptionControllerAdvice.java
    │   │                       │   └── UserController.java
    │   │                       ├── domain
    │   │                       │   ├── dto
    │   │                       │   │   ├── AuthResponseData.java
    │   │                       │   │   ├── ErrorResponseData.java
    │   │                       │   │   ├── ModifyRequestData.java
    │   │                       │   │   ├── RegisterRequestData.java
    │   │                       │   │   └── SilentRefreshResponseData.java
    │   │                       │   ├── entity
    │   │                       │   │   ├── Role.java
    │   │                       │   │   ├── RoleType.java
    │   │                       │   │   └── User.java
    │   │                       │   └── repository
    │   │                       │       ├── RoleRepository.java
    │   │                       │       └── UserRepository.java
    │   │                       ├── errors
    │   │                       │   ├── EmptyCookieException.java
    │   │                       │   ├── InvalidTokenException.java
    │   │                       │   ├── TokenExpiredException.java
    │   │                       │   └── UserNotFoundException.java
    │   │                       ├── filter
    │   │                       │   ├── AuthenticationErrorFilter.java
    │   │                       │   └── AuthenticationFilter.java
    │   │                       ├── security
    │   │                       │   └── CustomUserAuthentication.java
    │   │                       ├── service
    │   │                       │   ├── AuthenticationService.java
    │   │                       │   └── UserService.java
    │   │                       └── utils
    │   │                           ├── CookieUtil.java
    │   │                           ├── JwtUtil.java
    │   │                           └── TokenType.java
    │   └── resources
    │       ├── application.yml 
    │       ├── static
    │       └── templates
    └── test
        └── java
            └── kr
                └── ac
                    └── pcu
                        └── cyber
                            └── userservice
                                ├── UserServiceApplicationTests.java
                                ├── controller
                                │   ├── AuthenticationControllerTest.java
                                │   └── UserControllerTest.java
                                ├── domain
                                │   ├── entity
                                │   │   ├── RoleTest.java
                                │   │   └── UserTest.java
                                │   └── repository
                                │       ├── RoleRepositoryTest.java
                                │       └── UserRepositoryTest.java
                                ├── service
                                │   ├── AuthenticationServiceTest.java
                                │   └── UserServiceTest.java
                                └── utils
                                    ├── CookieUtilTest.java
                                    └── JwtUtilTest.java
```
