package com.practica.cajanegra;
import java.util.ArrayList;
import java.util.Iterator;

import com.binarytree.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<String> arbol1 = new BinaryTree<String>("1");
		Node<String> nodo = arbol1.insert("2", arbol1.getRoot(),true);
		arbol1.insert("5", arbol1.getRoot(), false);
		arbol1.insert("3", nodo, true);
		arbol1.insert("4", nodo, false);
		ArrayList<String> lista = new ArrayList<>();
		Iterator<String> itr = arbol1.iterator();
		while(itr.hasNext()) {
			lista.add(itr.next());
		}
		System.out.println(lista.toString());
	}

}
