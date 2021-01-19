package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		/*
		** List<tipo> nome; 
		** Tem que usar a wrapper class no tipo
		** Instanciar com uma classe que implementa a interface(ArrayList, poderia usar )
		*/
		
		List<String> list = new ArrayList<String>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		list.add(2, "Marco");
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista 0: " + list.size());
		
		//remover:
		
		list.remove(2);
		
		System.out.println("------------------------");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista I: " + list.size());
		
		System.out.println("------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("Tamanho da lista II: " + list.size());

		System.out.println("------------------------");
		//ENCONTRAR A POSIÇÃO DE UM ELEMENTO DA LISTA:
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("------------------------");
		//Filtrar com todo mundo que começa com A:
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		//Filtrar primeiro elemento que começa com A:
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
