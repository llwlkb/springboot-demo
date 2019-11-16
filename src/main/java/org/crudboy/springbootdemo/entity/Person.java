package org.crudboy.springbootdemo.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author crudboy
 * @email llwlkb@126.com
 */
@Data
@Builder
public class Person {
    private String name;
    private String pwd;
}
