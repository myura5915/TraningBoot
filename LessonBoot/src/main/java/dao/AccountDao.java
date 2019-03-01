package dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bean.AccountBean;
import entity.AccountEntity;
import repository.AccountRepository;

@Component
public class AccountDao {

	LocalDateTime ld = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd/HH:mm:ss");

	@Autowired
	AccountRepository accountRepository;

	public List<AccountEntity> findUser(AccountBean accountBean) {
		List<AccountEntity> result = accountRepository.findByUser_NameAndPassword(accountBean.getUser_name(), accountBean.getUser_name());
		return result;
	}

	public void registration(AccountBean accountBean) {
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setUser_name(accountBean.getUser_name());
		accountEntity.setPass(accountBean.getPassword());
		accountEntity.setInsert_date(ld.format(dtf));
		accountRepository.save(accountEntity);
	}
}