package com.pjh.springgraphqlapi.controller;

import com.pjh.springgraphqlapi.excutor.GraphqlExecutor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class GraphqlControllerImpl implements GraphqlController {
    GraphqlExecutor graphqlExecutor;

    @RequestMapping(
            path = "${com.pjh.springgraphqlapi.requestMapping.path:api/v1/graphql}",
            method = RequestMethod.POST
    )
    public Object executeOperation(@RequestBody Map body){

        log.debug("Start processing graphQL request");
        val requestResult = graphqlExecutor.executeRequest(body);

        return requestResult;
    }
}
