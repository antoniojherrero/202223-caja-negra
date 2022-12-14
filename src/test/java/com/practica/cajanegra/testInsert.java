package com.practica.cajanegra;

import com.binarytree.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testInsert {
	BinaryTree<String> arbol;
	@BeforeEach
	void setUp() {
		arbol = new BinaryTree<String>("1");
		arbol.insert("1", arbol.getRoot(), false);
		arbol.insert("1", arbol.getRoot(), true);
	}
	
	@Test
	void testSR_1() {
		Node<String> nodo = arbol.insert("1", arbol.getRoot().getLeftChild(), true);
		assertEquals(nodo, arbol.getRoot().getLeftChild().getLeftChild());
	}
	@Test
	void testSR_2() {
		Node<String> nodo = arbol.insert("a", arbol.getRoot().getLeftChild(), false);
		assertEquals(nodo, arbol.getRoot().getLeftChild().getRightChild());
	}
	@Test 
	void testSR_3(){
		Node<String> nodo = new Node<String>("1");
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("A", nodo, true);
		});
	}
	@Test
	void testSR_4() {
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("1", null, true);
		});
	}
	@Test
	void testSR_5() {
		Node<String> nodo = new Node<String>("1");
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("a", nodo, false);
		});
	}
	@Test
	void testSR_6() {
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("A", null, false);
		});
	}
	@Test
	void testSR_7() {
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("/", arbol.getRoot().getLeftChild(), true);
		});
	}
	@Test
	void testSR_8() {
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("/", arbol.getRoot().getLeftChild(), false);
		});
	}
	
	@Test 
	void testSR_9(){
		Node<String> nodo = new Node<String>("1");
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("/", nodo, true);
		});
	}
	@Test 
	void testSR_10(){
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("/", null, true);
		});
	}
	@Test 
	void testSR_11(){
		Node<String> nodo = new Node<String>("1");
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("/", nodo,false);
		});
	}
	@Test
	void testSR_12() {
		assertThrows(java.lang.Exception.class, ()->{
			arbol.insert("/", null, false);
		});
	}
}
