package desafioEvaluadoD18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Juan");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Camila");
		lista.add("Daniel");
		lista.add("Camila");
		String directorio = ("src/" + "directorio");
		String fichero = (directorio + "/" + "fichero.txt");
		
		
	}

	
	public static void crearArchivo(String directorio, String fichero, ArrayList<String> lista) {
		File dir = new File(directorio);

		if (dir.exists() == false) {
			dir.mkdir();
		} else {
			System.out.println("Error al crear directorio");
		}

		if (dir.exists()) {
			File file = new File(fichero);
			if (file.exists() == false) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error al crear el directorio.");
				}
			}

		} else {
			System.out.println("El directorio no existe.");
		}

		try (FileWriter fw = new FileWriter(fichero); BufferedWriter bw = new BufferedWriter(fw);) {
			//Iterator solicitado en el punto 4.
			Iterator<String> iterador = lista.iterator();

			while (iterador.hasNext()) {
				String elemento = iterador.next();
				bw.write(elemento);
				bw.newLine();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
