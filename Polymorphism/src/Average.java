
public class Average {
	public static float average(int ...nums){
		float sum=0.f;
		for(int data:nums)
		{
			sum+=data;
		}
		return sum/nums.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			float f= average(3,4,5,6);
			System.out.println(f);
					
	}

}
