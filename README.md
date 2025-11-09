## Objetivo

Compreender a recursividade aplicando-a na implementação de uma árvore binária de busca (BST) com operações de inserção, busca e percursos (pré-ordem, em ordem e pós-ordem).

## Estrutura

- `Node`: Representa o Nó com seus respectivos atributos
- `Main`: Classe para testar a implementação
- `Tree`: Implementa os métodos de inserção, busca e percursos.


## Conceitos e Explicação

> O que é recursividade? 
Recursividade é quando uma função chama a si mesma para resolver um problema, até atingir uma condição base. 

> Como a recursividade é usada na travessia de uma árvore binária? 
A recursão permite percorrer a árvore sem laços, visitando cada nó em pré-ordem, em ordem ou pós-ordem. 

> Qual a diferença entre recursão e laço (for/while)?
 A recursão chama a função dentro de si mesma, enquanto o laço repete um bloco de código até que uma condição seja satisfeita.s

## Implementação 

Implementação da Árvore Binária inserir(int valor): Insere um valor na árvore. 

buscar(int valor): Verifica se um valor existe na árvore.

preOrdem(): Percorre a árvore na ordem raiz, esquerda, direita.
 
emOrdem(): Percorre a árvore na ordem esquerda, raiz, direita.
  
posOrdem(): Percorre a árvore na ordem esquerda, direita, raiz.
