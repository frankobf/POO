package ex23;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {

		List<String> l = new LinkedList<String>();
		Map<String, Integer> m = new HashMap<String, Integer>();
		Set<String> s = new TreeSet<String>();
		Set<Integer> t = new TreeSet<Integer>();
		String texto = "eu gosto de poo poo";
		String[] vet = texto.split(" ");
		// Colocar todas as palavras de um texto ordenadas alfabeticamente.
		// Não pode haver repetição de palavras.

		for (int i = 0; i < vet.length; i++)
			s.add(new String(vet[i]));

		// Contar a frequência das palavras de um texto.
		for (int j = 0; j < vet.length; j++) {
			if (m.containsKey(vet[j])) {
				int contador = m.get(vet[j]);
				m.put(vet[j], contador + 1);
			} else {
				m.put(vet[j], 1);
			}

		}

		// A partir da leitura de um texto, gerar o mesmo com as palavras embaralhadas.

		for (int k = 0; k < vet.length; k++)
			l.add(vet[k]);

		Collections.shuffle(l);

		// Gerar 20 números sorteados de 1 a 50
		// sem repetição e depois exibi-los em ordem crescente.

		Random gerador = new Random();

		for (int i = 0; i < 20; i++) {
			t.add(gerador.nextInt(51) + 1);

		}
		System.out.println("ConjuntoA: " + s);
		System.out.println("MapaB: " + m);
		System.out.println("ListaC: " + l);
		System.out.println("ListaD: " + t);

	}
}