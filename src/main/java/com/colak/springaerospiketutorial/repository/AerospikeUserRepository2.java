package com.colak.springaerospiketutorial.repository;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Bin;
import com.aerospike.client.Key;
import com.aerospike.client.policy.WritePolicy;
import com.colak.springaerospiketutorial.model.User;
import com.oracle.svm.core.annotate.Inject;
import org.springframework.stereotype.Component;

@Component
public class AerospikeUserRepository2 {

    @Inject
    private AerospikeClient aerospikeClient;

    public void save(User user) {
        WritePolicy writePolicy = new WritePolicy();
        writePolicy.expiration = 5 * 60; // 5 minutes

        Key key = new Key("test", "set1", "abc");
        Bin bin1 = new Bin("bin", "abc-value");
        aerospikeClient.put(writePolicy, key, bin1);

    }
}
