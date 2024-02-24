package com.colak.springaerospiketutorial.repository;


import com.colak.springaerospiketutorial.model.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.data.repository.CrudRepository;

public interface AerospikeUserRepository extends AerospikeRepository<User, Integer>, CrudRepository<User, Integer> {
}
