import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CodilityTest {

	public static int getListLenth(int[] inp) {
		int temp = 0;
		List<Integer> item = new LinkedList<Integer>();
		if (inp.length == 0) {
			System.out.println("Given input array is Empty");
			return inp.length;
		}
		try {
			for (int i = 0; i < inp.length; i++) {
				if (i == 0 && inp[i] != -1) {
					temp = inp[i];
					item.add(temp);
				}
				if (temp < inp.length) {
					if (inp[temp] != -1) {
						temp = inp[temp];
						item.add(temp);
					} else {
						item.add(inp[i]);
						break;
					}
				} else {
					System.out.println("Invalid Input:");
					throw new IndexOutOfBoundsException();
				}
			}
		} catch (IndexOutOfBoundsException id) {
			System.out.println("Array values must be smaller than the Array Lenth");
			id.printStackTrace();
		}
		return item.size();
	}

	public static int getMaxNunberOfFamilyReservation(int n, String reserverseats) {
		int AnotFound = 0;
		int CnotFound = 0;
		int count = 0;
		

		String[] seats = reserverseats.split(" ");

		for (int i = 1; i <= n; i++) {
			List<String> a = new ArrayList<String>();
			List<String> b = new ArrayList<String>();
			List<String> c = new ArrayList<String>();
			a.add(i+"A");
			a.add(i+"B");
			a.add(i+"C");
			b.add(i+"D");
			b.add(i+"E");
			b.add(i+"F");
			b.add(i+"G");
			c.add(i+"H");
			c.add(i+"J");
			c.add(i+"K");
			for (int j = 0; j < a.size(); j++) {	
				for (String s : seats) {
					if (!a.get(0).contains(s) && !a.get(1).contains(s) && !a.get(2).contains(s)) {
						AnotFound++;
					}
					if(AnotFound == seats.length){
						count++;
					}
					if (!c.get(0).contains(s) && !c.get(1).contains(s) && !c.get(2).contains(s)) {
						CnotFound++;
					}
					if(CnotFound == c.size()){
						count++;
					}
					
					if(AnotFound == a.size()){
						count++;
					}					
					if (!c.get(j).contains(s)) {
						CnotFound++;
					}
					if(CnotFound == c.size()){
						count++;
					}
				}
			}
			for(int k = 0; k< b.size(); k++){
				for (String s : seats) {
					if (b.get(0).contains(s) || b.get(b.size() -1).contains(s)) {
						count++;
					}
					else if(b.get(1).contains(s) || b.get(2).contains(s))
					{
						continue;
					}
					else if(b.get(0).contains(s) && b.get(b.size() -1).contains(s))
					{
						continue;
					}
				}
			}
		}
		return reserverseats.isEmpty() ? 3 * n : count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 3, 6, 5, -1, 4 };
		System.out.println("Lenth of the list is " + getListLenth(input));
		System.out.println("Max reservation is " + getMaxNunberOfFamilyReservation(2, "1A 2F 1C"));
	}
}
