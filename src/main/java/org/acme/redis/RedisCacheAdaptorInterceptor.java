package org.acme.redis;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lombok.extern.slf4j.Slf4j;
import org.acme.model.Cat;

import java.util.ArrayList;


@Slf4j
@Priority(0)
@Interceptor
@RedisCacheAdaptor
public class RedisCacheAdaptorInterceptor {

    //private Class<?> clazz;

    @AroundInvoke
    public Object intercept(final InvocationContext invocationContext) throws Throwable {

        Object proceed = invocationContext.proceed();
        ArrayList<Cat> newCats = new ArrayList<>();


        return newCats;
    }

}
