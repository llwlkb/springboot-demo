package org.crudboy.springbootdemo.http;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author crudboy
 * @email llwlkb@126.com
 */
public class ApiRes {

    static public <T> HttpEntity<T> ok(T data) {
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    static public HttpEntity<ErrorInfo> badRequest(String[] args) {
        return error(args, HttpStatus.BAD_REQUEST);
    }

    static public HttpEntity<ErrorInfo> error(String[] args, HttpStatus httpStatus) {
        return new ResponseEntity<>(new ErrorInfo(args), httpStatus);
    }
}
