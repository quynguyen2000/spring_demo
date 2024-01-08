package com.example.stpring_api.repository;

import com.example.stpring_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
}
