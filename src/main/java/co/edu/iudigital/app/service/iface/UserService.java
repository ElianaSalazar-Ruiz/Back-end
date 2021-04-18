package co.edu.iudigital.app.service.iface;

import co.edu.iudigital.app.model.entity.User;

public interface UserService {
	/**
	 * crear nuevo usuario
	 * @param user
	 */
	public void create(User user);
	/**
	 * Se loguea un usuario
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login(User user) throws Exception;
	

}