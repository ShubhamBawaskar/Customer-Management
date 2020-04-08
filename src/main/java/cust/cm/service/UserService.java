package cust.cm.service;

public interface UserService {

	String validateLogin(int userName, String Password);

	String ChangePassword(int userName, String newPassword);

}
