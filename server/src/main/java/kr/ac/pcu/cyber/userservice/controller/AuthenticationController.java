package kr.ac.pcu.cyber.userservice.controller;

import kr.ac.pcu.cyber.userservice.domain.dto.AuthResponseData;
import kr.ac.pcu.cyber.userservice.domain.dto.RegisterRequestData;
import kr.ac.pcu.cyber.userservice.service.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/auth", produces = "application/json; charset=utf-8")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/login/{uuid}")
    public ResponseEntity<AuthResponseData> login(@PathVariable String uuid) {
        return ResponseEntity.ok(authenticationService.login(uuid));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponseData> register(@RequestBody RegisterRequestData registerRequestData) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authenticationService.register(registerRequestData));
    }
}
