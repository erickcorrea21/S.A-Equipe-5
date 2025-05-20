package trabalhoEquipe5;
import java.util.*;
public class fabricaFerramentas { 
static Scanner entrada = new Scanner (System.in);
			static ArrayList<Integer> setores = new ArrayList<>();
			static ArrayList<Integer> maquinas = new ArrayList<>();
			static ArrayList<String> tipoFerramenta = new ArrayList<>();
		public static void main(String[] args) {
			
			System.out.println("-----MENU-----");
			System.out.println("1- Cadastrar setores");
			System.out.println("2- Cadastrar máquinas e definir ferramenta por máquina");
			System.out.println("3- Cadastrar quantidade de ferramentas produzidas");
			System.out.println("4- Mostrar relatório");
			System.out.println("5- Verificar máquinas inativas");
			System.out.println("6- Encerrar sistema");
			int opcao = 0;
			while (opcao !=6) {
				if (opcao<=0 || opcao<6) {
					System.out.println("Numero invalido");
				}
				switch (opcao) {
				
				case 1:
					cadastrarSetor();
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
					default:
						System.out.println("Saindo. . .");
					
				}
				
			}
			
		entrada.close();
		}
		
		public static int cadastrarSetor() {
			int setor = 0;
			System.out.println("Digite o numero para o setor: ");
			setor = entrada.nextInt();
			setores.add(setor);
			
			return 0;
			
		}
		public static int cadastrarMaquina() {
			int maquina = 0;
			System.out.println("Digite o numero para a maquina: ");
			maquina = entrada.nextInt();
			maquinas.add(maquina);
			
			return 0;
	}
}
}
