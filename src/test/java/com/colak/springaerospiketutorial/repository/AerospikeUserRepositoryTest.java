package com.colak.springaerospiketutorial.repository;

import com.colak.springaerospiketutorial.model.User;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AerospikeUserRepositoryTest {

    @Autowired
    AerospikeUserRepository repository;

    @Test
    @Order(1)
    void findById() {
        int id = 1;
        User user = new User(id, "John", "m@abc.com", 48);
        repository.save(user);

        assertThat(repository.findById(id)).hasValue(user);
    }

    @Test
    @Order(2)
    void deleteUser() {
        int id = 1;
        repository.deleteById(1);

        assertThat(repository.existsById(id)).isFalse();
    }
}
