# pattern
Desenvolvimento sistema de venda loja utilizando alguns design pattern

# TecLoja
Sistema de vendas onde o administrador tem acesso autorizado apos login tem a busca de produtos no estoque da própria loja ou demais unidades apos compro vem o meio de pagamento que pode ser feito de varia formas, além da promoções que são um dos destaques da loja.

# Design Pattern Proxy
O "PROXY" é utilizado como objetivo de encapsular um objeto através de um outro objeto que possui a mesma interface fazendo assim que ele seja chamado antes do objeto real. Nesse projeto foi utilizado na autenticação de usuário.

# Design Pattern Strategy
O STRATEGY permite que o algoritmo varie independentemente dos clientes que o utilizam além disso é possível alterar seu comportamento em tempo de excução. No exemplo foi utilizado em função do pagamento permitindo mudar o estado ex: Dinho para catão entre outra forma de pagamento.

# Design Pattern Observer
Os OBSERVERs registram-se no SUBJECT para receber atualizações quando os dados do SUBJECT são alterados. Os OBSERVERs também podem cancelar o seu registro e dessa forma não receber mais nenhuma atualização do SUBJECT. Nessa aplicação sua funcionalidade foi aplicada de forma que quando haver uma nova promoção disponível seja notificado ao usuário.

# Design Pattern Chain
A CHAIN OF RESPONSABILITY evita o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar essa solicitação. Fui utilizada na busca de produto no estoque da loja caso não seja encontrado buscar na empresa filial.
