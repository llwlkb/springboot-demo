package org.crudboy.springbootdemo.http;

import lombok.Getter;

/**
 * @author crudboy
 * @email llwlkb@126.com
 */
@Getter
public class ErrorInfo {
    private String code;
    private String info;

    public ErrorInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public ErrorInfo(String[] args) {
        this.code = args[0];
        this.info = args[1];
    }
}
