# Cadastro de Aluno

![](/img/tela-inicial.png/)

---

Hey, do you not read in portuguese :brazil:? Click [here](#abstract-in-english) to read in English :us: an abstract about this repository! 

O Cadastro de Aluno foi um projeto acadêmico desenvolvido para a disciplina de Técnicas de Programação, com objetivo de aprofundar o conhecimento na linguagem Java e aplicar conceitos do padrão MVC.

A proposta era desenvolver um sistema que permitisse cadastrar alunos, alterar seus registros, consultar suas informações e excluir caso preciso. Essas ações ficam disponíveis no menu **Aluno** :student:.

![](/img/menu-aluno-opcoes.png)

## Curso

![](/img/tela-curso.png)

O painel de **Curso** apresenta o curso, campus e período que o aluno estuda. Essas informações são armazenadas também através do menu _Aluno_.

## Notas e Faltas

O sistema também permite a inserção das notas desses estudantes.

![](/img/tela-notas.png)

Assim como o cadastro dos alunos, as notas podem receber as operações de salvar, alterar, consultar e excluir, disponíveis no menu **Notas e Faltas** :bookmark_tabs:.

## Boletim

Criado o aluno e inserido suas notas, é hora de gerar o _Boletim_ :scroll:.

![](/img/tela-boletim.png)

A tela de **Boletim** ficou a cargo de cada aluno desenvolver a sua. A única sugestão adicional do professor foi a inserção do JTable, para melhor visualização. É uma tela que pede somente o RGM do aluno para retornar suas principais informações.

## Listagem

![](/img/tela-listagem.png)

A tela de **Listagem** foi ideia minha e uma funciolidade adicional ao sistema. O funcionamento dela é muito simples: Retorna todos os alunos cadastrados no sistema. Literalmente é um _SELECT_ da tabela de alunos. Com essas informações básicas do aluno, é possível realizar com mais consciência ações como consultar ou alterar algum registro.

---

# Validação

![](/img/validacao.png)

A validação era um dos requisitos para a entrega definitiva do projeto. Todos os campos digitáveis contém algum tipo de validação quanto ao preenchimento. Por exemplo, se estiveressem vazios, uma mensagem será mostrada ao usuário. Os campos de _RGM_ só irão aceitar números, e o campo _NOME_ somente aceitará letras.

Neste projeto a validação se limitou ao que era digitado nos campos, logo, validações mais completas como verificar se um determinado RGM ou CPF já existe no banco de dados, não foram inseridas. 

---

# Desenvolvimento

Feito em Java (JDK 8) com Window Builder.

## Softwares utilizados

- Eclipse IDE
- WampServer (MySQL 5.7.26)
- MySQL Workbench 8

---

## Abstract in English

This is an academic project developed in Java for the discipline of Programming Techniques. The system created allows registering students, changing their information, inserting notes, and generating a student report card. - Google Translate (I am a beginner in English :smile:).
