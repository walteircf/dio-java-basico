# Palavras Reservadas

## Objetivo

Apresentar as 52 palavras reservadas organizadas por classificação de usabilidade considerando as regras de linguagem

-------------------------
Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica e não podem ser usados para nomear variáveis, classes, métodos ou atributos

A linguagem Java possui 52 palavras reservadas, e são identificadas com uma cor especial pelas IDE's. 

- abstract
- assert
- boolean
- break
- byte
- case
- catch
- char
- class
- const
- continue
- default
- do
- double
- else
- extends
- final
- finally
- float
- for
- goto
- if
- implements
- import
- instaceof
- int
- interface
- long
- native
- new
- package
- private
- protected
- public
- return
- short
- static
- strictfp
- super
- switch
- synchronized
- this
- throw
- throws
- transient
- try
- vois
- volatil
- while
- 
- 

# Classificação

### Controle de Pacotes
- import: importa pacotes ou classes pra dentro do codigo
- package: especifica a que pacote todas as classes de um arquivo pertencem

### Modificadores de Acesso
- public: acesso de qualquer classe
- private: acesso apenas dentro da classe
- protected: acesso por classes no mesmo pacote e subclasses

### Tipos primitivos
- boolean: um valor indicando verdadeiro ou falso
- byte: um inteiro de 8 bits (signed)
- char: um caracter unicode(16-bit unsigned)
- double: um número de ponto flutuante de 64 bits (signed)
- float: um número de ponto flutuante de 32 bits (signed)
- int: um inteiro de 32 bits (signed)
- long: um inteiro de 64 bits (signed)
- short: um inteiro de 32 bits (signed)
- void: indica que o método não possui retorno de valor

### Modificadores de Classes, Variáveis ou Métodos
- abstract: classes/métodos que não pode ser instanciada e precisam ser implementas por subclasses não abstratas
- class: especifica uma classe
- extends: indica a superclasse que a subclasse está estendendo
- final: impossibilita que uma classe seja estendida, ou que um método seja sobrescrito ou que uma variável seja reinicializada
- implements: infica as interfaces que uma classe irá implementar
- interface: especifica uma interface
- native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C
- new: instancia um novo objeto, chamando seu construtor
- static: faz um método ou variável pertencer à classe ao invés de às instâncias
- strictfp: uasdo em frenta a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões
- synchronize: indica que um método só pode ser acesado por uma thread de cada vez
- transient: impede a serialização de campos
- volatile: indica que uma variável pode ser alterada durante o uso de threads

### Controle de Fluxo dentro de um Bloco de Código
- break: sai do bloco de codigo em que ele está
- case: executa um bloco de código dependendo do teste do switch
- continue: pula a execução do código que viria após essa linha e vai pra próxima passagem do loop

### Tratamento de erros
- assert: testa um expressão condicional para verificar uma suposição
- catch: declara o bloco de código usado para tratar uma exceção
- finally: bloco de código que é executado após o "try/catch" independente do fluxo a ser seguido na exceção
- throw: usado para passar uma exceção para o método que o chamou
- throws: indica que um método pode passar uma exceção para o método que o chamou
- try: bloco de código que tentará ser executado, que poderá causar uma exceção

### Variáveis de Referência
- super: refere-se a superclasse imediata
- this: refere-se a instância atual do objeto