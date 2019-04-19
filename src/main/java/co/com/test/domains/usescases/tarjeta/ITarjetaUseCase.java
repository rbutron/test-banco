package co.com.test.domains.usescases.tarjeta;

import co.com.test.domains.models.StatusModel;
import co.com.test.domains.models.TarjetaModel;

public interface ITarjetaUseCase {
	StatusModel evalTarjeta(TarjetaModel u);
}
