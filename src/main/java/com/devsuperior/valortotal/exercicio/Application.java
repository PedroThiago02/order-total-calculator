package com.devsuperior.valortotal.exercicio;

import com.devsuperior.valortotal.exercicio.entities.Order;
import com.devsuperior.valortotal.exercicio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);

		int code = reader.nextInt();
		double basic = reader.nextDouble();
		double discount = reader.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.printf("Pedido código %d\n", order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));

	}
}
