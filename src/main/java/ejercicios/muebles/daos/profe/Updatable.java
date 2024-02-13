package ejercicios.muebles.daos.profe;

public interface Updatable<T> extends Insertable<T> {

	public void update(T objeto);
	
	public void delete(T objeto);
	
}
