package com.wuniu.printmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yan
 */
@SpringBootApplication
public class PrintManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrintManageApplication.class, args);
    }
    // @Bean
    // GraphQLSchema schema() {
    //     return GraphQLSchema.newSchema()
    //                .query(GraphQLObjectType.newObject()
    //                           .name("query")
    //                           .field(field -> field
    //                                               .name("test")
    //                                               .type(Scalars.GraphQLString)
    //                                               .dataFetcher(environment -> "response")
    //                           )
    //                           .build())
    //                .build();
    // }

}
