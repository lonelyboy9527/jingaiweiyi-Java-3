package cc.openhome;


/**
 * @author yunshang
 * 3.1 类型、变量与运算符
 */
public class Range {
	private static final int O14 = 0;

	// 各种类型可存储的数值范围	
	public static void exp1() {
		
		/* System.out.printf
		 * 格式化输出, 换行用 \n和%n都可以
		 * */
		
		// byte、short、int、long 范围 
		/*	byte: 1 byte
		 *  short: 2 byte
		 * 	int: 4 byte
		 * 	long: 8 byte
		 * 
		 *  MAX_VALUE: 类型的最大正有限值的常量
		 *  MIN_VALUE: 类型的最小正非零值的常量
		 * */
		System.out.printf("byte: %d ~ %d\n",Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("short: %d ~ %d%n",Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("int: %d ~ %d%n",Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("long: %d ~ %d\n",Long.MIN_VALUE, Long.MAX_VALUE);
		
		// float、double 精度范围 float:  
		/*  float: 4 byte
		 *  double: 8 byte
		 *  
		 *   Double.MAX_EXPONENT: 有限 double 变量可能具有的最大指数
		 *   Double.MIN_EXPONENT: 标准化 double 变量可能具有的最小指数。
		 * */
		System.out.printf("float: %d ~ %d\n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
		System.out.printf("double: %d ~ %d\n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);

		// char可表示的Unicode范围 (十六进制输出或 %x)
		/* char: 2 byte
		 * */
		System.out.printf("char: %h ~ %h\n", Character.MIN_VALUE, Character.MAX_VALUE);
		
		// boolean 的两个值 (Bool 输出)
		System.out.printf("%b ~ %b\n", Boolean.TRUE, Boolean.FALSE);
	}
	
	// 变量
	public static void exp2() {
		// 1.变量声明需要用关键词
		/*  规则：
		 * 	1：不可以使用数字开头，不可以使用一些特殊字符。
		 * 	2：不可以与Java的关键字同名（也不可以与Java的保留字同名 如 goto）。
		 * 	3：风格以清楚易懂为主（使用驼峰命名）。
		 * 	
		 *  在方法中声明的变量称为 局部变量，如果在指定变量值之后，就不想再改变变量值，可以在声明变量时加上final限定。
		 * 
		 * */
		int ageOfStudent = 5; // 需要赋初值
		final int ageOfTeacher = 100;
		
		System.out.println(ageOfStudent);
		System.out.println(ageOfTeacher);
		
		ageOfStudent = 30;
//		ageOfTeacher = 99; // 不能更改
		
		// 2.字面常量
		/* 在Java中，写下一个值，该值称为字面常量，
		 * 
		 * */
		
		int number1 = 12;  // 十进制
		int number2 = 0xC; // 十六进制
		int number3 = O14; // 八进制
		
		double number4 = 0.00123;
		double number5 = 1.23e-3;
		
		char size = 'S';
		char lastName = '哈';
		// 转义
		char symbol1 = '\'';
		char symbol2 = '\\';
		char symbol3 = '\"';
		
		boolean flag = true;
		boolean condition = false;
		
		// 在Java SE 7之后，撰写整数和浮点数常量时可以使用下划线更清晰的表示某些数字。
		int number6 = 1234_5678;
		double number7 = 3.141_592_653;
	}
	
	// 运算符
	public static void exp3() {
		// 1.算术运算
		/* + 、- 、 * 、 /、 % 运算 
		 * */
		
		// 2. 比较条件运算
		/* >、>=、<、<=、 ==	、!= 
		 * 还有 条件运算 xx ? xx: xx;
		 * */
		
		System.out.printf("10 > 5 结果 %b%n", 10 > 5);
		System.out.printf("10 < 5 结果 %b%n", 10 < 5);
		System.out.printf("10 == 5 结果 %b%n", 10 == 5);
		
		// 3. 逻辑运算
		/* && 、||、 ！
		 * */
		int number = 75;
		System.out.println(number>70 && number < 80);
		System.out.println(number > 80 || number < 75);
		System.out.println(!(number > 80 || number < 75));
		
		/* 使用 逻辑运算的快捷运算避免出现的问题
		 * */
		int a = 10;
		int b = 0;
		if (b != 0 && a / b > 5) { // 因为当b == 0时，就不会在判断右边了
			System.out.println("yes");
		} else {
			 System.out.println("no");
		}
		
		// 4. 位运算
		/* &、|、^(异或)、~(补码)、>>、 << 
		 * 注意位运算是 逐位运算
		 * 
		 * <<: 会将所有位往左移指定位数，左边被挤出去的位会被丢弃，右边补上0
		 * >>: 右移将所有的位往右移指定位数，右边挤出去的会被丢弃，左边原来是0就补0，1就补1。
		 * >>>: 和>>的区别是：最左边一定补0。
		 * */
		int number4 = 1;
		System.out.printf("2的3次方: %d%n", number4 << 3);
		
		// 5.递增递减运算
		int i = 0;
		i++;
		++i;
		i--;
		--i;
		System.out.println(i);
		
		// 6.指定运算
		/* +=、 -= 等等*/
		
	}
	
	// 类型转换
	public static void exp4() {
		/*每一种语言都有其细节。*/
		/* */
//		float PI = 3.14; // 这么写会报错，因为编译程序默认使用double类型，想要使用double长度的数据指定给float类型变量，编译程序就会很贴心的告诉你double类型放到float变量，会因为8字节数据放到4字节字节空间，而遗失了4个字节数据。
		float PI = 3.14f; // 加上F正确；
		float PI2 = (float)3.14; // 或者强制转换
		
//		int number = 2147483648; 	// 报错
//		long number2 = 2147483648; 	// 报错
		
		// 在程序中，写下一个整数时，默认是使用不超过int类型长度的 2147483647的。2147483648l刚刚超过了int长度
		// 要告诉编译器，用long来配置整数的长度，也就是在数字后加上L
		long number3 = 2147483648L;
		
		// 运算
		int a = 10;
		double b = a * 3.14; // a 会提至double空间进行运算。
		
		/* 如果表达式中包括不同类型，则运算时会已最长的类型为主。
		 * */
		short aa = 1;
		long bb = 2; // 注意若数字超过了int 后，要加L
		int cc = (int)(aa + bb); // 强制转换成 int
		System.out.println(cc);

		System.out.println(10 / 3);
		System.out.println(10.0 / 3);
		
	}
	
}
