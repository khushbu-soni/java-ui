package com.dharohar.auth.repository;

import com.dharohar.auth.model.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulletinRepository extends JpaRepository<Bulletin, Long>{
}
