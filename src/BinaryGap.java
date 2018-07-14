

public class BinaryGap {

	public static int getBinaryGap(int num) {		
		String binary = "";
		int input = num;
		int count = 0;
		int	temp;
		int max = 0;
		int nonmax = 0;
		try{
			if(num == 0){
				throw new NumberFormatException("Please enter the valid number");
			}
		while (input > 0) {
			temp = input % 2;
			binary = binary + "" + temp;
			input = input / 2;
		}
		System.out.println("Binary representation of " + num + " is : " + binary);
		String[] crums = binary.split("");
			for (int i = binary.indexOf("1"); i <= binary.lastIndexOf("1"); i++) {
				if (!crums[i].equals("1")) {
					++count;
				}
				if(count!=0 && crums[i].equals("1")){					
						nonmax = max;
						max = count;
						count = 0;
					if (nonmax < count) {
						nonmax = count;
					}					
				}
			}
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return max < nonmax ? nonmax : max;
	}
	
	
	public int solutionGetBinaryGap(int num) {
        // write your code in Java SE 8
        		
		String binary = "";
		int input = num;
		int count = 0, temp;
		int max = 0;
		int nonmax = 0;
		try{
			if(num == 0){
				throw new NumberFormatException("Please enter the valid number");
			}
		while (input > 0) {
			temp = input % 2;
			binary = binary + "" + temp;
			input = input / 2;
		}
		String[] crums = binary.split("");
			for (int i = binary.indexOf("1"); i <= binary.lastIndexOf("1"); i++) {
				if (!crums[i].equals("1")) {
					++count;
				}
				if(count!=0 && crums[i].equals("1")){
					nonmax = max;
					max = count;
					count = 0;
				}
			}
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return max < nonmax ? nonmax : max;
	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBinaryGap(74901729));
	}
}
