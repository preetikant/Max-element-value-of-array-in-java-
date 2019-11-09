class MaxValueArray{
	public static int maxArray(int[] arr){
		int max_value = arr[0];
		for (int i=1;i<arr.length ;i++ ) {
			if (arr[i]>max_value) {
				max_value=arr[i];
			}
		}
		return max_value;
	}

	public static void main(String[] args) {
		int arr123[] = {11,4,6,113,22,103};
		System.out.println(maxArray(arr123));
	}
}