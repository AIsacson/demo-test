package com.annaisacson.tests.demo.repositories;

import com.annaisacson.tests.demo.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}

