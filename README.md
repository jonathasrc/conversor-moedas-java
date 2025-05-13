
---

# Conversor de Moedas Java

Este projeto é um conversor de moedas desenvolvido em Java. Ele consome taxas de câmbio dinâmicas através de uma API e
permite a conversão entre diversas moedas a partir de uma interface de console.

## Recursos

- **Conversão Dinâmica:** Utiliza dados atualizados de uma API para aplicar as taxas de câmbio.
- **Interface de Console:** Menu interativo que permite ao usuário selecionar a moeda desejada e inserir o valor para
  conversão.
- **Validação e Tratamento de Erros:** Verifica se as entradas do usuário são válidas e trata exceções para evitar
  falhas na aplicação.
- **Arquitetura Modular:** Organização baseada em conceitos de MVC (Model, View, Controller) para facilitar a manutenção
  e a evolução do projeto.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
conversor-moedas-java/
├── pom.xml                   # Arquivo de configuração do Maven (se utilizado)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── convertercurrency/
│   │   │           ├── model/         # Classes que representam os dados (ex.: ExchangeRates)
│   │   │           ├── view/          # Classes responsáveis pela interface com o usuário
│   │   │           │   └── ConverterCurrency.java  
│   │   │           ├── controller/    # Lógica de controle (ex.: regras de conversão)
│   │   │           └── service/       # Consumo da API e regras de negócio (ex.: ExchangeCurrencyService)
│   │   └── resources/         # Arquivos de configuração e recursos adicionais
│   └── test/
│       └── java/              # Testes unitários e de integração
```

## Pré-requisitos

- **Java JDK 21** ou superior.
- (Opcional) **Maven** ou **Gradle** para gerenciamento das dependências e build do projeto.
- Conexão à internet para o consumo da API de taxas de câmbio.

## Instalação e Execução

1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/jonathasrc/conversor-moedas-java.git
   cd conversor-moedas-java
   ```
2. **Compile o Projeto:**
   Se estiver usando Maven:
   ```bash
   mvn clean install
   ```
   Você também pode importar o projeto na sua IDE favorita (como IntelliJ IDEA ou Eclipse) e compilar diretamente.

3. **Execute a Aplicação:**

   Se você utilizou Maven e gerou um JAR, rode:
   ```bash
   java -cp target/conversor-moedas-java.jar com.jonathasrc.view.ConverterCurrency
   ```

   Ajuste o comando de acordo com a estrutura gerada e o nome do JAR.

## Uso

Ao iniciar a aplicação, o menu de opções será exibido no console, permitindo selecionar a moeda de destino para
conversão. Um exemplo do menu exibido:

```
Bem-vindo ao Conversor de Moedas
Escolha uma opção:
1 - Converter de BRL para ARS
2 - Converter de BRL para BOB
3 - Converter de BRL para USD
4 - Converter de BRL para CLP
5 - Converter de BRL para COP
6 - Converter de BRL para BRL
0 - Sair
```

Após escolher uma opção, o usuário inserirá o valor a ser convertido e o sistema exibirá o resultado com base nas taxas
dinâmicas obtidas pela API.

## Contribuindo

Contribuições são bem-vindas! Caso queira sugerir melhorias ou corrigir algum bug, sinta-se à vontade para abrir uma
issue ou enviar um pull request. Siga as boas práticas de commits utilizando mensagens como:

- `feat`: Para novas funcionalidades.
- `fix`: Para correção de bugs.
- `refactor`: Para melhorias no código sem alterar a funcionalidade.

Exemplo de commit:

```bash
git commit -m "feat(view): melhora exibição do menu de conversão"
```

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## Contato

Desenvolvido por [Jonathas](https://github.com/jonathasrc)

---

Divirta-se e boas conversões! 🚀

---

Este README oferece uma visão completa do projeto, orienta sobre como instalar e executar, além de facilitar a
colaboração. Se precisar de ajustes ou informações adicionais, é só atualizar o arquivo.