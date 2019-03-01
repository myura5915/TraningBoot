package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.AccountBean;
import dao.AccountDao;
import entity.AccountEntity;

@Service
public class AccountService {

	@Autowired
	AccountDao accountDao;

	@Autowired
	AccountEntity accountEntity;

	public int findUser(AccountBean accountBean) {
		List<AccountEntity> result = accountDao.findUser(accountBean);
		return result.size();
	}

	public void registration(AccountBean accountBean) {
		accountDao.registration(accountBean);
	}
}