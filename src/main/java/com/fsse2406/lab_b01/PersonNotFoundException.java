package com.fsse2406.lab_b01;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "NOT FOUND")
public class PersonNotFoundException extends RuntimeException{
}
