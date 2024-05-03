/***** Imagine you start with this code: *********/

double [][] decimalNums = { {8.5, 9.1, -4.0} ,
          									{1.2, 5.5, 3.9} ,
          									{7.4, 4.1, -6.8} ,
          									{4.4, -9.8, -7.0} } ;

int rows = decimalNums.length;
int cols = decimalNums[0].length;

/****** Task 1: What would the following code do? ****/
for (int l = 0; l < rows; l++)
{
  decimalNums[l][0] = 0.0;
}

/****** Task 2: What would the following code do? ****/
for (int k = 0; k < cols; k++)
{
  decimalNums[0][k] = 10.0;
}

/****** Task 3: What would the following code do? ****/
		
for (int i = 0; i < rows; j += 2)
{
  
  for (int j = 0; j < cols; j++)
    {  
    decimalNums [i][j] = 1.1;  
    }
}

/****** Task 4: If all of this code ran in a row, write what the contents of decimanNums would look like now *******/







