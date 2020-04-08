package cust.cm.service;

public class UserServiceImpl implements UserService {

	private int userName = 101;
	private String password = "pass123";

	@Override
	public String validateLogin(int userName, String password) {

		String status = "Wrong User Name";
		// retrive from database

		if (this.userName == userName) {
			if (this.password.equals(password)) {
				return "valid";
			} else {
				return "Wrong password...";
			}
		}

		return status;
	}

	@Override
	public String ChangePassword(int userName, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

}
