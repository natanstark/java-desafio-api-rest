package me.natan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.natan.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
