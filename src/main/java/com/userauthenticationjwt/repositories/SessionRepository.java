package com.userauthenticationjwt.repositories;

import com.userauthenticationjwt.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
    Session save(Session session);
}
