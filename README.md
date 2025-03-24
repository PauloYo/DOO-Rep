# README - Calculadora Java

## Descrição
Este projeto implementa uma calculadora simples em Java que realiza operações básicas de matemática (soma, subtração, multiplicação e divisão). O programa utiliza um padrão de design Factory para criar objetos de operação dinamicamente.

## Estrutura do Projeto
```
calculadora/
├── Calculadora.java         # Classe principal com o método main
├── factory/
│   └── Factory.java         # Implementação do padrão Factory
└── models/
    ├── Divisao.java         # Implementação da operação de divisão
    ├── Multiplicacao.java   # Implementação da operação de multiplicação
    ├── Operadores.java      # Interface para todas as operações
    ├── Soma.java            # Implementação da operação de soma
    └── Subtracao.java       # Implementação da operação de subtração
```

## Funcionalidades
- Realiza cálculos com dois números inseridos pelo usuário
- Suporta operações de soma, subtração, multiplicação e divisão
- Interface de linha de comando simples e intuitiva
- Verificação de divisão por zero

## Como Usar
1. Compile os arquivos Java do projeto
2. Execute a classe `Calculadora`
3. Siga as instruções no console:
   - Insira o primeiro número
   - Insira o segundo número
   - Escolha uma operação digitando: Soma, Subtracao, Multiplicacao, Divisao, ou Sair

## Observações
- O programa continuará executando até que o usuário escolha a opção "Sair"
- Em caso de divisão por zero, uma exceção será lançada
- Há um bug conhecido no arquivo Factory.java: o caminho do pacote está incorreto (deveria ser "calculadora.models." em vez de "top10calculadoras.models.")

## Requisitos
- JDK 8 ou superior
- Conhecimento básico de linha de comando para compilação e execução

## Como Contribuir
1. Faça um fork do projeto
2. Crie uma branch para sua feature
3. Faça commit das suas alterações
4. Envie um pull request

## Licença
Este projeto é distribuído sob a licença MIT.
