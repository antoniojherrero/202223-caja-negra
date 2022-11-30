package com.practica.cajanegra;

import com.binarytree.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testIterator {
	ArrayList<String> lista;
	BinaryTree<String> arbol;
	@BeforeEach
	void setUp() {
		lista = new ArrayList<>();
		arbol = new BinaryTree<>("1");
	}
	@Test
	void testC1() {
		arbol.remove(arbol.getRoot());
		assertFalse(arbol.iterator().hasNext());
	}
	@Test
	void testC2() {
		Iterator<String> itr = arbol.iterator();
		assertTrue(itr.hasNext());
		assertEquals("1",itr.next());
		assertFalse(itr.hasNext());
	}
	@Test
	void testC3() {
		lista.add("1");
		arbol.insert("2", arbol.getRoot(), false);
		lista.add("2");
		arbol.insert("3", arbol.getRoot(), true);
		lista.add("3");
		
		
	}
}
