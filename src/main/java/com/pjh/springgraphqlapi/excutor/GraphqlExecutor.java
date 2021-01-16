package com.pjh.springgraphqlapi.excutor;

import java.util.Map;

public interface GraphqlExecutor {
    Object executeRequest(Map requestBody);
}
