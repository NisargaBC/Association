package association;

public class LargaInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int [] arr = {10,5,7,19,23,15,5,17};

				int max=arr[0];


				for (int i=0;i<arr.length;i++) {

					if (arr[i]>max) {

						max=arr[i];

					}

				}


				System.out.println("Max element is :" + max);

		 

			}
		
		
	}


