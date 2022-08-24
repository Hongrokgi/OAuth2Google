package com.google.oauth2.googleOauth2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email); // 이미 email 을 통해 생성된 사용자인지 체크..

}
