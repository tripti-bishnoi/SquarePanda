package com.random.practice;

/*
 * A man starts from his house with a few pan cakes. 
 * let they be N. Now he visits K places before reaching home. 
 * At each place he can buy a cake, sell a cake or do nothing. 
 * But he must sell L cakes before reaching home.Find the maximum number of cakes 
 * he can have at any point in his journey.N,K,L are given as input?
 */
public class ManWithPanCakes {

	public static void main(String[] args) {
		System.out.println(maxNumCakes(10, 5, 2)); //13
		System.out.println(maxNumCakes(5, 5, 5)); //5
		System.out.println(maxNumCakes(2, 10, 0)); //12
		System.out.println(maxNumCakes(0, 5, 5)); //not enough cakes
		System.out.println(maxNumCakes(0, 5, 0)); //5
		System.out.println(maxNumCakes(10, 5, 10)); //10
	}

	public static int maxNumCakes(int total, int places, int mustSell) {
		int max = 0;
		int currTotal = total;

		while (places > 0) {
			if (mustSell > 0 && mustSell >= places) {
				max = Math.max(max, currTotal);
				// sell
				if (currTotal > 0)
					currTotal -= 1;
				else {
					System.out.println("not enough cakes");
					break;
				}
				mustSell--;
			} else {
				// buy
				currTotal += 1;
				max = Math.max(max, currTotal);
			}
			places--;
		}

		return max;
	}

}
