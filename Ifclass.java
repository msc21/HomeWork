package MyPrograms;

 class Ifclass {
	public static void main(String args[]) {
		int month  = 4; // April
       String Season;
       
       if (month==12 || month == 1 || month== 2)
    	   Season = "winter";
       else if(month==3 || month == 4 || month == 5)
        Season = "spring";
       else
    	   if(month==6 || month == 7 || month == 8)
    		   Season = "summer";
       else if(month == 9|| month == 10 || month == 11)
    	   Season = "Autumn";
       else
    	   Season = "Bogus MOnth";
       
       System.out.println("April is in the " + Season + " .");
       
		
	}
}
