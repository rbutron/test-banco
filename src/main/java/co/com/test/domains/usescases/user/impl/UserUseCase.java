package co.com.test.domains.usescases.user.impl;

import co.com.test.domains.models.StatusModel;
import co.com.test.domains.models.UserModel;
import co.com.test.domains.usescases.user.IUserUseCase;
import co.com.test.frameworks.utils.Constants;
import co.com.test.frameworks.utils.EvaluateUtil;

public class UserUseCase implements IUserUseCase {

	@Override
	public StatusModel evalUser(UserModel u) {
		StatusModel status;
		if (EvaluateUtil.evaluateStringNombre(u.getNombre())) {
			status = new StatusModel(Constants.MSGNOMBRE);
		} else if (EvaluateUtil.evaluateStringDireccion(u.getDireccion())) {
			status = new StatusModel(Constants.MSGDIRECCION);
		} else if (EvaluateUtil.evaluateStringCiudad(u.getCiudad())) {
			status = new StatusModel(Constants.MSGCIUDAD);
		} else if (EvaluateUtil.evaluateNumberTelefono(u.getTelefono())) {
			status = new StatusModel(Constants.MSGTELEFONO);
		} else {
			status = null;
		}
		return status;
	}

}
