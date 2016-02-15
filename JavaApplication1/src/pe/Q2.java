package pe;

public class Q2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int sum = 2;
		while(j<4000000) {
			if((i+j)%2==0) {
				sum += (i+j);
			}
			int temp = j;
			j += i;
			i = temp;
		}
		System.out.println(sum);
	}
}
