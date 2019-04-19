package co.com.test.domains.usescases.asesor.impl;

import co.com.test.domains.models.AsesorModel;
import co.com.test.domains.models.StatusModel;
import co.com.test.domains.usescases.asesor.IAsesorUseCase;
import co.com.test.frameworks.utils.Constants;
import co.com.test.frameworks.utils.EvaluateUtil;

public class AsesorUseCase implements IAsesorUseCase {

	@Override
	public StatusModel evalAsesor(AsesorModel u) {
		StatusModel status;
		if (EvaluateUtil.evaluateDefault(u.getNombre())) {
			status = new StatusModel(Constants.MSGNOMBRE);
		} else if (EvaluateUtil.evaluateDefault(u.getEspecialidad())) {
			status = new StatusModel(Constants.MSGDIRECCION);
		} else {
			status = null;
		}
		return status;
	}

}
