## Padrões de Projeto de Software Orientado a Objetos 
Entendendo os conceitos de padrões de projeto de software orientado a objetos e aplicando os conceitos.
_______________________________________________________________________________________________________________
Os Design Patterns, também conhecidos como Padrões de Projeto,  têm o objetivo de tornar componentes reutilizáveis que facilitam a padronização, que permita agilidade para as soluções de problemas recorrentes no desenvolvimento do sistema.<br/>
Existem dois padrões de projetos conhecidos pela engenharia de software que são: padrões **Gang of Four**(*Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides*) e os padrões **GRASP** (*General Responsability Assignment Software Patterns*).
________________________________________________________________________________________________________________
## Padrões Gang of Four (GoF)
Objetivam solucionar problemas comuns de softwares que tenham algum envolvimento a orientação a objetos. São formados por três grupos:<br/>
 ![gof](https://user-images.githubusercontent.com/85784665/136676253-8e3c47fc-a5d8-427a-bbe8-1b11fc0594c1.png) <br/>
* *Escopo‘Classe’ negociam relaçionamentos entre classes e sub-classes. Essas
relações são estabelecidas através de herança. Então são estáticas – fixas em
tempo de compilação.*<br/>
* *Escopo ‘Objeto’ negociam com relações de objetos, que podem mudar em
tempo de execução.*
__________________________________________________________________________________________________________________
## Command

Encapsula uma solicitação como um objeto, permitindo que clientes sejam parametrizados com diferentes solicitações e suportem operações que possam ser desfeitas. 

Exemplo: [Command](https://github.com/rcassettari/Design-patterns/blob/master/src/br/com/patterns/command/CommandTester.java) 

_________________________________________________________________________________________________________________
## Singleton

Usado quando desejado, que uma classe tenha apenas uma instância na aplicação. A idéia é garantir que apenas um objeto exista,
independente do número de requisições recebidas para criá-lo.<br/>
O construtor da classe fica como **privado** (private), sendo que não pode ser instanciada para fora da própria classe.<br/>
A classe é final, pois não permite a criação de subclasses da própria classe.<br/>
O acesso é permitido através do método que retorna a instância única da classe, ou faz a criação de uma, caso não tenha sido criada.<br/>
![sing](https://user-images.githubusercontent.com/85784665/136676567-752ede10-fd72-4875-846e-9a2fa261424d.png)<br/>
Exemplo: [Singleton](https://github.com/rcassettari/Design-patterns/blob/master/src/br/com/patterns/singleton/SingletonTester.java)
__________________________________________________________________________________________________________________
## Strategy
Defina uma família de algorítmos e os encapsula, tornando-os intercambiáveis.

Exemplo: [Strategy](https://github.com/rcassettari/Design-patterns/blob/master/src/br/com/patterns/strategy/StrategyTester.java)
__________________________________________________________________________________________________________________
Abaixo, seguem links de referência usados no projeto :

* [Definições de patterns](https://pt.calameo.com/read/002221743776fd8da98a4)


