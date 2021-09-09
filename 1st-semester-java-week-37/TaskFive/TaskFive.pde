void setup() {
  MethodOne(); 
  MethodTwo(); 
}

// Task 5.a
/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
    String output = "i is greater than "+max+".";  
    println(output);
  }
}

// Task 5.b

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 6; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  
  // Print the name of the weekday here: 
  switch(weekDay){
    case 0: print("It is Monday to today"); break;
    case 1: print("It is Tuesday to today"); break;
    case 2: print("It is Wednesday to today"); break;
    case 3: print("It is Thursday to today"); break;
    case 4: print("It is Friday to today"); break;
    case 5: print("It is Saturday to today"); break;
    case 6: print("It is Sunday to today"); break;
  }
    
  // Print if it is weekend here:
  if(weekend){print(" AND IT IS WEEKEND!!");}
  print("\n");
}
