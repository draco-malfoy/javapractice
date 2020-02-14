class Sorting {
	static String contain[] = {"what","the","hell","amI","doing"};
	public static void main (String args[]) {
		for(int i=0;i<contain.length;i++){
			for(int j=i+1;j<contain.length;j++)
				if (contain[j].compareTo(contain[i]) < 0) {
					String t = contain[i];
					contain[i] = contain[j];
					contain[j] = t;
				}
						System.out.println(contain[i]);
		}
	}
}