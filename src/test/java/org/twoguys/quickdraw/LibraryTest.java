package org.twoguys.quickdraw;

import org.junit.*;
import static org.junit.Assert.assertTrue;

public class LibraryTest
{
  @Test
  public void testSomeLibraryMethodHappyPath()
  {
    Library library = new Library();
    boolean someReturnValue = library.someLibraryMethod();
    System.out.println("someReturnValue: " + someReturnValue);
    System.err.println("someReturnValue: " + someReturnValue);
    assertTrue("return value should be true", someReturnValue);
  }
}
