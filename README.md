# Order Total Calculator

Projeto desenvolvido como desafio do módulo de Componentes e Injeção de Dependência do curso Java Spring Professional da DevSuperior.

## Sobre o projeto

O sistema realiza o cálculo do valor total de um pedido, considerando:

- Valor básico do pedido
- Porcentagem de desconto
- Valor do frete

O projeto foi desenvolvido utilizando:

- Java
- Spring Boot
- Injeção de Dependência
- Componentes com `@Service`

---

## Regras de negócio

### Frete

| Valor do pedido | Frete |
|---|---|
| Abaixo de R$ 100.00 | R$ 20.00 |
| De R$ 100.00 até R$ 200.00 | R$ 12.00 |
| R$ 200.00 ou mais | Grátis |

---

## Estrutura do projeto

### OrderService
Responsável pelo cálculo do valor total do pedido.

### ShippingService
Responsável pelo cálculo do frete.

---

## Tecnologias utilizadas

- Java
- Spring Boot
- Maven

---

## Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/seuusuario/order-total-calculator.git

# entrar na pasta
cd order-total-calculator

# executar o projeto
./mvnw spring-boot:run
```

---

## Exemplo de saída

```text
Pedido código 1034
Valor total: R$ 132.00
```
