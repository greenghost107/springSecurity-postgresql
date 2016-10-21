package com.example.Data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Michael on 16/10/2016.
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findById(Long id);
    List<Users> findByUserName(String userName);

}

