 Sistema de Gerenciamento de Biblioteca em Java
Esse projeto é um sistema simples de gerenciamento de itens de biblioteca (focando em Livros) desenvolvido em Java, utilizando os conceitos de Programação Orientada a Objetos (POO), como Herança, Encapsulamento e Polimorfismo.


O sistema foi estruturado em três classes principais, demonstrando como a herança simplifica a gestão de itens genéricos:

1. ItemBiblioteca (Classe Mãe / Superclasse)
Define as características e funcionalidades básicas que todo item da biblioteca deve ter.

Atributos: titulo, anoPublicado, disponivel (estado atual do item).

Métodos: emprestar(), devolver(), verDetalhes(). Esta classe garante que a lógica de empréstimo/devolução seja centralizada e reutilizável.

2. Livro (Classe Filha / Subclasse)
Estende a classe ItemBiblioteca, herdando todos os seus atributos e métodos.

Herança: Utiliza extends ItemBiblioteca. Atualmente, Livro não adiciona atributos únicos, mas herda toda a funcionalidade do item genérico.

3. App (Classe Principal)
Contém o método main, inicializa a coleção de livros (ArrayList) e gerencia a interface do usuário via terminal (Scanner e switch).


Funcionalidades do Menu
O usuário interage com o sistema através de um menu de console intuitivo:

Ver lista de livros: Exibe o título e o status ((Disponível) ou (Emprestado)) de todos os itens no ArrayList.

Ver detalhes de um livro: Exibe o título, ano de publicação e status atual.

Emprestar livro: Muda o status do livro selecionado para Emprestado, se estiver Disponível. Caso contrário, exibe uma mensagem de erro.

Devolver livro: Muda o status do livro selecionado para Disponível, se estiver Emprestado. Caso contrário, exibe uma mensagem de erro.

Sair (0): Encerra o programa.

