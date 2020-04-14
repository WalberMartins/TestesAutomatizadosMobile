#language: pt
#encoding: utf-8

Funcionalidade: Google Keep

Contexto:
	Dado que eu aciono o Primeiros passos

@Cenario1
Cenario: Criar uma nota
	Quando eu acionar o botao Nova nota
	E eu informar no campo titulo "Nota1"
	E eu informar no campo nota "Nota"
	E eu acionar o botao voltar
	Entao o aplicativo cadastra a nota com o titulo "Nota1"

@Cenario2	
Cenario: Interagir com switch das configuracoes
	Quando eu acionar o menu
	E acionar a aba configuracoes
	E eu tocar no switch
	Entao o Switch fica desabilitado

@Cenario3	
Cenario: editar nota
	Quando eu acionar a nota "Nota1"
	E eu informar no campo titulo "Nota Editada"
	E eu informar no campo nota "eu acabei de editar a nota"
	E eu acionar o botao voltar
	Entao o aplicativo cadastra a nota com o titulo "Nota Editada"	