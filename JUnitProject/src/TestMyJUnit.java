import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
public class TestMyJUnit {
    @Test
    public void testWelcome() {
        GreetMessenger greetMsg=new GreetMessenger("Welcome to junit");
        assertEquals("Welcome to Junit",greetMsg.getGreeting());
    }
    public void testSomeAssertions() { 
    	int empno = 7839; String empname= "KING"; String empjob = "PRESIDENT";  
    assertEquals("PRESIDENT", empjob);
    System.out.println("empjob passed.."); 
    assertTrue(empno > 1000) ; 
    System.out.println("empno passed.."); 
    assertNotNull(empname);
    System.out.println("empname passed..");  
    System.out.println("testSomeAssertions is over...."); 
    }
    public void testWithdraw() {
    	SavingsAccount savObj = new SavingsAccount(85000); // Bank.getAccount(); // like , Garden.getFlower("decoration"); 
    	assertNotNull(savObj);
    	 savObj.withdraw(15000);
    	assertEquals(70000, savObj.getBankBalance(),"Balance is not matching"); 
    }
}
