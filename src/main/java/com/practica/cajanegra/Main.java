package com.practica.cajanegra;
import java.util.ArrayList;
import java.util.Iterator;

import com.binarytree.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<String> arbol1 = new BinaryTree<String>("1");
		BinaryTree<String> arbol2 = new BinaryTree<String>("2");
		Node<String> nodo = arbol1.insert("2", arbol1.getRoot(),true);
		arbol1.insert("5", arbol1.getRoot(), false);
		arbol1.insert("3", nodo, true);
		arbol1.insert("4", nodo, false);
		ArrayList<String> lista = new ArrayList<>();
		Iterator<String> itr = arbol1.iterator();
		arbol2.remove(arbol2.getRoot());
		Iterator<String> itr1 = arbol2.iterator();
		while(itr1.hasNext()) {
			lista.add(itr1.next());
		}
		System.out.println(lista.toString()+" "+arbol2.getRoot());
	}

}
