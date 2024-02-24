package com.colak.springaerospiketutorial.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "aerospike")

@Getter
@Setter
public class AerospikeConfigurationProperties {
    private String host;
    private int port;
    private String namespace;
}
