# travelling-salesman
Caixeiro Viajante implementado em java. desenvolvido na disciplina de Programação Orientada a Objetos (UFPEL).


/**********************************************************************
 *  Relatório                                                   
 *  TSP Heuristics
 **********************************************************************/

Quantas horas foram necessárias para completar a tarefa (opcional):
18(dezoito) horas 

/**********************************************************************
 * Explique como você implementou a heurística da "inserção mais
 * próxima".
 **********************************************************************/
	Calculando a distância entre o novo ponto(novo.p) e a variavel 
	auxiliar(aux.p) que percorre a lista até chegar no fim. Quando essa
	distância for menor do que as outras a variavel auxiliar é salva 
	(nearest), e a menor distância também, no caso de se encontrar 
	distância menor.
	Depois de a auxiliar chegar no fim, sai do loop e coloca o novo 
	ponto depois do mais próximo que está salvo em nearest.

/**********************************************************************
 * Explique como você implementou a heurística da "menor inserção". 
 * PAra essa explicação, é suficiente listar apenas quatro diferenças
 * entre esta heurística e a da "inserção mais próxima".
 **********************************************************************/
 A diferença dessa heurística para a heurística de inserção mais próxima
 é: 
 -A necessidade de inserir dois pontos antes de calcular as distancias.
 -Utilizar a ideia de ter a distância máxima(total) atual da lista, e 
 com isso fazer a diferença da distância dos pontos A e B (sem o novo
 ponto(p)) com a distância do caminho entre A e P,P e B. Onde é 
 armazenado o menor valor(menor) e também o ponto do menor valor(a).

/**********************************************************************
 *  Preencha com as distâncias computadas por suas heurísticas.                
 **********************************************************************/

Arquivos de entrada    Vizinho mais próximo  Menor aumento
-----------------------------------------------------------
tsp10.txt              1566.1363             1655.7462
tsp100.txt			   7389.9297			 4887.2190
tsp1000.txt 		   27868.7106	  		 17265.6282 
usa13509.txt		   77449.9794			 45074.7769


/**********************************************************************
 * Explique por que você usou uma lista ligada circular ao invés de um
 * array. 
 **********************************************************************/
 Foi usado para expressar melhor a ideia do problema, onde o viajante 
 pode começar de qualquer cidade(ponto), e assim voltar para ele depois
 de completa a rota de viagem. E também se fosse utilizado um array,
 deveria ser informado o tamanho previamente, por se tratar de uma alocação
 estática.
 Se fosse alterado para uma array seria necessário poucas modificações,
 como o teste se o ponto auxiliar é igual ao first, seria se é igual a
 null, entre outras.

/**********************************************************************
 * Liste qualquer ajuda (se houve) que você recebeu.
 **********************************************************************/
No entendimento do método de inserção de menor aumento. Matheus Ianzer

/**********************************************************************
 * Descreva qualquer problema mais sério que vou encontrou relacionado
 * a atividade.                    
 **********************************************************************/
 Utilização do eclipse.
 Importações.

/**********************************************************************
 * Liste qualquer outro comentário aqui. Sinta-se avontade para prover
 * qualquer "feedback" sobre o quanto você aprendeu realizando a
 * atividade e se você gostou de fazê-la.
 **********************************************************************/
 Otímo trabalho para proporcionar o aprendizado sobre lista encadeada
 circular, como também o uso de uma nova IDE.
