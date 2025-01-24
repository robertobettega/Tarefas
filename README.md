# ATIVIDADE TÉCNICA ESIG GROUP - GERENCIADOR DE TAREFAS

Esse projeto foi proposto como processo seletivo para o cargo de desenvolvedor Fullstack. O desafio foi construir uma aplicação de gerenciamento de tarefas com as tecnologias propostas pela empresa.

## A APLICAÇÃO
O sistema proposto pela tarefa consiste em um gerenciador de tarefas com as funcionalidades de um CRUD. Além disso, o sistema deveria autenticar o usuário com a tecnologia proposta.

## EXECUÇÃO

O sistema foi desenvolvido em 2 projetos. Um para o front-end e outro para o beck-end, em que a comunicação entre ambos é realizada por uma API REST. Sobre a criação dos projetos, o projeto beck-end nomeado "Tarefas" foi gerado pelo Spring Initializr como mostrado na imagem abaixo. Já o projeto de front, foi gerado via terminal por instalação do Angular por npm e comando para criar novo projeto.

![image](https://github.com/user-attachments/assets/d7c7ddda-b403-4149-b0e0-7410c7bd439c)

A partir disso, a aplicação foi criada utilizando o MAVEN como gerenciador de dependências, sendo aplicadas as seguintes tecnologias de acordo com os itens exigidos:

a) Criar uma aplicação Front-end utilizando Angular na versão mais recente.
b) Desenvolver o back-end utilizando Java 21 e Spring Boot 3.
c) Utilizar persistência em um banco de dados PostgreSQL e persistência JPA.
d) Os endpoints devem ser em REST.
e) A aplicação deverá ter um controle de login por usuário e senha e os
endpoints devem autenticar através de token JWT.

Com essas ferramentas foi possível criar uma aplicação visualmente agrádável e intuitiva, com o devido tratamento de dados na camada de persistência e contando com tratamento de erros simples.

![image](https://github.com/user-attachments/assets/6e818cb4-ce55-4daa-bd5b-d948aae71402)
![image](https://github.com/user-attachments/assets/0979ad1c-e36d-4589-b09e-6a22174eeb43)

## Guia de execução dos projetos
* Em uma pasta inicialize um repositório e clone os projetos
```bash
$ git init
$ git clone https://github.com/robertobettega/Tarefas.git
```
```bash
$ git init
$ git clone https://github.com/robertobettega/Tarefas-front.git
```
* Utilizando sua IDE de preferência (o projeto beck-end foi desenvolvido no IntelliJ e o front-end no VS Code) importe o projeto clonado como um projeto MAVEN.
* Atualize o arquivo persistence.xml para seu banco de dados
* Rode sua aplicação de back dando start no arquivo 'TarefasApplication.java', e roda sua aplicação de front com o comando "ng serve" em seu terminal.


## Pendencias
* Não foi possível lidar a tempo com os bugs da aplicação antes de seu envio. Não houve tempo suficiente para realização de testes.

  
  
