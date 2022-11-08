import java.util.ArrayList;

public class main{
	
	public static void main(String args[]) {
		
		//Create ArrayList and add Processes to be tested
		ArrayList<Process> pList = new ArrayList<>();
		pList.add(new Process("A", 0, 6, 1, 1));
		pList.add(new Process("B",2,12,2,2));
		pList.add(new Process("C",4,8,1,1));
		pList.add(new Process("D",6,10,0,0));
		pList.add(new Process("E",8,4,2,2));
		
		int val = 0;
		while(pList.size() > val) {
			System.out.println(pList.get(val));
			val++;
		}
	}
	
}