package com.pjh.springgraphqlapi.resource;

import com.pjh.springgraphqlapi.dto.FindBKResponse;
import com.pjh.springgraphqlapi.service.BKService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/bk")
@RestController
public class BKResource {

    @Autowired
    BKService bkService;

    @PostMapping(value = "/all")
    public ResponseEntity<List<FindBKResponse>> getAllBadKeywords(@RequestBody String query){
        ExecutionResult executionResult = bkService.getGraphQL().execute(query);

        List<FindBKResponse> responses = executionResult.getData();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }
}
