package com.home.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDO, Long> {

    UserDO findByUsername(String username);

}