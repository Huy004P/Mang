package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết chương trình nhập vào một mảng 10 phần tử số nguyên
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [10];
		int tong  =0;
		for (int i = 0; i < arr.length; i++) {
		System.out.format("nhập vào arr [%d]", i);
		arr[i] = sc.nextInt();
		tong += arr [i];
	}
		//Tính tổng các phần tửcủa mảng. Kiểm tra tổng làchẵn hay lẻ.
		//In kết quảra màn hình
		System.out.println("Tong cac phan tu arr[i] = " + tong);
		if (tong %2 == 0) {
			System.out.println("=> la so chan");
		}else {
			System.out.println("=> la so le");
		}
		//Kiểm tra mảng cóbao nhiêu sốchẵn, bao nhiêu sốlẻ. In kết quảra màn hình
		int ketQua = 0;
		int ketQua2 =0;
		for (int i=0; i < arr.length; i++) {
			if (arr [i] %2 == 0);
			ketQua++;
			if (arr [i] %2 != 0);
		}
		System.out.format("co %d so chan", ketQua);
		System.out.format(" va %d so le", ketQua2);
	
		//Sắp xếp các phần tửmảng theo thứtựtăng dần, giảm dần. In mảng ra màn hình.
		//Tăng dần
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                	int tg = arr[i];
	                	arr[i] = arr[j];
	                	arr[j] = tg;
	      }
	 }	
}
	        for (int j = 0; j < arr.length; j++) {
	        	System.out.print(arr[j] + " ");
	        }
	        System.out.println();
	        //Giảm dần
	        int tg = arr[0];
	        for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						tg = arr[j];
						arr[j] = arr[i];
						arr[i] = tg;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
	        }
	}
}
