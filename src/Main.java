import java.util.*; 

public class Main {
    public static void main(String[] args) {
                
    Scanner le = new Scanner(System.in);
    Tree arv = new Tree();
    int opcao;
    int x;
    System.out.print("\n Programa Arvore binaria");
    do {
        System.out.print("\n***********************************");
        System.out.print("\nEntre com a opcao:");
	System.out.print("\n ----1: Inserir");
	System.out.print("\n ----2: Pesquisar");
	System.out.print("\n ----3: Exibir");
	System.out.print("\n ----4: Sair do programa");
	System.out.print("\n***********************************");
	System.out.print("\n-> ");
	opcao = le.nextInt();
	switch(opcao) {
	 	case 1: {
		       System.out.print("\n Informe o valor (int) -> ");
		       x = le.nextInt();
		       arv.inserir(x);
		       break;
		}

		case 2: {
		       System.out.print("\n Informe o valor (long) -> ");
                       x = le.nextInt();
	      	       if( arv.buscar(x) != null )
		          System.out.print("\n Valor Encontrado");
		       else 
		          System.out.print("\n Valor nao encontrado!");
		       break;
		}	 
		case 3: {
		      arv.caminhar();
		      break; 
		}
        } // fim switch
    } while(opcao != 5);

  }

}