package kr.ac.pcu.cyber.userservice.errors;

public class EmptyTokenException extends RuntimeException {
    public EmptyTokenException(String token) {
        super("[" + token + "] 이 비어있거나 공백입니다.");
    }
}
