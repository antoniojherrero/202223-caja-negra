package com.practica.cajanegra;
import com.binarytree.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testDepthAtNode {
	BinaryTree<String> arbol1;
	BinaryTree<String> arbol2;
	Node<String> nodoA2;
	Node<String> nodoA4;
	@BeforeEach
	void setUp() {
		
		arbol1=new BinaryTree<String>("1");
		arbol1.insert("1", arbol1.getRoot(), false);
		nodoA2 = arbol1.insert("1", arbol1.getRoot(), true);
		arbol1.insert("1", nodoA2, false);
		arbol1.insert("1", nodoA2, true);
		
		arbol2 = new BinaryTree<String>("1");
		arbol2.insert("1",arbol2.getRoot(),false);
		nodoA4 = arbol2.insert("1", arbol2.getRoot(), true);
		
	}
	
	@Test
	void testC1() {
		assertEquals(3,arbol1.depth(arbol1.getRoot()));
	}
	@Test
	void testC2() {
		assertEquals(2,arbol1.depth(nodoA2));
	}
	@Test
	void testNC1() {
		assertThrows(java.lang.Exception.class, () ->{
			arbol1.depth(arbol2.getRoot());
		});
	}
	@Test
	void testNC2() {
		assertThrows(java.lang.Exception.class, () ->{
			arbol1.depth(nodoA4);
		});
	}
	@Test
	void testNC3() {
		assertThrows(java.lang.Exception.class, ()->{
			arbol1.depth(null);
		});
	}
}
