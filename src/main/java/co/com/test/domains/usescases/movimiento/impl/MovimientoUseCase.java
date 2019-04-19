package co.com.test.domains.usescases.movimiento.impl;

import co.com.test.domains.models.MovimientoModel;
import co.com.test.domains.models.StatusModel;
import co.com.test.domains.usescases.movimiento.IMovimientoUseCase;
import co.com.test.frameworks.utils.Constants;
import co.com.test.frameworks.utils.EvaluateUtil;

public class MovimientoUseCase implements IMovimientoUseCase {

	@Override
	public StatusModel evalMovimiento(MovimientoModel u) {
		StatusModel status = new StatusModel();
		if (EvaluateUtil.evaluateStringDescripcion(u.getDescripcion())) {
			status = new StatusModel(Constants.MSGDESCRIPCION);
		} else if (EvaluateUtil.evaluateNumberMonto(u.getMonto())) {
			status = new StatusModel(Constants.MSGMONTO);
		} else {
			status = null;
		}
		return status;
	}

}
