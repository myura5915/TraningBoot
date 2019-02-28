package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.AccountBean;
import bean.LoginBean;
import dao.AccountDao;

@Service
public class LoginService {

	@Autowired
	AccountDao accountDao;
	public boolean execute(LoginBean loginbean) {
		AccountDao dao = new AccountDao();
		AccountBean account = dao.findByLogin(loginbean);
		return account != null;
	}
}