package co.com.test.domains.usescases.movimiento;

import co.com.test.domains.models.MovimientoModel;
import co.com.test.domains.models.StatusModel;

public interface IMovimientoUseCase {
	StatusModel evalMovimiento(MovimientoModel u);
}
