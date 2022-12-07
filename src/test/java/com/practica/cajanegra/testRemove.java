package com.practica.cajanegra;

import com.binarytree.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testRemove {
	BinaryTree<String> arbol;
	@BeforeEach
	void setUp() {
		arbol = new BinaryTree<>("1");
	}
	
	@Test
	void testC1() {
		arbol.remove(arbol.getRoot());
		assertNull(arbol.getRoot());
	}
	@Test
	void testC2() {
		Node<String> node = arbol.insert("1", arbol.getRoot(), false);
		arbol.remove(node);
		assertNull(arbol.getRoot().getRightChild());
	}
	@Test
	void testNC1() {
		assertThrows(java.lang.Exception.class, ()->{
			arbol.remove(null);
		});
	}
	@Test
	void testNC2() {
		Node<String> nodo = new Node<>("1");
		assertThrows(java.lang.Exception.class, ()->{
			arbol.remove(nodo);
		});
	}
}
