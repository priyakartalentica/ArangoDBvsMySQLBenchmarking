package com.arango.pizzaDelivery;

import com.arango.pizzaDelivery.entity.Order;
import com.arango.pizzaDelivery.entity.OrderMapper;
import com.arango.pizzaDelivery.entity.Pizza;
import com.arango.pizzaDelivery.repository.OrderRepository;
import com.arango.pizzaDelivery.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PizzaDeliveryApplication {

	public static void main(String[] args) {

		SpringApplication.run(PizzaDeliveryApplication.class, args);

		/*Order o= new Order();

		o.setMobileNo("777777777");
		Pizza p= new Pizza();
		p.setPizzaId(1L);
		o.setPizza(p);
		o.setDelivaryAddress("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");



		o.setIsDelivered(true);
		o.setCustomerName("Priya KAR Chakraborty");
		o.setLandmark("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setCity("Patna");
		o.setState("Bihar");
		o.setPincode("777777");
		o.setFoodAlergies("milk, garlic, honey, salt, sugar,milk, garlic, honey, salt,ilk, garlic, hilk, garlic, honey, salt,oney, salt,ilk, garlic, honey, salt,ilk, garlic, honey, salt, sugarmilk, garlic, honey, salt, sugarmilk, garlic, honey, salt, sugarmilk, garlic,");
		o.setStoreName("Dominoz Pizza Pune xyx road Bavdhan");
		o.setStoreAddress("Mango");
		o.setStorecity("Kochi");
		o.setStorestate("Kerela");
		o.setStorepincode("666666");
		o.setOrderReference("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setCustomeralternatemobileNo("5555555555");
		o.setOrderDate(new Date());
		o.setInfo1("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo2("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo3("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo4("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo5("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo6("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo7("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo8("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo9("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo10("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo11("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo12("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo13("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo14("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo15("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo16("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo17("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo18("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo19("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo20("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo21("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo22("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo23("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo24("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo25("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo26("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo27("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo28("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo29("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setInfo30("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");

		o.setOrderTotalAmount(2000.0);
		o.setOrderInstruction("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		o.setDelivaryInstuction("Flat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, TaumatawhakatangihangakoauauotamateaturipuFlat no 16, tapi building, zambad estate, NEW sHEYA NAMGAR, no 16, tapi building, zambad estate, NEW sHEYA NAMGAR dddddddddddddddddddddeeeeeeeeeeedd");
		OrderService orderService=new OrderService();
		//OrderMapper orderMapper=new OrderMapper();
		orderService.createOrder1(o);
		System.out.println("added order");
*/
	}

}
