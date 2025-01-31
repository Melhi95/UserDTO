package ru.vaidom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vaidom.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
