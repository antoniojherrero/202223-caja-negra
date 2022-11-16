package com.practica.cajanegra;
import com.binarytree.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testEquals {
	BinaryTree<String> arbol;
	@BeforeEach
	void setUp() {
		arbol = new BinaryTree<String>("1");
		Node<String> nodo = arbol.insert("1", arbol.getRoot(), false);
		arbol.insert("1", arbol.getRoot(), true);
		arbol.insert("1", nodo, false);
		arbol.insert("1", nodo, true);
	}
	@Test
	void testC1() {
		BinaryTree<String> tree1 = new BinaryTree<String>("1");
		Node<String> nodo1 = tree1.insert("1", tree1.getRoot(), true);
		tree1.insert("1", tree1.getRoot(), false);
		tree1.insert("1", nodo1, false);
		tree1.insert("1", nodo1, true);
		
		assertTrue(arbol.equals(tree1));
	}
	@Test
	void testC2() {
		BinaryTree<String> tree2 = new BinaryTree<String>("1");
		Node<String> nodo2 = tree2.insert("1", tree2.getRoot(), false);
		tree2.insert("1", tree2.getRoot(), true);
		tree2.insert("1", nodo2, false);
		tree2.insert("1", nodo2, true);
		
		assertFalse(arbol.equals(tree2));
	}
	@Test
	void testC3() {
		BinaryTree<String> tree3 = new BinaryTree<String>("1");
		tree3.insert("1", tree3.getRoot(), true);
		tree3.insert("1", tree3.getRoot(), false);
		
		assertTrue(arbol.equals(tree3));
	}
	@Test
	void testC4() {
		BinaryTree<String> tree4 = new BinaryTree<String>("1");
		Node<String> nodo4 = tree4.insert("1", tree4.getRoot(), true);
		tree4.insert("1", tree4.getRoot(), false);
		tree4.insert("1", nodo4, true);
		
		assertFalse(arbol.equals(tree4));
	}
	@Test 
	void testNC(){
		assertThrows(java.lang.Exception.class, ()->{
			arbol.equals(null);
		});
	}
}
