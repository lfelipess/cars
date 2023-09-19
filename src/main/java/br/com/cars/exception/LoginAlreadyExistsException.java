package br.com.cars.exception;

import br.com.cars.exception.config.ApiException;
import org.springframework.http.HttpStatus;

public class LoginAlreadyExistsException extends ApiException {

    public LoginAlreadyExistsException(String message){
        super(message, 3, HttpStatus.BAD_REQUEST);
    }
}
