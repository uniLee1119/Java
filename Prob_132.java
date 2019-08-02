package step11_if;

import java.util.Scanner;

public class Prob_132 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String tmp[] = new String[3];		 //값 입력
		Scanner in = new Scanner(System.in);
		System.out.print("Enter :");
		int res = 0;
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = in.next();
		}
		
		//tmp[0],tmp[2]값을 String->Int
		int tmp1 = Integer.parseInt(tmp[0]);
		int tmp2 = Integer.parseInt(tmp[2]);
		if (tmp[1].equals("+"))
			res = tmp1 + tmp2;
		else if (tmp[1].equals("-"))
			res = tmp1 - tmp2;
		else if (tmp[1].equals("*"))
			res = tmp1 * tmp2;
		else if (tmp[1].equals("/")) {
			if (tmp2 == 0) {	//분모가 0인 경우
				System.out.print("분모가 0, 새로운 수를 입력해 주세요: ");
				tmp[2] = in.next();
				tmp2 = Integer.parseInt(tmp[2]);
			}
			res = tmp1 / tmp2;
		}
		System.out.printf("%d", res);

	}

}
