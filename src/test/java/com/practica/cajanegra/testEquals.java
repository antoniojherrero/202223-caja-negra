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
}
