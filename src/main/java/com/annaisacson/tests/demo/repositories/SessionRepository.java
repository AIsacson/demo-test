package com.annaisacson.tests.demo.repositories;

import com.annaisacson.tests.demo.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
