package org.crudboy.springbootdemo.mvc;

import lombok.extern.slf4j.Slf4j;
import org.crudboy.springbootdemo.entity.Person;
import org.crudboy.springbootdemo.http.ApiRes;
import org.crudboy.springbootdemo.http.Errors;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author crudboy
 * @email llwlkb@126.com
 */
@Slf4j
@RestController
@RequestMapping("mvc")
public class MvcController {
    @GetMapping("ok")
    public HttpEntity testResponseOk() {
        Person person = Person.builder().name("p1").pwd("123").build();
        return ApiRes.ok(person);
    }

    @GetMapping("err")
    public HttpEntity testResponse400() {
        return ApiRes.badRequest(Errors.badRequest);
    }
}
