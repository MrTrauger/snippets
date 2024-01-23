          int d = roll.indexOf('d');
					
					int plus = roll.indexOf('+');
					
					if (d > 0 && plus > 0)
          {
						
  						int count = Integer.valueOf(roll.substring(0, d)) ;
  						
  						int faces = Integer.valueOf(roll.substring(d+1, plus)) ;
  						
  						total += rollDice(count, faces) ;
  						
  						roll = roll.substring(plus+1) ;
  						
  						System.out.print(count + " " + faces + "-sided dice, and ") ;
					}
					
					else if (d > 0 && plus == -1) 
          {
  						int count = Integer.valueOf(roll.substring(0, d)) ;
  						
  						int faces = Integer.valueOf(roll.substring(d+1)) ;
  						
  						total += rollDice(count, faces) ; 
  						
  						roll = "";
  						
  						System.out.println(count + " " + faces + "-sided dice.");	
					}
