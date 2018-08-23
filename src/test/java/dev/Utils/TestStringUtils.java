package dev.Utils;

import dev.utils.StringUtils;

public class TestStringUtils {

	public static void main (String[] args) throws Exception {
	
		testDiff2();
	}
	
	public static void testNull() throws Exception{
		CharSequence lhs = "chine";
		CharSequence rhs = "chien";
		StringUtils su = new StringUtils();
		int dist = su.levenshteinDistance(lhs,rhs);
		
		if (dist != -1){
			throw new Exception("Expected -1 because null");
		}
	}
	
	public static void testDiff2() throws Exception{
		CharSequence lhs = "chine";
		CharSequence rhs = "chien";
		StringUtils su = new StringUtils();
		int dist = su.levenshteinDistance(lhs,rhs);
		int testDist = 3;
		
		if (dist != testDist){
			throw new Exception("Distance différente de 2");
		}
	}
}

