package org.uade.testaws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uade.testaws.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
