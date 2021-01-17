package com.pjh.springgraphqlapi.excutor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

import java.util.Map;

@ConditionalOnMissingBean //스프링 부트 프로젝트 상에서 동명의 스프링 빈이 정의되었을 시에는 쓰지 않고 그 스프링 빈을 쓰며 만약 없을 시에는 자동 등록한 빈을 쓰게 끔 유도하는 용도
@Slf4j
@Component
public class GraphqlExecutorImpl implements GraphqlExecutor {

    @Override
    public Object executeRequest(Map requestBody) {
        return null;
    }
}
