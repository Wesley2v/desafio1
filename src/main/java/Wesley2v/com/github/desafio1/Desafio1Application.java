package Wesley2v.com.github.desafio1;

import Wesley2v.com.github.desafio1.entities.Order;
import Wesley2v.com.github.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("-----------------------");
		Order exemplo1 = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido código: " + exemplo1.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(exemplo1)));
		System.out.println("-----------------------");

		Order exemplo2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código: " + exemplo2.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(exemplo2)));
		System.out.println("-----------------------");

		Order exemplo3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código: " + exemplo3.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(exemplo3)));
		System.out.println("-----------------------");
	}
}
