# FIAP Bank ATM - Checkpoint 1

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

Protótipo de um terminal de Autoatendimento (Caixa Eletrônico) desenvolvido como parte do **Checkpoint 1** da disciplina de **Domain Driven Design - Java** no curso de Engenharia de Software da FIAP.

## 📌 O Projeto

O **FIAP Bank ATM** é uma aplicação de console que simula o fluxo completo de um cliente em um caixa eletrônico, desde o cadastro de uma senha segura até a realização de operações bancárias fundamentais.

### Funcionalidades
- **Cadastro de Usuário:** Captura o nome completo e extrai o primeiro nome para uma saudação personalizada.
- **Validação de Senha Forte:** Sistema de verificação via Regex que exige:
  - Mínimo de 8 caracteres.
  - Pelo menos um número.
  - Pelo menos uma letra maiúscula.
  - Pelo menos um caractere especial (!@#$%^&*()-_+=?><).
- **Autenticação Segura:** Login com limite de 3 tentativas antes do bloqueio do sistema.
- **Menu de Operações:**
  - Consulta de saldo formatado.
  - Depósitos (com validação de valores positivos).
  - Saques (com validação de saldo insuficiente e valores negativos).

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17+
- **Entrada de Dados:** `java.util.Scanner`
- **Ferramentas:** Git & GitHub

## 🚀 Como Executar

1. Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
2. Clone o repositório:
  ```bash
    git clone https://github.com/Kaue-deAlmeida/fiap-ddd-java-checkpoint1-atm.git
   ```
3. Navegue até a pasta do projeto:
  ```bash
  cd fiap-ddd-java-checkpoint1-atm
  ```
4. Compile o arquivo:
  ```bach
    javac FiapBankAtm.java
  ```
5. Execute a aplicação:
  ```bash
    java FiapBankAtm
  ```

Desenvolvido por: Kauê de Almeida

Turma: 2ESPH - Engenharia de Software FIAP

Professor: Eduardo dos Santos Ramos
