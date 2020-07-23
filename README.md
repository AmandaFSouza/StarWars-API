# StarWars-API
API RESTFul para criação de jogo com o tema Starwars, desenvolvida em Java utilizando Spring Boot e MongoDB para banco de dados.

# Como executar a aplicação
Certifique-se que o Maven e o Spring Tool Suite esteja instalado corretamente.
Com o projeto aberto em uma IDE para desenvolvimento Java, clique com o botão direito sobre o projeto, depois clique em Run As e em seguida Spring Boot App.

# End Points
Método GET:

Para listar todos os planetas utilize a url http://localhost:8080/api/planetas/

Para buscar um planeta pelo seu id utilize a url http://localhost:8080/api/planetas/id/{id} -> substituir "{id}" pelo id desejado.

Para buscar um planeta pelo seu nome utilize a url http://localhost:8080/api/planetas/nome/{nome} -> substituir "{nome}" pelo nome desejado.


Método POST:

Para salvar um novo planeta utilize a url http://localhost:8080/api/planetas/

Método DELETE:

Para deletar um planeta utilize a url http://localhost:8080/api/planetas/{id} -> substituir "{id}" pelo id desejado.

