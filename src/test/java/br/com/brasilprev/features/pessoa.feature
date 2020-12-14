#language: pt
#Author: Thiago Calheiros
#Version: 1.0
#Encoding: iso-8859-1
Funcionalidade:  Consultas via dados de Pessoas

  Contexto: ambiente já pré-configurado nos steps.


  @RunDesafio
  Cenario: Procurar pessoa pelo Cpf
    Entao Deve procurar pessoa pelo cpf

  Cenario: Procurar pessoa pelo cpf inexistente
    Entao Deve procurar pessoa pelo cpf inexistente

  Cenario: Encontrar a pessoa pelo ddd e numero de telefone
    Entao Deve encontrar a pessoa pelo ddd e numero de telefone

  Cenario: Filtrar pessoa pelo ddd do telefone
    Entao Deve filtrar pessoa pelo ddd do telefone

  Cenario: Filtrar pessoa por parte do cpf
    Entao Deve filtrar pessoa por parte do cpf

  Cenario: Filtrar pessoa por parte do nome
    Entao Deve filtrar pessoa por parte do nome

  Cenario: Filtrar pessoa por filtro composto
    Entao Deve filtrar pessoa por filtro composto

  Cenario: Filtrar pessoa por filtro composto
    Entao Deve filtrar pessoa por filtro composto

  Cenario: Nao deve encontrar pessoa cujo dd e telefone nao estejam cadastradados
    Entao Nao deve encontrar pessoa cujo dd e telefone nao estejam cadastradados

  Cenario: Pocurar pessoa pelo Cpf
    Entao Deve filtrar pessoa por filtro composto
