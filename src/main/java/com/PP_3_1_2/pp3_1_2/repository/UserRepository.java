package com.PP_3_1_2.pp3_1_2.repository;


import com.PP_3_1_2.pp3_1_2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
