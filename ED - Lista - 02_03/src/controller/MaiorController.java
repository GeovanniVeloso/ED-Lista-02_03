package controller;

import br.edu.fatec.zl.Lista;

public class MaiorController {

	public MaiorController() {
		super();
	}
	
	public void GreatController(Lista <Integer> lista) {
		int v1 = 0;
		int v2 = 0;
		
		int cont = lista.size() - 1;
		
		while (cont >=0) {
			try {
				if(lista.get(cont)>v1) {
					v2 = v1;
					v1 = lista.get(cont);
				}else {
					if(lista.get(cont)>v2) {
						v2 = lista.get(cont);
					}
				}
			} catch (Exception e) {
				System.err.println(e);
			}
			cont = cont - 1;
		}
		
		System.out.println("Os dois maiores valores são: "+v1+" e "+v2);
	}

}
