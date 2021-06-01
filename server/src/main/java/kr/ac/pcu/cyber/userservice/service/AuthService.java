package kr.ac.pcu.cyber.userservice.service;

import kr.ac.pcu.cyber.userservice.domain.dto.LoginResponseData;
import kr.ac.pcu.cyber.userservice.domain.entity.User;
import kr.ac.pcu.cyber.userservice.domain.repository.UserRepository;
import kr.ac.pcu.cyber.userservice.errors.UserNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public AuthService(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
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

        // jwt 추가
        responseData.complete("", "");

        return responseData;
    }
}
