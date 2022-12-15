package com.practica.cajanegra;

import com.binarytree.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testSearch {
	BinaryTree<String> arbol;
	@BeforeEach
	void setUP() {
		arbol = new BinaryTree<String>("0");
		arbol.insert("1", arbol.getRoot(), false);
		arbol.insert("2", arbol.getRoot(), true);
		
	}
	@Test
	void testSR1() {
		assertEquals(arbol.getRoot().getRightChild(),arbol.search("1"));
	}
	@Test
	void testSR2() {
		assertNull(arbol.search("3"));
	}
	@Test
	void testSR3() {
		assertThrows(java.lang.Exception.class,()->{
			arbol.search("@");
		});
	}
	
}
