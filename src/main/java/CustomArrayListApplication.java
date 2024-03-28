public class CustomArrayListApplication {
	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		//10 elements
		myCustomList.add("one"); myCustomList.add("two"); 
		myCustomList.add("three"); myCustomList.add("four"); 
		myCustomList.add("five"); myCustomList.add("six"); 
		myCustomList.add("seven"); myCustomList.add("eight"); 
		myCustomList.add("nine"); myCustomList.add("ten"); 
		//20 elements
//		myCustomList.add("eleven"); myCustomList.add("twelve"); 
//		myCustomList.add("thirteen"); myCustomList.add("fourteen"); 
//		myCustomList.add("fifteen"); myCustomList.add("sixteen"); 
//		myCustomList.add("seventeen"); myCustomList.add("eighteen"); 
//		myCustomList.add("nineteen"); myCustomList.add("twenty"); 
//		//30 elements
//		myCustomList.add("twenty+1"); myCustomList.add("twenty+2"); 
//		myCustomList.add("twenty+3"); myCustomList.add("twenty+4"); 
//		myCustomList.add("twenty+5"); myCustomList.add("twenty+6"); 
//		myCustomList.add("twenty+7"); myCustomList.add("twenty+8"); 
//		myCustomList.add("twenty+9"); myCustomList.add("twenty+10");
//		//40 elements
//		myCustomList.add("check"); myCustomList.add("double check");
//		myCustomList.add("check"); myCustomList.add("double check");
//		myCustomList.add("check"); myCustomList.add("double check");
//		myCustomList.add("check"); myCustomList.add("double check");
//		myCustomList.add("check"); myCustomList.add("double check");
//		//50 elements
//		myCustomList.add("check"); myCustomList.add("double check");
//		myCustomList.add("check"); myCustomList.add("double check");
//		myCustomList.add("check"); myCustomList.add("double check");
//		myCustomList.add("check"); myCustomList.add("double check");
//		myCustomList.add("check"); myCustomList.add("double check");
		
		
		
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}
		
		System.out.println("total elements: " + myCustomList.getSize());
	
		
		
		
		
	}
}
