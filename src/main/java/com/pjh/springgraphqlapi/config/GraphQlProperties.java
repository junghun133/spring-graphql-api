package com.pjh.springgraphqlapi.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
public class GraphQlProperties {

    @Getter
    @Setter
    private String rootQueryName = "queries";

    @Getter
    @Setter
    private String rootQueryDescription = "";

    @Getter
    @Setter
    private String rootMutationName = "mutations";

    @Getter
    @Setter
    private String rootMutationDescription = "";

}
