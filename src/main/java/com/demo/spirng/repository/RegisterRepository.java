package com.demo.spirng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spirng.models.User;

@Repository
public interface RegisterRepository extends JpaRepository<User,Long>{

}
