# Abstract Factory

O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

## Conceito

Prover uma interface para criar familias de objetos relacionados ou dependentes sem especificar suas classes concretas.
##
### Problema 

Imagina que está criando um fabrica que simula a criação de celulares IPhone. Todos os IPhone consiste existe algo em comum, como:

- Hardware
- Montagem
- Certificado
- Empacotamento

Como ter um jeito de criar objetos de IPhone individuais, para que cada tipo de IPhone tenha a sua própria regra de certificado e empacotamento de cada País, e ainda não precisar mudar o código existente quando adicionar novos Paises com suas regras especificas.

- Como escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface?
- Como garantir que um conjunto de objetos relacionados (ou dependentes) possam ser criados mantendo o contexto único?

### Solução

- Extrair a lógica de criação de objetos para um `abstract factory`.
- Criar uma implementação do abstract factory para cada contexto (cenário da aplicação), garantindo que todos os objetos criados estejam relacionados. 

A primeira coisa que o padrão Abstract Factory sugere é declarar explicitamente interfaces para cada produto distinto da família de produtos(ex: Certificate, Packing).
Então por exemplo, todas as classes que especifica o tipo de certificado de cada IPhone devem implementar interface `Certificate`, todas as classes que especifica o tipo de empacotamento de cada IPhone, devem implementar interface `Packing` 

![Certificate_Packing](https://github.com/igor-lourenco/design-pattern-creational-abstract-method/blob/main/uml/interface_Certificate_Packing.png)


O próximo passo é declarar a fabrica abstrata (abstract factory), uma interface com um lista de métodos de criação para todas as regras que fazem parte de cada País(por exemplo, getCertificate). Esses métodos devem retornar tipos abstratos das regras representados pelas interfaces que foi extraído previamente: `Certificate`, `Packing`.

![country_factory](https://github.com/igor-lourenco/design-pattern-creational-abstract-method/blob/main/uml/interface_Pais.png)

Para cada variante de uma família de regras nós criamos uma classe fábrica separada baseada na interface `CountryRulesAbstractFactory`. Uma classe fábrica é uma classe que retorna as regras de um Pais em particular. Por exemplo, a classe `BrazilianRulesAbstractFactory` só pode criar objetos `BrazilianCertificate`, `BrazilianPacking`

![interface_brazilian](https://github.com/igor-lourenco/design-pattern-creational-abstract-method/blob/main/uml/interface_Brazilian.png)

O código tem que funcionar com ambas as fábricas e regras via suas respectivas interfaces abstratas. Isso permite que você mude o tipo de uma fábrica que passou para o código cliente, bem como a variante do produto que o código cliente recebeu, sem quebrar o código cliente atual.

Digamos que o cliente quer adicionar um novo país com suas regras(por exemplo AfricaRulesAbstractFactory), O cliente não precisa estar ciente da classe fábrica, e nem se importar que tipo de regra ele receberá, o cliente precisa tratar todas as regras de cada País da mesma maneira, usando a interface `Certificate`, `Packing`.

Com essa abordagem, a única coisa que o cliente sabe sobre a regra de empacotamento e certificado do País é que ela implementa o método pack() e applyCertification() de alguma maneira. E também, seja qual for a variante da regra retornada, ela sempre irá combinar com o tipo de regra do País produzida pelo mesmo objeto fábrica (`CountryRulesAbstractFactory`).


![codigo](https://github.com/igor-lourenco/design-pattern-creational-abstract-method/blob/main/uml/codigo.png)


### Observação:

Se o cliente está exposto apenas às interfaces abstratas, o que realmente cria os objetos fábrica então?
O programa cria um objeto fábrica concreto no estágio de inicialização(instancia o objeto). Antes disso, o programa deve selecionar o tipo de fábrica dependendo da configuração ou definições de ambiente.

![interface_brazilian](https://github.com/igor-lourenco/design-pattern-creational-abstract-method/blob/main/uml/explicacao.png)

#### Diagrama completo

![uml_completo](https://github.com/igor-lourenco/design-pattern-creational-abstract-method/blob/main/uml/uml_completo.png)









