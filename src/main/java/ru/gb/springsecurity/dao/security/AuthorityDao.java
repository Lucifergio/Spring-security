package ru.gb.springsecurity.dao.security;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springsecurity.entity.security.Authority;

public interface AuthorityDao extends JpaRepository<Authority, Long> {
}
