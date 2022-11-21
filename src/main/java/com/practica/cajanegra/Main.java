package com.practica.cajanegra;
import com.binarytree.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<String> arbol1 = new BinaryTree<String>("1");
		Node<String> nodo = arbol1.insert("1", arbol1.getRoot(),true);
		Node<String> nodo1 = new Node<String>("1");
		System.out.println(arbol1.getSubTree(nodo1));
	}

}
