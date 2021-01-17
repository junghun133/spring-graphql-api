package com.pjh.springgraphqlapi.dto;

import graphql.schema.GraphQLFieldDefinition;

import java.util.List;

public interface GraphqlFields {
    List<GraphQLFieldDefinition> getQueryFields();
    List<GraphQLFieldDefinition> getMutationFields();
}
