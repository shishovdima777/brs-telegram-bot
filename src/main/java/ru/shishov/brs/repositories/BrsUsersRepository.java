package ru.shishov.brs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shishov.brs.models.BrsUser;
@Repository
public interface BrsUsersRepository extends JpaRepository<BrsUser, Integer> {

}
