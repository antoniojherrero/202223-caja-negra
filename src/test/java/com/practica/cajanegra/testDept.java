package com.practica.cajanegra;
import com.binarytree.*;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class testDept {
	BinaryTree<String> arbol;
	
	@BeforeEach
	void setUp() {
		arbol = new BinaryTree<String>("1");
	}
	@Test
	void testC1() {
		assertEquals(arbol.depth(),1);
	}
	@Test
	void testC2() {
		Node<String> nodo = arbol.insert("1", arbol.getRoot(), true);
		arbol.insert("1", nodo, false);
		
		arbol.insert("1", arbol.getRoot(), false);
		
		assertEquals(arbol.depth(),3);
	}
	@Test 
	void testNC(){
		arbol.remove(arbol.getRoot());
		assertEquals(arbol.depth(),0);
	}
}
