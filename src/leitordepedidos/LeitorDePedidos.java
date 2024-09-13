package leitordepedidos;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Cliente;
import entities.Itens;
import entities.Pedidos;

public class LeitorDePedidos {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		Pedidos p = new Pedidos();
		
		//itens de menu;
		Itens burger = new Itens("burger", 5.90);
		Itens duploBurger = new Itens("duplo Burger",7.90 );
		Itens triploBurger = new Itens("triplo burger", 10.90);
		Itens soda = new Itens("soda", 3.90);
		Itens batata = new Itens("Batata simples", 4.90);

		//apresentação;
		System.out.println("==============");
		System.out.println("Seja bem-vindo");
		System.out.println("==============");
		TimeUnit.SECONDS.sleep(1);

		System.out.print("Nome do cliente: ");
		Cliente cliente = new Cliente(sc.nextLine()); 
		TimeUnit.SECONDS.sleep(1);
	    System.out.println("=============");
	    System.out.println("  Cardapio");
	    System.out.println("=============");
	    System.out.println("burger           R$05,90");
	    TimeUnit.MILLISECONDS.sleep(500);
	    System.out.println("duplo Burger     R$07,90");
	    TimeUnit.MILLISECONDS.sleep(500);
	    System.out.println("triplo burger    R$10,90");
	    TimeUnit.MILLISECONDS.sleep(500);
	    System.out.println("soda             R$03,90");
	    TimeUnit.MILLISECONDS.sleep(500);
	    System.out.println("Batata simples   R$04,90");
	    System.out.println("=============");
		
		//Itens item = new Itens();

	    System.out.println("Para encerrar o pedido digite 0");
	    TimeUnit.SECONDS.sleep(1);
		System.out.println("Faça o pedido");
		String nomeItem;
		//double precoItem;
		do {
			System.out.print("-> Item: ");
			nomeItem = sc.nextLine();
			nomeItem = nomeItem.toLowerCase();
			if (nomeItem.equals("0")) {
				break;
			} else {
				switch(nomeItem){
					case "burger":
						p.addItem(burger);
					break;
					case "duplo burger":
						p.addItem(duploBurger);
					break;
					case "triplo burger":
						p.addItem(triploBurger);
					break;
					case "soda":
						p.addItem(soda);
					break;
					case "batata", "batata simples" :
						p.addItem(batata);
					break;
				}
				
			}
		} while (!nomeItem.equals("0"));

		System.out.print("Para comer aqui ou viagem: ");
		p.setViagem(sc.nextLine());
		TimeUnit.SECONDS.sleep(1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("=============");

		System.out.println(cliente);
		System.out.println(p);

		sc.close();
	}
}