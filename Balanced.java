
public class Balanced {

	public static void main(String[] args) {
		int i=isBalanced(new int[]{2,3,4,5,6,7});
		System.out.println(i);

	}
	public static int isBalanced(int[] a){
		for (int i = 0; i < a.length; i++) {
			if(i%2==0){
				if(a[i]%2!=0){
					return 0;
				}
			}
			else{
				if(a[i]%2==0){
					return 0;
				}
			}
		}
		return 1;
	}

}
