# simple-api-spring-boot

API DESENVOLVIDA USANDO JAVA E SPRING BOOT PARA O TRABALHO DA DISCIPLINA DE DESENVOLVIMENTO WEB.

ALUNOS: GABRIEL DA SILVA HAAS, PEDRO GABRIEL CORDEIRO E SILVA E ROMEU FUCHS FERREIRA.


**Player API**
Esta API permite a criação, recuperação, atualização e exclusão de jogadores no sistema. Abaixo está a lista de endpoints disponíveis:

1. Criar um jogador
Método: POST
Endpoint: /player/
Descrição: Cria um novo jogador no sistema.
Resposta: Retorna o jogador criado com seus detalhes.


2. Listar todos os jogadores
Método: GET
Endpoint: /player/players
Descrição: Retorna uma lista de todos os jogadores no sistema.
Resposta: Uma lista de jogadores


4. Buscar jogador por ID
Método: GET
Endpoint: /player/{id}
Descrição: Retorna os detalhes de um jogador específico usando seu UUID.
Parâmetros:
id: O UUID do jogador.
Resposta: Um objeto do jogador


5. Atualizar jogador
Método: PUT
Endpoint: /player/{id}
Descrição: Atualiza os dados de um jogador existente.
Parâmetros:
id: O UUID do jogador que deseja atualizar.


6. Deletar jogador
Método: DELETE
Endpoint: /player/{id}
Descrição: Deleta um jogador específico do sistema usando seu UUID.
Parâmetros:
id: O UUID do jogador a ser deletado.
Resposta: Uma mensagem confirmando a exclusão.




**Payment API**
Esta API permite a criação, recuperação e exclusão de pagamentos associados a jogadores no sistema. Abaixo está a lista de endpoints disponíveis:

1. Criar um pagamento
Método: POST
Endpoint: /payments/
Descrição: Cria um novo pagamento associado a um jogador.
Resposta: Retorna o pagamento criado com seus detalhes.


2. Listar todos os pagamentos
Método: GET
Endpoint: /payments/payments
Descrição: Retorna uma lista de todos os pagamentos registrados no sistema.
Resposta: Uma lista de pagamentos


3. Buscar pagamento por ID
Método: GET
Endpoint: /payments/{id}
Descrição: Retorna os detalhes de um pagamento específico usando seu UUID.
Parâmetros:
id: O UUID do pagamento.
Resposta: Um objeto com os detalhes do pagamento.


4. Deletar pagamento
Método: DELETE
Endpoint: /payments/{id}
Descrição: Deleta um pagamento específico do sistema usando seu UUID.
Parâmetros:
id: O UUID do pagamento a ser deletado.
Resposta: Uma mensagem confirmando a exclusão








