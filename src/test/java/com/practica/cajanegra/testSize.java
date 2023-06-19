package com.practica.cajanegra;

import com.binarytree.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class testSize {
	BinaryTree<String> arbol = new BinaryTree<String>("1");
	
	@Test
	void testC1() {
		assertEquals(1,arbol.size());
	}
	@Test
	void testC2() {
		arbol.insert("2", arbol.getRoot(), false);
		Node<String> nodo = arbol.insert("3", arbol.getRoot(), true);
		nodo.setLeftChild(new Node<String>("4"));
		nodo.setRightChild(new Node<String>("5"));
		
		assertEquals(5, arbol.size());
	}
}
