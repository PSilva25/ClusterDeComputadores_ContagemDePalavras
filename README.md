# ClusterDeComputadores_ContagemDePalavras
Cluster de computadores que contam palavras.

## Cluster de computadores
Este repositorio contém o projeto de um e cluster de computadores, um projeto proposto como trabalho final da disciplina de Sistemas Distribuidos.

### Cluster - Conceito
Um cluster (do inglês TESTE: 'grupo, aglomerado') consiste em computadores fracamente ou fortemente ligados que trabalham em conjunto, de modo que, em muitos aspectos, podem ser considerados como um único sistema. Diferentemente dos computadores em grade, computadores em cluster têm cada conjunto de nós, para executar a mesma tarefa, controlado e programado por software.
De uma forma geral, quando são utilizados dois ou mais computadores conjuntamente e geograficamente próximos (geralmente em uma mesma sala ou prédio) para resolver algum problema, pode-se dizer que este cenário representa um cluster, palavra que vêm do inglês e significa agrupamento ou agregado. Os clusters de computadores ou simplesmente clustering ou clusters possuem diversas implementações diferentes, com uso de variadas tecnologias para diversos fins. (ALVES, 2002).
Segundo Pitanga (2003), os clusters são constituídos de diversos computadores, chamados de nós, nodos ou nodes, de forma a criar aos usuários a imagem de um sistema único (SSI – Single System Image) que responde a eles, criando a ilusão de que existe apenas um recurso computacional único, como uma espécie de super computador virtual. Desta forma, todos os processos de sincronização, comunicação e distribuição de tarefas, troca de mensagens entre os nós, uso da computação paralela e distribuída e tudo mais que ocorre nos bastidores dos clusters deverão ser transparentes ao usuário.

### Tipos de Cluster
Existem vários tipos de cluster. Os mais conhecidos são:
* Cluster de Alto Desempenho: também conhecido como cluster de alta performance, ele funciona permitindo que ocorra uma grande carga de processamento com um volume baixo de gigaflops em computadores comuns e utilizando sistema operacional gratuito, o que diminui seu custo;
* Cluster de Alta Disponibilidade: são clusters cujos sistemas conseguem permanecer ativos por um longo período de tempo e em plena condição de uso; sendo assim, podemos dizer que eles nunca param seu funcionamento; além disso, conseguem detectar erros se protegendo de possíveis falhas;
* Cluster para Balanceamento de Carga: esse tipo de cluster tem como função controlar a distribuição equilibrada do processamento. Requer um monitoramento constante na sua comunicação e em seus mecanismos de redundância, pois, se ocorrer alguma falha, haverá uma interrupção no seu funcionamento.

### Sistemas Distribuidos – Conceito
Os sistemas distribuídos possuem uma arquitetura com grande escalabilidade, devido a possibilidade de agregação de computadores comuns interligados por redes convencionais. Esses ambientes podem ser constituídos tanto por um conjunto de máquinas homogêneas (todas exatamente com a mesma configuração) quanto de heterogêneas, não havendo qualquer limitação quanto a isso. Devido a esse fator, como cada nó possui sua própria configuração de hardware e software, bem como uma cópia própria do sistema operacional, torna-se possível a formação de diversas configurações de sistemas distribuídos, utilizando-se de configurações SMPs, MPPs e clusters computacionais. (DANTAS, 2005).
Segundo Tanenbaum (2003, p. 2), "[...] em um sistema distribuído, um conjunto de computadores independentes parece ser, para seus usuários, um único sistema coerente. Em geral ele tem um único modelo ou paradigma que apresenta aos usuários".

### IMAGEM ÚNICA DO SISTEMA
Segundo Pitanga (2003), a imagem única do sistema (Single System Image – SSI) é uma propriedade que visa ocultar toda a estrutura complexa, distribuída e heterogênea de um cluster de computadores aos olhos dos usuários, de forma que o agrupamento seja visto como um único computador. O SSI pode ser implementado tanto por hardware quanto por software e faz com que os usuários tenham uma visão globalizada dos recursos disponíveis, independente da quantidade de nós associados. Ele também faz o papel de garantir que o sistema continue funcionando mesmo que um ou mais nós do sistemas apresentem alguma falha e fiquem inoperantes, bem como assegurar que todos os nós do sistema fiquem ocupados e com os recursos computacionais sendo utilizados, através do gerenciamento de recursos e o escalonamento de tarefas.
Os maiores objetivos do SSI em um sistema de cluster computacional são: criar uma transparência total no gerenciamento dos recursos; garantir um sistema sempre disponível ao usuário; manter a alta escalabilidade de performance. O SSI pode ser dito como uma "ilusão" criada ou por hardware ou por software, de forma a apresentar um conjunto de recursos computacionais como se fossem um só componente.
Pitanga (2003) ainda salienta que o SSI é considerado como uma camada mediadora ( middleware), que atua entre a camada do sistema operacional e a camada do usuário. O middleware é formado por duas subcamadas: infra-estrutura de disponibilidade (AS) e a infra-estrutura de imagem única (SSI). A AS fornece ao cluster serviços relacionados a disponibilidade de dados, tais como rotinas de recuperação e tolerância a falhas e checkpoints. Já a infra-estrutura de SSI, esta presente em todos os sistemas operacionais de todos os nós para implementar a unificação dos recursos. Uma visão geral da camada middleware é demonstrada na figura 1.
 
### Sistema proposto
O sistema que fora proposto consiste em um cluster de computadores onde um certo usuario(cliente), fornecia um texto ao sistema, e ao fornecer o texto desejado, requisitaria o cluster para procurar quantas vezes uma determinada palavra que fora fornecida por ele, aparece no texto desejado. O cluster por sua vez composto por um servidor master e os seus escravos , iriam fazer essa etapa de contagem de palavras retornando ao cliente a quantidade de vezes que a determinada palavra aparece no texto.

### Arquitetura do projeto desenvolvido
O sistema é distribuído em 5 maquinas conectadas por uma rede local de alta velocidade. A primeira máquina, o cliente, envia uma requisição para o master (Head Node) que fará a distribuição para os computadores slaves (computers nodes) onde realizarão as tarefas e retornarão o resultado ao cliente.
### Funcionalidades
#### MapReduce
MapReduce é um modelo de programação desenhado para processar grandes volumes de dados em paralelo, dividindo o trabalho em um conjunto de tarefas independentes. Programas MapReduce são escritos em um determinado estilo influenciado por construções de programação funcionais, especificamente expressões idiomáticas para listas de processamento de dados.
A função Map, ou função de mapeamento, leva uma série de pares (chave / valor) processa cada um e gera zero ou mais (chave / valor) pares de saída. Os tipos de entrada e de saída do mapa podem ser (e geralmente são) diferentes umas das outras. Se o aplicativo está fazendo uma contagem de palavras, a função de mapa iria quebrar a linha em palavras e de saída de um par chave / valor para cada palavra. Cada par de saída deve conter a palavra como a chave e o número de ocorrências dessa palavra na linha como o valor. O quadro chama Reduzir função da aplicação uma vez para cada chave única na ordem de classificação.
O Reduce pode percorrer os valores que estão associados com a chave e produzir zero ou mais saídas. No exemplo a contagem de palavras, a função Reduce toma os valores de entrada, resume-os e gera uma única saída da palavra e a soma final.

#### Client Machine
Será solicitado ao cliente um arquivo em formato .txt e palavras chaves para que seja verificado a incidência dessas palavras chaves no arquivo selecionado. Por fim, será apresentado a contagem das palavras no campo de resultados.

#### Head Node
Na máquina máster é possível adicionar Slaves usando seu IP e verificar seu atual Status. Se a máquina cadastrada estiver com o programa em execução e na mesma rede, seu status estará “Ativo” e pronta para uso. Caso a máquina não atenda tais requisitos citados a cima, seu status estará “Inativo”. Será possível também excluir qualquer máquina listada.

#### Compute Node
O compute node, conhecido também como Slave, receberá o texto e as palavras para aplicar a contagem da incidência dessas palavras. A quantidade de texto será dividida pela quantidade de Slaves que estiverem disponíveis naquele momento. Dessa forma, a busca será mais eficiente e em seguida, retornada em menos tempo.
 

Referências
https://www.monografias.com/pt/trabalhos3/clusters-computacionais-alto-desempenho/clusters-computacionais-alto-desempenho2.shtml



