## Teste Baseado em Especificação

## Descrição

Este projeto tem como objetivo testar a função add(), que realiza a soma de números inteiros muito grandes representados por listas de dígitos. 
Os testes foram derivados com base no método de teste baseado em especificação, cobrindo diferentes cenários e garantindo que a função lida corretamente com diversas entradas.

## Estrutura do Projeto

 - Implementação do método add()

 - Testes automatizados utilizando JUnit

 - Relatório detalhado do processo de testes

## Processo de Teste

O processo de teste foi estruturado em várias etapas:

1. Exploração do funcionamento do programa

 - Foram realizados testes iniciais para verificar o comportamento da função add() com diferentes entradas, incluindo:

 - Números de um dígito

 - Números com múltiplos dígitos

 - Números com quantidades diferentes de dígitos

 - Casos específicos, como valores nulos e listas vazias

2. Identificação das partições

 - Foram identificadas as partições de equivalência para os parâmetros de entrada left e right, levando em consideração diferentes tipos de entrada, como valores nulos, listas vazias e listas com dígitos entre 0 e 9.

3. Identificação dos valores limite

 - Foi considerada a importância de testar valores limites, como:

 - O maior dígito permitido em uma lista

 - Listas com diferentes quantidades de dígitos

 - Listas contendo valores negativos

4. Derivação dos casos de teste

 - Com base nas partições e valores limites, foram definidos 13 casos de teste, abrangendo:

 - Soma de números com diferentes quantidades de dígitos

 - Casos excepcionais (listas nulas e vazias)

 - Casos de listas mistas (combinação de nulos e valores)
 
 - Testes de valores limites

5. Automação dos testes 
 - Os testes foram automatizados utilizando JUnit e executados via Maven, garantindo a verificação automática do comportamento esperado da função add().

 - Como Executar os Testes
 
 - Para rodar os testes automatizados, siga os passos abaixo:
  
 - Certifique-se de ter o Maven instalado.
  
 - Navegue até o diretório do projeto.
  
 - Execute o comando:
    mvn test
  
 - Os testes serão executados automaticamente e os resultados serão exibidos no terminal.

## Conclusão
  
 - A partir da automação dos testes, foi possível garantir que o método add() funciona corretamente para diversas entradas, incluindo cenários normais e casos especiais. Eventuais falhas encontradas foram corrigidas e a suíte de testes se mostrou robusta.
  
## Autor: Ricardo de Paula Xavier
