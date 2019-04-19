package co.com.test.frameworks.utils;

public class Constants {
	
	public static final String ENVAPP = "${app.env}";
	private static final String CONTEXTAPP = "/test-banco/";
	public static final String CONTEXTAPPALL = CONTEXTAPP.concat("**");
	public static final String ASTERISK = "*";
	
	public static final String ID = "id";
	
	public static final String USERCREATE = CONTEXTAPP.concat("api/user/create");
	public static final String USERUPDATE = CONTEXTAPP.concat("api/user/update");
	public static final String USERDELETE = CONTEXTAPP.concat("api/user/delete/{id}");
	public static final String USERCONSULT = CONTEXTAPP.concat("api/user/consult");
	
	public static final String ASESORCREATE = CONTEXTAPP.concat("api/asesor/create");
	public static final String ASESORUPDATE = CONTEXTAPP.concat("api/asesor/update");
	public static final String ASESORDELETE = CONTEXTAPP.concat("api/asesor/delete/{id}");
	public static final String ASESORCONSULT = CONTEXTAPP.concat("api/asesor/consult");
	
	public static final String TARJETACREATE = CONTEXTAPP.concat("api/tarjeta/create");
	public static final String TARJETAUPDATE = CONTEXTAPP.concat("api/tarjeta/update");
	public static final String TARJETADELETE = CONTEXTAPP.concat("api/tarjeta/delete/{id}");
	public static final String TARJETACONSULT = CONTEXTAPP.concat("api/tarjeta/consult");
	
	public static final String MOVIMIENTOCREATE = CONTEXTAPP.concat("api/movimiento/create");
	public static final String MOVIMIENTOUPDATE = CONTEXTAPP.concat("api/movimiento/update");
	public static final String MOVIMIENTODELETE = CONTEXTAPP.concat("api/movimiento/delete/{id}");
	public static final String MOVIMIENTOCONSULT = CONTEXTAPP.concat("api/movimiento/consult");
	
	public static final String NOMBRE = "^[a-zA-ZâãäåæçèéêëìíîïðñòóôõøùúûüýþÿıÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕØÙÚÛÜÝÞŸı ]{0,20}$";
	public static final String DIRECCION = "^[0-9a-zA-ZâãäåæçèéêëìíîïðñòóôõøùúûüýþÿıÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕØÙÚÛÜÝÞŸı #.]{0,100}$";
	public static final String CIUDAD = "^[a-zA-ZâãäåæçèéêëìíîïðñòóôõøùúûüýþÿıÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕØÙÚÛÜÝÞŸı]{0,30}$";
	public static final String TELEFONO = "^[0-9]{0,20}$";
	public static final String TARJETA = "^[0-9]{0,16}$";
	public static final String CCV = "^[0-9]{3,4}$";
	public static final String DESCRIPCION = "^[a-zA-ZâãäåæçèéêëìíîïðñòóôõøùúûüýþÿıÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕØÙÚÛÜÝÞŸı ]{1,100}$";
	public static final String DEFAULT = "^[0-9a-zA-ZâãäåæçèéêëìíîïðñòóôõøùúûüýþÿıÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕØÙÚÛÜÝÞŸı .,;¿?]{1,50}$";
	public static final String MONTO = "^[0-9.]{0,12}$";
	
	public static final String MSGSAVE = "Se registro correctamente";
	
	public static final String MSGNOMBRE = "Asegúrese de que el NOMBRE este bien escrito [Tamaño 1-50, solo letras sin acento]";
	public static final String MSGDIRECCION = "Asegúrese de que la DIRECCION este bien escrito [Tamaño 1-100, solo letras, numeros y carateres especiales como: # .]";
	public static final String MSGCIUDAD = "Asegúrese de que la CIUDAD este bien escrito [Tamaño 1-30, solo letras]";
	public static final String MSGTELEFONO = "Asegúrese de que el TELEFONO este bien escrito [Tamaño 1-20, solo numeros]";
	public static final String MSGDESCRIPCION = "Asegúrese de que la DESCRIPCION este bien escrito [Tamaño 1-100, solo letras, numeros y especiales: . , ; ¿ ?]";
	public static final String MSGMONTO = "Asegúrese de que el MONTO este bien escrito [Tamaño 1-12, solo numeros]";
	public static final String MSGTIPOTARJETA = "Asegúrese de que el TIPO DE LA TARJETA este bien escrito [Tamaño 1-50, solo letras]";
	public static final String MSGNUMTARJETA = "Asegúrese de que el NUMERO DE LA TARJETA este bien escrito [Tamaño 1-16, solo numeros]";
	public static final String MSGCCV = "Asegúrese de que el CCV este bien escrito [Tamaño 3-4, solo numeros]";
	
	
	
	
	private Constants () {}

}
