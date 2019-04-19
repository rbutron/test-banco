package co.com.test.domains.usescases.user;

import co.com.test.domains.models.StatusModel;
import co.com.test.domains.models.UserModel;

public interface IUserUseCase {
	
	StatusModel evalUser(UserModel u);

}
