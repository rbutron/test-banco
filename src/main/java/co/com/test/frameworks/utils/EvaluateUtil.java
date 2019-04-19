package co.com.test.frameworks.utils;

public class EvaluateUtil {

	public static boolean evaluateStringNombre(String nombre) {
		return false;//nombre != null ? !nombre.matches(Constants.NOMBRE) : Boolean.TRUE;
	}

	public static boolean evaluateStringDireccion(String direccion) {
		return false;//direccion != null ? !direccion.matches(Constants.DIRECCION) : Boolean.TRUE;
	}

	public static boolean evaluateStringCiudad(String ciudad) {
		return false;//ciudad != null ? !ciudad.matches(Constants.CIUDAD) : Boolean.TRUE;
	}

	public static boolean evaluateNumberTelefono(Long tel) {
		return false;//tel != null ? !tel.toString().matches(Constants.TELEFONO) : Boolean.TRUE;
	}

	public static boolean evaluateNumberTarjeta(Long tarjeta) {
		return false;//tarjeta != null ? !tarjeta.toString().matches(Constants.TARJETA) : Boolean.TRUE;
	}

	public static boolean evaluateNumberCCV(Short ccv) {
		return false;//ccv != null ? !ccv.toString().matches(Constants.CCV) : Boolean.TRUE;
	}

	public static boolean evaluateDefault(String defaul) {
		return false;//defaul != null ? !defaul.matches(Constants.DEFAULT) : Boolean.TRUE;
	}

	public static boolean evaluateNumberMonto(Double monto) {
		return monto != null ? !monto.toString().matches(Constants.MONTO) : Boolean.TRUE;
	}

	public static boolean evaluateStringDescripcion(String descripcion) {
		return descripcion != null ? !descripcion.matches(Constants.DESCRIPCION) : Boolean.TRUE;
	}
	
	private EvaluateUtil() {
	}

}
