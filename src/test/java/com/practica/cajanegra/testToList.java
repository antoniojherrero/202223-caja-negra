package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class testToList {
	BinaryTree<String> arbol = new BinaryTree<String>("1");
	ArrayList<String> lista = new ArrayList<String>();
	
	@Test
	void testC1() {
		lista.add("1");
		assertEquals(lista,arbol.toList());
	}
	
	@Test
	void testC2() {
		arbol.insert("2", arbol.getRoot(), true);
		arbol.insert("3", arbol.getRoot(), false);
		lista.add("1");
		lista.add("2");
		lista.add("3");
		
		assertEquals(lista,arbol.toList());
	}
	
	@Test
	void testC3() {
		arbol.remove(arbol.getRoot());
		assertEquals(lista,arbol.toList());
	}
}
