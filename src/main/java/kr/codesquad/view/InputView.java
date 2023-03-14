package kr.codesquad.view;

import java.util.Scanner;

public class InputView {

	private final Scanner sc = new Scanner(System.in);

	public String getPurchaseAmount() {
		System.out.println("구입금액을 입력해 주세요.");
		return sc.nextLine();
	}

	public String getWinning() {
		System.out.println("당첨 번호를 입력해 주세요.");
		return sc.nextLine();
	}
}