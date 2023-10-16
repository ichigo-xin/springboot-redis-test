package com.example.redistest.config;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.codec.StringCodec;
import io.lettuce.core.masterreplica.MasterReplica;
import io.lettuce.core.masterreplica.StatefulRedisMasterReplicaConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

import java.util.Arrays;
import java.util.List;

import static io.lettuce.core.ReadFrom.REPLICA_PREFERRED;

@Configuration
class WriteToMasterReadFromReplicaConfiguration {

//  @Bean
//  public LettuceConnectionFactory redisConnectionFactory() {
//
//    LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
//      .readFrom(REPLICA_PREFERRED)
//      .build();
//
//    RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration("192.168.80.130", 6379);
//
//
//    return new LettuceConnectionFactory(serverConfig, clientConfig);
//  }
}