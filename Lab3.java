public class Lab3
{
  public static void testLightCandles1()
  {
    Robot.load("candles1.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles2()
  {
    Robot.load("candles2.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
    
  public static void lightCandles()
  {
    //insert instructions below
    letsGo();
    letsGo();
    letsGo();
    letsGo();
    letsGo();
    letsGo();
    letsGo();
    letsGo();
    letsGo();
    letsGo();
    letsGo();
  }
  
 public static void letsGo()
 {
    if (!Robot.frontIsClear())
    {
    oneCandle();
    }
    else
    {
    Robot.move();
    }  
    }
    
  public static void oneCandle()
  {
     Robot.turnLeft();
      Robot.move();
      turnRight();
      if (Robot.frontIsClear())
      {
        Robot.move();
        Robot.makeDark();
        Robot.move();
        returnToPosition();
         }
      else 
      {
        Robot.turnLeft();
        Robot.move();
        turnRight();
        if (Robot.frontIsClear())
      {
        Robot.move();
        Robot.makeDark();
        Robot.move();
        returnToPosition();
         }
      else 
      {
        Robot.turnLeft();
        turnRight();
         }
 } 
}
public static void returnToPosition()
{
  turnRight();
  if (Robot.frontIsClear())
  {
    Robot.move();  
}
if (Robot.frontIsClear())
  {
    Robot.move();  
}
Robot.turnLeft();
}

public static void turnRight()
   {
     Robot.turnLeft();
     Robot.turnLeft();
     Robot.turnLeft();
    }
  //Run this method to test completeRoom on map room1.txt
  public static void testCompleteRoom1()
  {
     Robot.load("room1.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  //Run this method to test completeRoom on map room2.txt
  public static void testCompleteRoom2()
  {
    Robot.load("room2.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  //Complete this method.  You will need to write additional helper methods.
  public static void completeRoom()
  {
    //insert instructions below'
    oneRow();
    turnRight();
    oneRow();
    turnRight();
    oneRow();
    turnRight();
    oneRow();
    turnRight();
  
  }
  
  public static void oneRow()
  {
    oneBlock();
    Robot.move();
    oneBlock();
    Robot.move();
    oneBlock();
    Robot.move();
    oneBlock();
    Robot.move();
    oneBlock();
    }
  
  
  public static void oneBlock()
  {
   Robot.turnLeft();
   if (Robot.frontIsClear())
   {
     Robot.move();
     if (Robot.onDark())
     {
       turnAround();
     Robot.move();
     Robot.turnLeft();  
    }
    else
    {
     Robot.makeDark();
     turnAround();
     Robot.move();
     Robot.turnLeft();
    }
     
    
    }
   else
   {
     turnRight();  
    }
  }
  
  public static void turnAround()
  {
     Robot.turnLeft();
     Robot.turnLeft();
    }
  
  //Run this method to test swapAll on map swap1.txt
  public static void testSwapAll1()
  {
    Robot.load("swap1.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll2()
  {
    Robot.load("swap2.txt");
    Robot.setDelay(0.05);
    swapAll();
  }

  //Complete this method.  You will need to write additional helper methods.
  public static void swapAll()
  {
    //insert instructions below
    oneSwitch();
    Robot.move();
    oneSwitch();
    Robot.move();
    oneSwitch();
    Robot.move();
    oneSwitch();
    Robot.move();
    oneSwitch();
    Robot.move();
    oneSwitch();
    Robot.move();
    oneSwitch();
    Robot.move();
    oneSwitch();
    Robot.move();
    oneSwitch();
    Robot.move();
    oneSwitch();
  
  }
  
  public static void oneSwitch()
  {
    Robot.turnLeft();
    Robot.move();
    if (Robot.onDark())
    {  
      turnAround();
      Robot.move();
      Robot.move();
      if (Robot.onDark())
      {
        turnAround();
        Robot.move();
        turnRight();
        }
      else
      {
       Robot.makeDark();
       turnAround();
       Robot.move();
       Robot.move();
       Robot.makeLight();
       turnAround();
       Robot.move();
       Robot.turnLeft();
        }
    }
    else
    {
      turnAround();
      Robot.move();
      Robot.move();   
      if (Robot.onDark())
      {
        Robot.makeLight();
        turnAround();
        Robot.move();
        Robot.move();
        Robot.makeDark();
        turnAround();
        Robot.move();
        Robot.turnLeft();
        }
      else
      {
       turnAround();
       Robot.move();
       turnRight();
        }
    }
    }
  //Don't run these. I will!
  public static void testLightCandles3()
  {
    Robot.load("candles3.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles4()
  {
    Robot.load("candles4.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  public static void testCompleteRoom3()
  {
     Robot.load("room3.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  public static void testCompleteRoom4()
  {
    Robot.load("room4.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  public static void testSwapAll3()
  {
    Robot.load("swap3.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll4()
  {
    Robot.load("swap4.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
}
