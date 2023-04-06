# Projeto de Gerenciamento de Conteúdo para Desenvolvedores

Este projeto visa gerenciar o conteúdo de desenvolvedores, incluindo cursos, mentorias e bootcamps. As classes abaixo fazem parte desse projeto.

## Classe Content

Essa é uma classe abstrata que representa o conteúdo que pode ser feito pelos desenvolvedores. Ela tem os seguintes atributos:

- `title`: o título do conteúdo.
- `description`: a descrição do conteúdo.
- `XP_DEFAULT`: uma constante que define o valor padrão de XP que um desenvolvedor ganha por concluir um conteúdo.

Além disso, a classe possui o método abstrato `calculateXp()` que deve ser implementado por suas subclasses e que retorna a quantidade de XP que um desenvolvedor ganha por concluir o conteúdo.

## Classe Course

Essa classe é uma subclasse de `Content` e representa um curso. Ela possui o seguinte atributo:

- `workload`: a carga horária do curso.

A classe sobrescreve o método `calculateXp()` da superclasse para retornar o valor de XP calculado a partir da carga horária do curso.

## Classe Mentoring

Essa classe é outra subclasse de `Content` e representa uma mentoria. Ela possui o seguinte atributo:

- `data`: a data da mentoria.

A classe sobrescreve o método `calculateXp()` da superclasse para retornar o valor de XP padrão mais 20.

## Classe Dev

Essa classe representa um desenvolvedor. Ela possui os seguintes atributos:

- `name`: o nome do desenvolvedor.
- `contentsDoing`: um conjunto de conteúdos que o desenvolvedor está fazendo no momento.
- `contentsDone`: um conjunto de conteúdos que o desenvolvedor já concluiu.

A classe possui os seguintes métodos:

- `registerBootcamp()`: registra o desenvolvedor em um bootcamp e adiciona todos os conteúdos do bootcamp ao conjunto `contentsDoing`.
- `progress()`: move o primeiro conteúdo do conjunto `contentsDoing` para o conjunto `contentsDone`.
- `calculateTotalXp()`: calcula o total de XP que o desenvolvedor ganhou por concluir os conteúdos no conjunto `contentsDone`.

A classe sobrescreve os métodos `hashCode()` e `equals()` para permitir a comparação de desenvolvedores com base no nome, conjunto de conteúdos em andamento e conjunto de conteúdos concluídos.
