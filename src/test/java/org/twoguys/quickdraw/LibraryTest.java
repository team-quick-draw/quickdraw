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
    assertTrue("return value should be true", someReturnValue);
  }
}
