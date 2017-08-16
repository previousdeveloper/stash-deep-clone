package com.trendyol.marketplace.transaction.management.api.client.configuration;


import com.trendyol.spring.boot.trendyol.client.starter.configuration.RestTemplateErrorHandler;
import com.trendyol.spring.boot.trendyol.client.starter.interceptor.RestTemplateCorrelationIdInterceptor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = "com.trendyol.marketplace.transaction.management.api.client")
public class TransactionManagementClientConfiguration {

    @Bean
    public RestTemplate transactionManagementApiClient() {
        return new RestTemplateBuilder()
                .errorHandler(new RestTemplateErrorHandler())
                .interceptors(new RestTemplateCorrelationIdInterceptor())
                .build();
    }

}
