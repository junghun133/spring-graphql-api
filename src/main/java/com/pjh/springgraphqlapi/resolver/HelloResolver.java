package com.pjh.springgraphqlapi.resolver;

import com.pjh.springgraphqlapi.model.Hello;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class HelloResolver implements GraphQLQueryResolver {

    public Hello getHello(String title){
        return new Hello("first", "hello world");
    }
}
