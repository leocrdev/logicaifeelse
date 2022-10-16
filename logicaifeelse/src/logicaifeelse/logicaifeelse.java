package logicaifeelse;

public class logicaifeelse {

	
	/* Main é um método auto executável em Java */
	public static void main(String[] args) {
		
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			System.out.println("Aluno Aprovado: " + media);
		}
		if (media >= 40 && media <= 69) {
			System.out.println("Aluno está de recuperação: " + media);
		}
		else {
			System.out.println("Aluno Reprovado: " + media);
		}
	}
}
