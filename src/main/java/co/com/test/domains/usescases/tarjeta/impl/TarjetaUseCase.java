package co.com.test.domains.usescases.tarjeta.impl;

import co.com.test.domains.models.StatusModel;
import co.com.test.domains.models.TarjetaModel;
import co.com.test.domains.usescases.tarjeta.ITarjetaUseCase;
import co.com.test.frameworks.utils.Constants;
import co.com.test.frameworks.utils.EvaluateUtil;

public class TarjetaUseCase implements ITarjetaUseCase {

	@Override
	public StatusModel evalTarjeta(TarjetaModel u) {
		StatusModel status = new StatusModel();
		if (EvaluateUtil.evaluateDefault(u.getTipoTarjeta())) {
			status = new StatusModel(Constants.MSGTIPOTARJETA);
		} else if (EvaluateUtil.evaluateNumberTarjeta(u.getNumTarjeta())) {
			status = new StatusModel(Constants.MSGNUMTARJETA);
		} else if (EvaluateUtil.evaluateNumberCCV(u.getCcv())) {
			status = new StatusModel(Constants.MSGCCV);
		} else {
			status = null;
		}
		return status;
	}

}
