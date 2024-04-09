package tarea244;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoClientes {

	public static void main(String[] args) {

		// Cargamos el archivo XML
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");

		// Una vez cargado el archivo XML, le pedimos a ete XML el bean (el objeto)
		
		Clientes Nikita = contexto.getBean("productos", Clientes.class);
		
		System.out.println( "Nikita "+ Nikita.getProducto());
		
		// Hacemos lo mismo pero para tener otro ejemplo
		Clientes Blanca = contexto.getBean("productos1", Clientes.class);
		System.out.println( "Blanca "+ Blanca.getProducto());

		// Cerramos el archivo XML
		contexto.close();
		
	}

}
