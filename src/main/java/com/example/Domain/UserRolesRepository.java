package com.example.Domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Michael on 22/10/2016.
 */
@Repository
public interface UserRolesRepository extends JpaRepository<UserRole, Long> {



    List<UserRole> findByUserRole(String role);

}
