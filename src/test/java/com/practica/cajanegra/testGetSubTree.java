package com.practica.cajanegra;

import com.binarytree.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testGetSubTree {
	BinaryTree<String> arbol;
	Node<String> nodo1;
	Node<String> hijoD;
	Node<String> hijoI;
	@BeforeEach
	void setUp() {
		arbol = new BinaryTree<String>("1");
		nodo1 = arbol.insert("1", arbol.getRoot(), true);
		arbol.insert("1", arbol.getRoot(), false);
		hijoD = arbol.insert("1", nodo1, false);
		hijoI = arbol.insert("1", nodo1, true);
	}
	@Test
	void testC1() {
		assertEquals(nodo1, arbol.getSubTree(nodo1).getRoot());
		assertEquals(hijoD, arbol.getSubTree(nodo1).getRoot().getRightChild());
		assertEquals(hijoI, arbol.getSubTree(nodo1).getRoot().getLeftChild());
	}
	@Test
	void testNC1() {
		Node<String> nodoA2 = new Node<String>("1");
		assertThrows(java.lang.Exception.class, ()->{
			arbol.getSubTree(nodoA2);
		});
	}@Test
	void testNC2() {
		assertThrows(java.lang.Exception.class, ()->{
			arbol.getSubTree(null);
		});
	}
}
