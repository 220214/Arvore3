package view;

import br.mari.arvorechar.Arvore;

public class Main {

	public static void main(String[] args) {
	Arvore ar = new Arvore ();
	char []vet = {'k','d','m','b','f','l','t','c','p','z','r'};
	for(char i: vet) {
		ar.insert(i);
	}
	try {
		ar.remove('m');
		ar.infixSearch();
		System.out.println();
		ar.postfixSearch();
		System.out.println();
		ar.prefixSearch();
		System.out.println();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		ar.search('r');
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
