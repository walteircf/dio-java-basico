# Definição de método

- Métodos são funções ou sub-rotinas de uma classe que pode, ou nao, receber parametros e possuir, ou não, um retorno.

## Convenção de nomenclatura dos métodos

Os critérios não são obrigatórios mas são recomendados para facilitar a compreensão e legibilidade do código. Os critérios são:
- Deve ser nomeado como verbo
```
"acelerar()"; "frear()"; "somar()"; "abrirConexao(){}"
```
- Seguir o padrão camelCase
- Atribuir apenas uma ação para cada método

## Critério de definição de métodos
- Voce deve se perguntar qual a finalidade do método
- Analisar se ele será responsável por retornar algum valor

Caso o método não retorne nenhum valor, ele será definido como "void"

- Quais parametros necessários para execução?

Verificar o que é necessário para o funcionamento

- Possui risco de apresentar exceção?

Prever e tratar possiveis erros que possa causar

- Qual sua visibilidade?

Definir se será visivel para toda aplicação. Ou somente através de herança, ou a nível da propria classe, etc.