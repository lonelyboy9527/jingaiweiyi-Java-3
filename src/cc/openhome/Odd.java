package cc.openhome;

import java.util.Iterator;

import javax.swing.text.AbstractDocument.BranchElement;

/**
 * @author yunshang
 * 3.2 流程控制
 */
public class Odd {
	// if else
	// 条件式中运算结果 是 true或者 false
	public static void exp1() {
		int input = 10;
		int remain = input % 2;
		if (remain == 1) {
			System.out.printf("%d 是奇数\n", input);
		} else {
			System.out.printf("%d 是偶数\n", input);
		}
		
		// 注意如果flag本身是 bool类型了，在if中不要 使用 flag == true这样判断，代码会很逊色
		boolean flag = true;
		if (flag) {
			System.out.println("正确的");
		}
	}
	
	// switch
	public static void exp2() {
		/* 在JDK7 之后， switch可用于比较整数、字符、字符串、与Enum
		 * 后两者在switch中的应用，等到说字符串和Enum 再说明。
		 * */
		int score = 88;
		int quotient = score / 10;
		char level;
		switch (quotient) {
		case 10:
		case 9:
			level = 'A';
			break;
		case 8:
			level = 'B';
			break;
		case 7:
			level = 'C';
			break;
		case 6:
			level = 'D';
			break;
		default:
			level = 'E';
			break;
		}
		System.out.println(level);

	}
	// for 循环
	public static void exp3() {
		// 九九乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%2d * %2d = %2d  ", j, i, i*j);
			}
			System.out.printf("\n");
		}
		// 无穷循环 (第二个不写代表true)
//		for(;;);
	}
	// while循环
	public static void exp4() {
		while (true) {
			// 产生0-9的数
			int number = (int) (Math.random() * 10); // random会随机产生0.0～1.0的值。
			System.out.println(number);
			if (number == 5) {
				System.out.println("I hit 5...Orz");
				break;
			}
		}
		
		// 使用do-while方法可以少写一个 if判断
		int number;
		do {
			number = (int)(Math.random() * 10);
			System.out.println(number);
		} while (number != 5);
		System.out.println("I hit 5...Orz");
	}
	
	// break、continue
	public static void exp5() {
		// break可以离开当前 switch、for、while、do-while区块，并执行区块下一个描述句。
		// continue略过一次后面的语句，进行下一次循环
		
		/* break、continue还可以配合标签使用。例如 本来break只会离开for循环，设定标签与区块，则可以离开整个区块。*/
		
		// break
		back: {
			for (int i = 0; i < 10; i++) {
				if (i == 9) {
					System.out.println("break");
					break back; // 返回至标签处
				}
			}
			System.out.println("test");// 此语句将不会执行
		}
	
		// continue也有类似的用法，只不过是标签只能设定在 for之前
		back1: 
			for (int i = 0; i < 10; i++) {
				System.out.printf("i: %d  ", i);
				back2:
					for (int j = 0; j < 10; j++) {
						System.out.printf("j: %d  ", j);
						if (j == 5) {
							System.out.println("continue back1");
							continue back1;
						}
					}
				System.out.println("test"); // 此语句将不会执行
			}
		/* continue配合标签，可以自由的跳至任何一层for 循环，可以试试 continue back1 和continue back2的不同*/
	}
}
