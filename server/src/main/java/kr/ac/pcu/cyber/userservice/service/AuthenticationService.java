package kr.ac.pcu.cyber.userservice.service;

import kr.ac.pcu.cyber.userservice.domain.dto.LoginResponseData;
import kr.ac.pcu.cyber.userservice.domain.entity.User;
import kr.ac.pcu.cyber.userservice.domain.repository.UserRepository;
import kr.ac.pcu.cyber.userservice.errors.UserNotFoundException;
import kr.ac.pcu.cyber.userservice.utils.JwtUtil;
import kr.ac.pcu.cyber.userservice.utils.TokenType;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public AuthenticationService(ModelMapper modelMapper, UserRepository userRepository, JwtUtil jwtUtil) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    /**
     * uuid 로 사용자 정보를 반환한다.
     *
     * @param uuid Auth 서버로 부터 넘어온 사용자 uuid
     * @return accessToken, refreshToken, nickname, profileUrl 데이터
     * @throws UserNotFoundException
     */
    public LoginResponseData login(String uuid) {

        User user = userRepository.findByUUID(uuid).orElseThrow(() -> new UserNotFoundException(uuid));

        LoginResponseData responseData = modelMapper.map(user, LoginResponseData.class);

        String accessToken = jwtUtil.generateToken(uuid, TokenType.ACCESS_TOKEN);
        String refreshToken = jwtUtil.generateToken(uuid, TokenType.REFRESH_TOKEN);

        responseData.complete(accessToken, refreshToken);

        return responseData;
    }

}
