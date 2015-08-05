/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.Curso;
import Controlador.Persona.Apoderado;

/**
 * @author Alfredo Rojas
 *
 */
public class AsignarProfesorTest {

	/**
	 * Test method for {@link Controlador.Academico.Curso#asignarProfesor(int, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAsignarProfesor() {
		String resultado="";
		//int id,String rutProfe,String rutJefeAdm
		resultado =Curso.asignarProfesor(2,"137657474","135749802");
		assertTrue(resultado=="profesor asignado");
	}

}