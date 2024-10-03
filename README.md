# back-endAv02
Avaliação 02 da matéria Back-End

### Funcionalidades Implementadas:
- Buscar anime por ID (GET).
- Adicionar anime aos favoritos (POST).
- Listar animes favoritos (GET).

## Tecnologias Utilizadas
- Spring Boot
- Java 23
- Jikan API (https://api.jikan.moe/)

## Rotas

#1. GET http://localhost:8080/anime?animeID

Descrição:
Busca as informações de um anime pelo seu ID.

Parâmetros:
animeID (requerido): O ID do anime na API Jikan.

Exemplo de Requisição:
http://localhost:8080/anime?animeID=31240

Exemplo de Resposta:
```json
{
		"ID": 31240,
		"Título default": "Re:Zero kara Hajimeru Isekai Seikatsu",
		"Título em Inglês": "Re:ZERO -Starting Life in Another World-",
		"Pontuação": 8.23,
		"Episódios": 25,
		"Ano": 2016,
		"Sinopse": "When Subaru Natsuki leaves the convenience store, the last thing he expects is to be wrenched from his everyday life and dropped into a fantasy world. Things are not looking good for the bewildered teenager; however, not long after his arrival, he is attacked by some thugs. Armed with only a bag of groceries and a now useless cell phone, he is quickly beaten to a pulp. Fortunately, a mysterious beauty named Satella, in hot pursuit after the one who stole her insignia, happens upon Subaru and saves him. In order to thank the honest and kindhearted girl, Subaru offers to help in her search, and later that night, he even finds the whereabouts of that which she seeks. But unbeknownst to them, a much darker force stalks the pair from the shadows, and just minutes after locating the insignia, Subaru and Satella are brutally murdered.\n\nHowever, Subaru immediately reawakens to a familiar scene—confronted by the same group of thugs, meeting Satella all over again—the enigma deepens as history inexplicably repeats itself.\n\n[Written by MAL Rewrite]"
	}
```
----
#2. POST http://localhost:8080/favoritos

Descrição:
Adiciona um anime aos favoritos com base no ID fornecido.

Parâmetros:
animeID (requerido): O ID do anime a ser adicionado aos favoritos.

Exemplo de Requisição:
```json
{
 "animeID" : "31240"
}
```

Exemplo de Resposta:
```
"Anime adicionado aos favoritos!"
```
----

#3. GET http://localhost:8080/favoritos

Exemplo de Resposta:
```json
[
	{
		"ID": 9253,
		"Título default": "Steins;Gate",
		"Título em Inglês": "Steins;Gate",
		"Pontuação": 9.07,
		"Episódios": 24,
		"Ano": 2011,
		"Sinopse": "Eccentric scientist Rintarou Okabe has a never-ending thirst for scientific exploration. Together with his ditzy but well-meaning friend Mayuri Shiina and his roommate Itaru Hashida, Okabe founds the Future Gadget Laboratory in the hopes of creating technological innovations that baffle the human psyche. Despite claims of grandeur, the only notable \"gadget\" the trio have created is a microwave that has the mystifying power to turn bananas into green goo.\n\nHowever, when Okabe attends a conference on time travel, he experiences a series of strange events that lead him to believe that there is more to the \"Phone Microwave\" gadget than meets the eye. Apparently able to send text messages into the past using the microwave, Okabe dabbles further with the \"time machine,\" attracting the ire and attention of the mysterious organization SERN.\n\nDue to the novel discovery, Okabe and his friends find themselves in an ever-present danger. As he works to mitigate the damage his invention has caused to the timeline, Okabe fights a battle to not only save his loved ones but also to preserve his degrading sanity.\n\n[Written by MAL Rewrite]"
	},
	{
		"ID": 31240,
		"Título default": "Re:Zero kara Hajimeru Isekai Seikatsu",
		"Título em Inglês": "Re:ZERO -Starting Life in Another World-",
		"Pontuação": 8.23,
		"Episódios": 25,
		"Ano": 2016,
		"Sinopse": "When Subaru Natsuki leaves the convenience store, the last thing he expects is to be wrenched from his everyday life and dropped into a fantasy world. Things are not looking good for the bewildered teenager; however, not long after his arrival, he is attacked by some thugs. Armed with only a bag of groceries and a now useless cell phone, he is quickly beaten to a pulp. Fortunately, a mysterious beauty named Satella, in hot pursuit after the one who stole her insignia, happens upon Subaru and saves him. In order to thank the honest and kindhearted girl, Subaru offers to help in her search, and later that night, he even finds the whereabouts of that which she seeks. But unbeknownst to them, a much darker force stalks the pair from the shadows, and just minutes after locating the insignia, Subaru and Satella are brutally murdered.\n\nHowever, Subaru immediately reawakens to a familiar scene—confronted by the same group of thugs, meeting Satella all over again—the enigma deepens as history inexplicably repeats itself.\n\n[Written by MAL Rewrite]"
	}
]
```

----

#4. GET http://localhost:8080/sobre

Resposta:
```json
{
  "estudante": "Igor Steiner de Souza",
  "projeto": "Requisição de Animes"
}
```
