package com.epam.RemoveAfirst2chars;
import static org.junit.Assert.*;

import org.junit.Test;
/*
 * 1.only firstchar A:ABCD=>BCD
 * 2.first 2chars A:AACD=>CD 
 * 3.only second char A:BACD=>BCD
 * 4.last two cahrsA:BBAA:BBAA
 * first and last chars A:AABAA=>BAA
 */
public class RemoveA2charsTest {
	@Test
	public void test1char(){
		CharactersA chars=new CharactersA();
		assertEquals("BCD",chars.remove("ABCD"));
	}
	@Test
	public void test2charsA() {
		CharactersA chars=new CharactersA();
		assertEquals("CD",chars.remove("AACD"));
		}
	@Test
	public void testonly2ndchar(){
		CharactersA chars=new CharactersA();
		assertEquals("BCD",chars.remove("BACD"));
	}
	@Test
	public void testlast2char(){
		CharactersA chars=new CharactersA();
		assertEquals("BBAA",chars.remove("BBAA"));
	}
	@Test
	public void testfirstandlast2charA(){
		CharactersA chars=new CharactersA();
		assertEquals("BAA",chars.remove("AABAA"));
	}
	
}
