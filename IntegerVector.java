public class IntegerVector {

	private int[] data = null;

	//constructor
	public IntegerVector(int size)
	{

		data = new int[size];
		
		for (int i = 0; i < data.length; ++i)
			data[i] = 0;
	}

	//default constructor
	public IntegerVector()
	{
		data = new int[0];
	}

	public String toString()
	{
		
		String result = "";
		
		for (int i : data) {
			result += i + " ";
		}
		
		return result;
	}

	// getter setter for array and its size
	public int getAt(int index)
	{
		
		return data[index];
		
	}

	public void setAt(int index, int value)
	{
		
		data[index] = value;
		
	}

	public int getSize()
	{
		
		return data.length;
	}

	//methodes
	public int sum()
	{
		
		int result = 0;
		for (int value : data) {
			result += value;
		}
		
		return result;
	}

	public double average()

	{
		double average = sum()/data.length ;
		return average;
	}
	public boolean contains(int value)
	{
		for (int i = 0; i <= data.length; i++ ){
			if (getAt(i) == value  ) //its better to use data[i] instead of getAt(i)
			{
				System.out.print("Array contains: " + value);
				return true;
			}
		}
		return false;
	}

	public void sort()
	{
		for (int i = 0; i < data.length; i++) // position of a variable
		{
			for (int j = i + 1; j < data.length; j++) // position in front of a variable i
			{
				int tmp = 0; // temporary variable for storing variables
				if (data[i] > data[j]) // if variable i is bigger than the variable in front of it
				{
					//Swap of the variable places
					tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
		System.out.println(toString());
	}

}
