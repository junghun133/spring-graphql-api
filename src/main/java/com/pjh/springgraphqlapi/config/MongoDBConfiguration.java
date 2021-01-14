package com.pjh.springgraphqlapi.config;

import com.pjh.springgraphqlapi.dao.BadKeywordRepository;
import com.pjh.springgraphqlapi.document.BadKeyword;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = {BadKeywordRepository.class})
@Configuration
public class MongoDBConfiguration {

   /* @Bean
    CommandLineRunner commandLineRunner(BadKeywordRepository badKeywordRepository){
        return strings -> {
            badKeywordRepository.save(new BadKeyword(1, "나쁜말", 0));
            badKeywordRepository.save(new BadKeyword(2, "나쁜말2", 1));
        };
    }*/
}
