import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static ArrayList<String> swap(ArrayList<String> list, int num1, int num2)
	{
		String word = list.get(num1);
		list.set(num1, list.get(num2));
		list.set(num2, word);
		return list;
	}





	public static ArrayList<Double> createArrayList(double[] list)
	{
		ArrayList<Double> objectArray = new ArrayList<Double>();
		for (int i =0 ; i<list.length; i++)
		{
			Double num = list[i];
			objectArray.add(num);

		}
		return objectArray;
	}




	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages)
	{
		HashMap<String , Integer> people = new HashMap<String, Integer>();
		for (int i=0; i<names.length; i++)
		{
			Integer age = ages[i];
			
			people.put(names[i], age);
		}
		return people;
	}




	public static HashMap<String,Integer> increaseAge(HashMap<String,Integer> people, String name)
	{
		Integer increasedAge = people.get(name)+1;
		people.remove(name);
		people.put(name, increasedAge);
		return people;
	}

}
