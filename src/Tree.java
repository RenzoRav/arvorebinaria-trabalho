public class Tree {
    private Node root;

    public Tree() {
        root = null; // inicializa arvore
    }

    public void inserir(int valor) {
    Node novo = new Node(); // cria um novo Nó
    novo.item = valor; // atribui o valor recebido ao item de dados do Nó
    novo.dir = null;
    novo.esq = null;

    if (root == null) root = novo;
    else  { // se nao for a raiz
      Node atual = root;
      Node anterior;
      while(true) {
        anterior = atual;
        if (valor <= atual.item) { // ir para esquerda
          atual = atual.esq;
          if (atual == null) {
            anterior.esq = novo;
            return;
          } 
        }  // fim da condição ir a esquerda
        else { // ir para direita
           atual = atual.dir;
           if (atual == null) {
             anterior.dir = novo;
             return;
           }
                } // fim da condição ir a direita
             } // fim do laço while
        } // fim do else não raiz
     }

     public Node buscar(long chave) {
    if (root == null) return null; // se arvore vazia
    Node atual = root;  // começa a procurar desde raiz
    while (atual.item != chave) { // enquanto nao encontrou
      if(chave < atual.item ) atual = atual.esq; // caminha para esquerda
      else atual = atual.dir; // caminha para direita
      if (atual == null) return null; // encontrou uma folha -> sai
    } // fim laço while
    return atual; // terminou o laço while e chegou aqui é pq encontrou item
  }

   public void inOrder(Node atual) {
    if (atual != null) {
      inOrder(atual.esq);
      System.out.print(atual.item + " ");
      inOrder(atual.dir);
    }
  }

  public void preOrder(Node atual) {
    if (atual != null) {
      System.out.print(atual.item + " ");
      preOrder(atual.esq);
      preOrder(atual.dir);
    }
  }
  

  public void posOrder(Node atual) {
    if (atual != null) {
      posOrder(atual.esq);
      posOrder(atual.dir);
      System.out.print(atual.item + " ");
    }
  }  


  public void caminhar() {
    System.out.print("\n Exibindo em ordem: ");
    inOrder(root);
    System.out.print("\n Exibindo em pos-ordem: ");
    posOrder(root);
    System.out.print("\n Exibindo em pre-ordem: ");
    preOrder(root);

  }

}
