package com.practica.cajanegra;

import com.binarytree.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testGetRoot {
	BinaryTree<String> arbol;
	@BeforeEach
	void setUp() {
		arbol = new BinaryTree<String>("1");
	}
	@Test
	void testC1() {
		Node<String> nodo = arbol.insert("1", arbol.getRoot(), false);
		assertEquals(nodo, arbol.getSubTree(nodo).getRoot());
	}
	@Test
	void testNC() {
		arbol.remove(arbol.getRoot());
		assertThrows(java.lang.Exception.class, ()->{
			arbol.getRoot();
		});
	}
}
