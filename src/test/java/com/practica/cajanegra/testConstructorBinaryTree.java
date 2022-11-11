package com.practica.cajanegra;
import com.binarytree.BinaryTree;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class testConstructorBinaryTree {
	
	@Test
	void testT1C1() {
		String contenido = "1";
		assertNotEquals(new BinaryTree<String>(contenido),null);
	}
	@Test
	void testT1C2() {
		String contenido = "A";
		assertNotEquals(new BinaryTree<String>(contenido),null);
	}
	@Test
	void testT1C3() {
		String contenido = "a";
		assertNotEquals(new BinaryTree<String>(contenido),null);
	}
	@Test
	void testT1NC() {
		String contenido = "@";
		assertThrows(java.lang.IllegalArgumentException.class, ()->{
			new BinaryTree<String>(contenido);
		});
	}
	@Test
	void testNT1C1() {
		int contenido = 1;
		assertNotEquals(new BinaryTree<Integer>(contenido),null);
	}
}