package utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtils { 
	
	private static EntityManager em;
	
//    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();
//
//    private static EntityManagerFactory buildEntityManagerFactory(){
//        return Persistence.createEntityManagerFactory("hibernateOracle");
//    }
//
//    public static EntityManager getEntityManager() { 
//        return entityManagerFactory.createEntityManager();
//    }
    
	public static EntityManager getEM () {
		
		return getEM ("ConexionOracleHibernate");
		
	}
	
    public static EntityManager getEM (String persistenceUnit) {
    	
    	if (em==null) {
    			EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnit);
    			em = emf.createEntityManager(); 
    	}
    	
    	return em;
    }
}
