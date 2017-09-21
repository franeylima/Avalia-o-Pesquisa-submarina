# Avaliação-Pesquisa-submarina

O programa contido neste repositório corresponde à solução para o desafio especificado no seguinte link:
* https://gist.github.com/tsfreitas/f0e61d3e2980f3207e1a92228c5bdc33

# Implementação

O projeto foi implementado  utilizando a linguagem java e orientação a objetos.
O modelo dos objetos foi elaborado da seguinte forma:
  1. O objeto submarino representa o submarino físico, e o mesmo possui uma posição e um sistema de direção;
  2. O objeto sistema de direção é responsável por manipular a posição do submarino de acordo com as intruções fornecidas;
  3. O sistema de direção, por sua vez, recebe a posição do submarino e possui uma relação de comandos possíveis de execução;
  4. O objeto posição, representa as coordenadas  que definem a posição do submarino no "oceano", e apenas o sistema de direção deve modificar suas propriedades;
  5. Os comandos que o sistema de direção pode executar são definidos através da implementação da interface IComando, que define o contrato de funcionamento dos comandos do sitema;
  6. Conforme especificado, existem 5 comandos viáveis:
      * Mover (M)
      * Virar a Direita (R)
      * Virar a Esquerda (L)
      * Subir (U)
      * Descer (D)
  7. Para o comando MOVER (M), conforme a especificação, foi definido o comportamento incremental dos eixos x e y apenas para quando a direção atual fosse LESTE e NORTE, respectivamente. Dessa forma, foi assumido que quando direção atual tivesse valor oposto aos valores fornecidos o indice nos respectivos seria decrementado;
  8. Para o comando SUBIR(U) não foi especificado comportamento, então, foi assumido o comportamento oposto ao comando DESCER (D) - incrementar o indice do eixo z;
  9. Para os comandos virar a esquerda (L) e virar a direita (R), foi assumido que apenas mudam a direção, sem alterar o valor do indice dos eixos x,y e z. Ambos possuem referência ao objeto RosaDosVentos, criado com o intuito de auxiliar na definição da nova direção do submarino após um comando;
  10. A RosaDosVentos, por sua vez, auxilia na definição de uma nova direção através de um array que contém as quatro direções possíveis no sentido horário, de forma que o incremento ou decremento de seu indice represente um movimento circular horário ou anti-horario em uma rosa dos ventos de verdade, respectivamente.
  
  
