package com.example.training;

import com.example.training.UserShcema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserSchemaRepository extends JpaRepository<UserShcema, UUID> { }