package dtu62532;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTest {
	Fibonacci ff;
	Geometry gg;
	
	@BeforeEach
	void setUp() throws Exception {
		ff = new Fibonacci();
		gg = new Geometry();
	}

	@Test
	void test() {
		if(ff.getFibonacci(10) != 55)
		    fail("fibonacci test failed");
		if(gg.getGeometry(5) != 64)
		    fail("geometry test failed");
	}

	@Test
	void test1() {
		if(ff.getFibonacci(5) != 5)
		    fail("fibonacci test failed");
		
	}
	
	@Test
	void test2() {
		if(ff.getFibonacci(1) != 1)
		    fail("fibonacci test2 failed");
		
	}
}
