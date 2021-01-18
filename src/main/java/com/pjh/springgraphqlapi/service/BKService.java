package com.pjh.springgraphqlapi.service;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Service
public class BKService {
    final
    BKMongoMongoDaoImpl bkMongoMongoDao;

    public BKService(BKMongoMongoDaoImpl bkMongoMongoDao) {
        this.bkMongoMongoDao = bkMongoMongoDao;
    }

    @Value("classpath:badkeyword.graphql")
    Resource resource;

    private GraphQL graphQL;

    // load schema at application start up
    @PostConstruct
    private void loadSchema() throws IOException {

        //Load Books into the Book Repository
        loadDataIntoHSQL();

        // get the schema
        File schemaFile = resource.getFile();
        // parse schema
        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWiring();
        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeRegistry, wiring);
        graphQL = GraphQL.newGraphQL(schema).build();
    }

    private void loadDataIntoHSQL() {
/*
        Stream.of(
           //
        ).forEach(keyword -> {
            bkMongoMongoDao.save(keyword);
        });*/
    }

    private RuntimeWiring buildRuntimeWiring() {
        return null;
    }

}
