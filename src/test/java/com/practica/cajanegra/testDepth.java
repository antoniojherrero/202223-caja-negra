package com.practica.cajanegra;
import com.binarytree.*;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class testDepth {
	BinaryTree<String> arbol;
	
	@BeforeEach
	void setUp() {
		arbol = new BinaryTree<String>("1");
	}
	@Test
	void testC1() {
		assertEquals(0,arbol.depth());
	}
	@Test
	void testC2() {
		Node<String> nodo = arbol.insert("1", arbol.getRoot(), true);
		arbol.insert("1", nodo, false);
		
		arbol.insert("1", arbol.getRoot(), false);
		
		assertEquals(2,arbol.depth());
	}
	@Test 
	void testC3(){
		arbol.remove(arbol.getRoot());
		assertThrows(java.lang.Exception.class, ()->{
			arbol.depth();
		});
	}
}
