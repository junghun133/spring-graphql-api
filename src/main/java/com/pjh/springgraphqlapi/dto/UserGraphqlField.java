package com.pjh.springgraphqlapi.dto;

import graphql.schema.GraphQLFieldDefinition;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserGraphqlField implements GraphqlFields{

    @Override
    public List<GraphQLFieldDefinition> getQueryFields() {
        return null;
    }

    @Override
    public List<GraphQLFieldDefinition> getMutationFields() {
        return null;
    }
}
