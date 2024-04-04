/**
  this method sorts an array by checking for a minimum value and making it the first number. then it ignores the
  first number and restarts this process for everything after it. and so on.

  so, after the first element, it checks the rest of the array for a min and makes it the new second element via swapping.
  then it check the rest of the array again and makes the min of THAT the third element. then it checks the rest of the array
  again and makes THAT the fourth element........
*/
void sort(int arr[]) 
    { 
        int len = arr.length; 

        //this is the 'outer loop' and it should run until the array is sorted. 
        //cutOff acts as a 'cutoff point.' we look for the min after the cutoff point, then move the cutoff point, then do it all again
        //so this loop just moves the cutoff point after we check for a min
        for (int cutOff = 0; cutOff < len - 1; cutOff++) 
        { 
            // we declare an int that will store the INDEX/LOCATION of the min. we don't know where it is yet, so we guess it is the first element
            int minimum_index = cutOff; 

            //j traverses the array, starting after the cutoff point, and stops when it gets to the end
            for (int j = cutOff+1; j < len; j++) 

                //if the traverser ever hits an element that is less than the current min we found, it means we found a new min!
                if (arr[j] < arr[minimum_index]) 

                    //we mark this spot as the new min location. 
                    minimum_index = j; 
  
            //swap the minimum element with the cutoff point. if the cutoff is the min, then this swap really does nothing
            int temp = arr[minimum_index]; 
            arr[minimum_index] = arr[cutOff]; 
            arr[cutOff] = temp; 
        } 
    } 
