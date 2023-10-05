# Livraria Utopia 📖
 
O projeto da livraria em Java é uma aplicação web desenvolvida com o framework Spring que permite aos usuários gerenciar livros. O principal problema que ele resolve é a organização de livros online, proporcionando uma experiência conveniente aos amantes da leitura.

Decidi fazer esse projeto para aprimorar minhas habilidades em desenvolvimento web com o Spring e criar uma aplicação prática que pudesse ser útil para pessoas que desejam comprar livros de forma online.

Os desafios de implementação incluíram a configuração inicial do projeto Spring Boot, o design da estrutura de dados para armazenar informações sobre livros e a criação de páginas web dinâmicas usando Thymeleaf.

Com este projeto, aprendi a:

Utilizar o Spring Boot para configurar rapidamente uma aplicação web.
Desenvolver uma interface do usuário interativa e responsiva usando Thymeleaf.
Testar e depurar aplicativos web de forma eficaz.
Além disso, ganhei experiência na criação de um projeto completo, desde a concepção até a implantação, e a importância de documentar o código para facilitar a manutenção e colaboração futura. Este projeto foi uma oportunidade valiosa para aplicar meus conhecimentos em um contexto prático e desafiador.


## Índice


- [Arquitetura](#arquitetura)
- [Tecnologias](#tecnologias)
- [Colaboradores](#colaboradores)
- [Executando o Projeto](#executando)



## Arquitetura

Minha aplicação de livraria segue uma arquitetura organizada em várias camadas para garantir a eficiência e a modularidade. Aqui está como eu estruturei o projeto:

1. **Camada de Apresentação**:
   - Na camada de apresentação, eu utilizei HTML e CSS para criar a interface do usuário (UI). Isso envolve a criação de páginas web para listar livros, exibir o carrinho de compras e apresentar formulários de login e checkout, entre outras funcionalidades.
   - Para tornar as páginas web dinâmicas, eu utilizei Thymeleaf, uma ferramenta que permite incorporar dados Java diretamente nas páginas HTML, tornando-as interativas.
   - A camada de apresentação se comunica com a camada de controle para processar as solicitações dos usuários e exibir informações.

2. **Camada de Controle**:
   - Nesta camada, eu criei controladores Spring para receber solicitações HTTP dos usuários. Esses controladores processam as solicitações e as direcionam para os serviços apropriados.
   - Eu utilizei anotações do Spring, como `@Controller` e `@RequestMapping`, para mapear URLs para métodos específicos que lidam com solicitações HTTP.
   - A camada de controle age como uma ponte entre a camada de apresentação e a camada de serviço.

3. **Camada de Serviço**:
   - Aqui, eu implementei a lógica de negócios da minha aplicação. Isso inclui operações como adicionar livros ao carrinho, calcular o total da compra, processar pedidos, gerenciar contas de usuário e interagir com o banco de dados.
   - O Spring foi fundamental para a criação de serviços que encapsulam a lógica de negócios e fornecem funcionalidades reutilizáveis para os controladores.


Esta arquitetura em camadas me ajudou a manter minha aplicação organizada, facilitando a manutenção e permitindo que eu adicione novos recursos à medida que o projeto evolui. Além disso, a modularidade torna mais fácil desenvolver e testar partes específicas da aplicação separadamente. Seguir as melhores práticas de desenvolvimento Spring e Java foi essencial para o sucesso do projeto.

## Executando

Siga estas etapas para executar o projeto em sua máquina local.

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu sistema:

- [Java](https://www.oracle.com/java/) (versão 8 ou superior)
- [Maven](https://maven.apache.org/) (opcional, mas recomendado)

### Clonando o Repositório

Clone este repositório em sua máquina local:

```bash
git clone https://github.com/Rvictorio/livraria.git
```

## Tecnologias 
* JAVA
* Intellij IDEA
* HTML
* CSS
  
## Colaboradores:
<table>
  <tr>
    <td align="center">
      <a href="http://github.com/rvictorio">
        <img src="https://avatars.githubusercontent.com/rvictorio" width="100px;" alt="Foto de Rafael Victorio no GitHub"/><br>
        <sub>
          <b>Rafael</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
