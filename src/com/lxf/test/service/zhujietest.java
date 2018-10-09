package com.lxf.test.service;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class zhujietest implements Retention {
    @Override
    public RetentionPolicy value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
