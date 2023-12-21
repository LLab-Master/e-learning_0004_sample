package chap4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {
	private Calc calc;

	@BeforeEach       // インスタンス生成は各メソッドが実行される前に
	void init() {           
		calc = new Calc(12);
	}
	
	@Test             // テスト用メソッド
	void add1() {
		assertEquals(14, calc.add(2));
	}
	
	@Test
	void div1() {
		assertThrows(ArithmeticException.class, // 第1引数は例外クラス
				() -> calc.div(0));          	// 第2引数はラムダ式の形式
	}
	@Test
	void div2() {    // 別解
		try {
			calc.div(0);
			fail("例外が発生しませんでした");
		} catch (ArithmeticException e){
			assertTrue(true);
		}
	}

}
