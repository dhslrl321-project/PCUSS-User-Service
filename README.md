# PCUSS-User-Service

# 디렉토리 구조



```
./
├── HELP.md
├── README.md
├── build
│   ├── bootJarMainClassName
│   ├── classes
│   │   └── java
│   │       ├── main
│   │       │   └── kr
│   │       │       └── ac
│   │       │           └── pcu
│   │       │               └── cyber
│   │       │                   └── userservice
│   │       │                       ├── UserServiceApplication.class
│   │       │                       ├── config
│   │       │                       │   ├── ApplicationConfig.class
│   │       │                       │   └── SecurityConfig.class
│   │       │                       ├── controller
│   │       │                       │   ├── AuthenticationController.class
│   │       │                       │   ├── ExceptionControllerAdvice.class
│   │       │                       │   └── UserController.class
│   │       │                       ├── domain
│   │       │                       │   ├── dto
│   │       │                       │   │   ├── AuthResponseData$AuthResponseDataBuilder.class
│   │       │                       │   │   ├── AuthResponseData.class
│   │       │                       │   │   ├── ErrorResponseData.class
│   │       │                       │   │   ├── ModifyRequestData$ModifyRequestDataBuilder.class
│   │       │                       │   │   ├── ModifyRequestData.class
│   │       │                       │   │   ├── RegisterRequestData$RegisterRequestDataBuilder.class
│   │       │                       │   │   ├── RegisterRequestData.class
│   │       │                       │   │   ├── SilentRefreshResponseData$SilentRefreshResponseDataBuilder.class
│   │       │                       │   │   └── SilentRefreshResponseData.class
│   │       │                       │   ├── entity
│   │       │                       │   │   ├── Role.class
│   │       │                       │   │   ├── RoleType.class
│   │       │                       │   │   ├── User$UserBuilder.class
│   │       │                       │   │   └── User.class
│   │       │                       │   └── repository
│   │       │                       │       ├── RoleRepository.class
│   │       │                       │       └── UserRepository.class
│   │       │                       ├── errors
│   │       │                       │   ├── EmptyCookieException.class
│   │       │                       │   ├── InvalidTokenException.class
│   │       │                       │   ├── TokenExpiredException.class
│   │       │                       │   └── UserNotFoundException.class
│   │       │                       ├── filter
│   │       │                       │   ├── AuthenticationErrorFilter.class
│   │       │                       │   └── AuthenticationFilter.class
│   │       │                       ├── security
│   │       │                       │   └── CustomUserAuthentication.class
│   │       │                       ├── service
│   │       │                       │   ├── AuthenticationService.class
│   │       │                       │   └── UserService.class
│   │       │                       └── utils
│   │       │                           ├── CookieUtil.class
│   │       │                           ├── JwtUtil.class
│   │       │                           └── TokenType.class
│   │       └── test
│   │           └── kr
│   │               └── ac
│   │                   └── pcu
│   │                       └── cyber
│   │                           └── userservice
│   │                               ├── UserServiceApplicationTests.class
│   │                               ├── controller
│   │                               │   ├── AuthenticationControllerTest.class
│   │                               │   └── UserControllerTest.class
│   │                               ├── domain
│   │                               │   ├── entity
│   │                               │   │   ├── RoleTest.class
│   │                               │   │   └── UserTest.class
│   │                               │   └── repository
│   │                               │       ├── RoleRepositoryTest.class
│   │                               │       └── UserRepositoryTest.class
│   │                               ├── service
│   │                               │   ├── AuthenticationServiceTest.class
│   │                               │   └── UserServiceTest.class
│   │                               └── utils
│   │                                   ├── CookieUtilTest.class
│   │                                   └── JwtUtilTest.class
│   ├── generated
│   │   └── sources
│   │       ├── annotationProcessor
│   │       │   └── java
│   │       │       ├── main
│   │       │       └── test
│   │       └── headers
│   │           └── java
│   │               ├── main
│   │               └── test
│   ├── libs
│   │   ├── user-service-0.0.1-plain.jar
│   │   └── user-service-0.0.1.jar
│   ├── reports
│   │   └── tests
│   │       └── test
│   │           ├── classes
│   │           │   └── kr.ac.pcu.cyber.userservice.controller.UserControllerTest.html
│   │           ├── css
│   │           │   ├── base-style.css
│   │           │   └── style.css
│   │           ├── index.html
│   │           ├── js
│   │           │   └── report.js
│   │           └── packages
│   │               └── kr.ac.pcu.cyber.userservice.controller.html
│   ├── resources
│   │   └── main
│   │       ├── application.yml
│   │       ├── static
│   │       └── templates
│   ├── test-results
│   │   └── test
│   │       ├── TEST-kr.ac.pcu.cyber.userservice.controller.UserControllerTest.xml
│   │       └── binary
│   │           ├── output.bin
│   │           ├── output.bin.idx
│   │           └── results.bin
│   └── tmp
│       ├── bootJar
│       │   └── MANIFEST.MF
│       ├── compileJava
│       │   └── source-classes-mapping.txt
│       ├── compileTestJava
│       │   └── source-classes-mapping.txt
│       ├── jar
│       │   └── MANIFEST.MF
│       └── test
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
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
