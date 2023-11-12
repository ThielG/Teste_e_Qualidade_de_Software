#language: pt

Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

  @validar_formulario
  Esquema do Cenario: Validar Area de Teste
    Dado que o usuário preencheu os campos nome, sobrenome, sexo, comida, escolaridade e esporte
    Quando clicar no botão Cadastrar
    Entao as informações <dados> devem ser validados no formulario <formulario>
    Exemplos:
      | dados     |  | formulario     |
      | Guilherme |  | nome           |
      | Thiel     |  | sobrenome      |
      | masculino |  | sexo           |
      | pizza     |  | comidaFavorita |
      | superior  |  | escolaridade   |
      | natacao   |  | esportes       |

  @validar_campos_obrigatorios
  Esquema do Cenario: Validar Campos Obrigatorios
    Dado que o usuário preencheu o campo <campo>
    Quando clicar em Cadastrar
    Entao retorna mensagem de erro <mensagem>
    Exemplos:
      | campo     |  | mensagem                        |
      | nome      |  | O campo nome é obrigatório      |
      | sobrenome |  | O campo sobrenome é obrigatório |
      | sexo      |  | O campo sexo é obrigatorio      |
