package kr.ac.pcu.cyber.userservice.config;

import kr.ac.pcu.cyber.userservice.utils.CookieUtil;
import kr.ac.pcu.cyber.userservice.utils.JwtUtil;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfig {
    @Bean
    public ModelMapper modelMapper() { return new ModelMapper(); }

}
