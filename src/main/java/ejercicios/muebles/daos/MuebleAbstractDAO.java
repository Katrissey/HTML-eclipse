package ejercicios.muebles.daos;

import org.hibernate.HibernateException;

import ejercicios.muebles.entities.Mueble;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class MuebleAbstractDAO {
	
	//Definimos, pero no inicializamos de momento, ya lo haremos en los distintos métodos
	//un atributo de tipo EntityManager, para poder generar después las conexiones a la BBDD
	//empleándole para llamar a los métodos de conexión necesarios en cada caso

	private static EntityManager em;
	
	static MuebleAbstractDAO mad = new MuebleAbstractDAO ();
	
	protected void iniciarConexion () {
		
		em = JpaUtil.getEM("ConexionOracleHibernate");
		
	}
	
	public static void almacenarEntidad (Mueble mueble) throws HibernateException {
	  mad.iniciarConexion ();
	  
	  try {
	  EntityTransaction transaction = em.getTransaction();
	  transaction.begin ();
	  em.persist (mueble);
	  transaction.commit ();
	  
	  } catch (HibernateException he) {
		  
	  }
	  
		
	}
	
}
