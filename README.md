# Sumário
+ [Escopo do projeto](#escopo)
  - [Por que criar um co-piloto para cozinheiros?](#por-que-criar-um-co-piloto-para-cozinheiros)
  - [Finalidade do projeto](#finalidade-do-projeto)
  - [Objetivos do projeto](#objetivos-do-projeto)
  - [Descrição do produto](#descrição-do-produto)
+ [Arquitetura](#arquitetura)
  - [Modelo de desenvolvimento](#modelo-de-desenvolvimento)
  - [Classes do projeto](#classes-do-projeto)
  - [Arquitetura Back-end](#arquitetura-back-end)
+ [Tabela de endpoints](#endpoints)

# Escopo
Escopo do projeto redigido para fins de avaliação.
<br><br>

## Por que criar um co-piloto para cozinheiros?
Devido ao [aumento de cozinheiros durante e depois a pandemia de COVID-19](https://www.terra.com.br/noticias/mais-de-40-dos-brasileiros-continuarao-cozinhando-em-casa-no-pos-pandemia,ddd18544be75d4c153a4ce7d1ab7d151855p84uf.html#:~:text=Um%20dos%) e também ao [aumento de consumo de conteúdo sobre receitas](https://www.terra.com.br/noticias/dino/durante-quarentena-culinaria-se-torna-hobbie-de-brasileiros,0843136dceb4e829ea711d0d1009921d7a6pyool.html) em sites como Youtube, nós concluímos que um aplicativo que auxilie o dia-a-dia na cozinha terá grnade valor para aqueles que gostam de cozinhar.
<br><br>

## Finalidade do projeto:
Desenvolver um aplicativo mobile que tenha como diferencial a utilização de inteligência artificial e praticidade de uso durante a tarefa de preparar alimentos.
<br><br>

## Objetivos do projeto:
- Utilizar a tecnologia para auxiliar de maneira interativa a confecção de receitas culinárias.
- Consolidar ainda mais a utilização de sistemas de chatbots.
- Entregarvalor às pessoas que cozinham por meio do uso da inteligência artificial e da praticidade ao utilizar o aplicativo.
<br><br>

## Descrição do produto
**Chefbot** é um aplicativo mobile que age como co-piloto para cozinheiros e tem como principal funcionalidade um agente conversacional que interage com o usuário enquanto o mesmo realiza suas tarefas culinárias. <br>
O usuário cadastra os ingredientes disponíveis no aplicativo e, por meio de inteligência artificial, o Chefbot informa todas as receitas possíveis de serem feitas. O cadastro de ingredientes é feito por meio da troca de mensagens com o Chefbot, ou também ao *enviar uma foto do ingrediente*.<br>
Ao escolher uma receita, seu modo de preparo e uma listagem de ingredientes é exibida. O usuário pede ao *Chefbot para ditar o modo de preparo por áudio*, assim o mesmo não precisa ficar pegando o celular na mão enquanto cozinha.
<br><br>

# Arquitetura
Diagramas dos modelos arquiteturais utilizados no desenvolvimento e deploy do projeto.
## Modelo de desenvolvimento
A API segue a arquitetura MVC
<p align="center">
  <img src="https://user-images.githubusercontent.com/54187661/182717628-16f717fd-97ff-47ad-8279-86b28fb9c92a.png" />
</p>

## Classes do projeto
esse diagrama pode ser atualizado
PRECISA ADICIONAR O MÉTODO 'listagemLogica' nos Services e Repositories
<p align="center" >
  <img width="90%" src="https://user-images.githubusercontent.com/54187661/182870002-a6b05121-c199-425f-b88f-3c8870d9228d.png" />
</p>

## Arquitetura back-end
<p align="center" >
  <img width="90%" src="https://user-images.githubusercontent.com/54187661/183174999-d66f7774-3f2f-4feb-81bc-e32613cb8112.png" />
</p>




# Endpoints
<p align="center" >
  <img width="90%" src="https://user-images.githubusercontent.com/54187661/184354077-657b45b7-bc0f-405d-b60c-829e7e5727ea.png" />
</p>
Essa tabela pode (e deve) ser atualizada posteriormente.


