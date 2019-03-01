package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, String> {
	List<AccountEntity> findByUser_NameAndPassword(String user_name, String password);
}