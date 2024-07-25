package estudos;

import java.util.Scanner;

public class exemplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a velocidade maxima permitida na rua");
		byte vpermitida = sc.nextByte();
		System.out.println("Digite sua velocidade");
		byte km = sc.nextByte();
		int execesso = km - vpermitida;
		if (km > vpermitida) {
			if (km >= vpermitida && execesso == 10) {
				System.out.println("Sua multa é de 50 reais");
			} else if (km > vpermitida && execesso >= 11 && execesso <= 30) {
				System.out.println("Sua multa é de 100 reais");
			} else if(km > vpermitida && execesso >= 31){
				System.out.println("Sua multa é 300 reais");
			}
		} // acho que estou no caminho certo.
		System.out.println(execesso);
		sc.close();
	}
}