    //Snippet 1: 
		
		//declare an array of Strings
		String[] students = {"Alice", "Bob", "Carrie", "David"};
		
		//make our 'for each loop'
		for (String currentElementCopy : students) {
		  System.out.println(currentElementCopy);
		}
	
		
		
		//Snippet 2:
		
		//declare an array of ints
		int[] grades = {22, 89, 55, 67, 81, 33};
		
		//hmmm, what is this one for?
		int sum = 0;
		
		//make our 'for each loop'
		for (int currentElement : grades) {
		  sum += currentElement;
		}
		
		System.out.println(sum);


		
		//Snippet 3: 
		
		//declare an array of doubles
		double[] scores = {8.5, 9.0, 3.3, -2.7, 44.12};
		
		//what is this for? i wonder...
		double avg = 0;
		
		//make our 'for each loop'
		for (double i : scores) {
		  avg += i;
		}
		
		//what's this do? huh...
		System.out.println(avg / scores.length);



		//Snippet 4:
		
		String[] workers = {"Alice", "Bob", "Carrie", "David"};
		
		for (String currentWorker : workers) {
		  currentWorker = null;
		}
