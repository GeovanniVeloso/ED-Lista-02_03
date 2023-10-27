package view;

import br.edu.fatec.zl.Lista;
import controller.MaiorController;


public class Principal {

	public static void main(String[] args) {
		int []vet = {3,5,8,12,9,7,6,2,3,7,16};
		Lista <Integer> list = new Lista<Integer>();
		MaiorController mc = new MaiorController();
		
		int cont = 0;
		
		while(cont<11) {
			if(list.isEmpty()) {
				list.addFirst(vet[cont]);
			}else {
				try {
					list.addLast(vet[cont]);
				} catch (Exception e) {
					System.err.println(e);
				}
			}
			cont +=1;
		}
		
		mc.GreatController(list);
		
	}

}
