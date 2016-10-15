package bean;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class RestAspectBean 
{

	@Before("execution (* cntrl.BaseRestController.get*(..))")
	public void beforeRestCall()
	{
		System.out.println("************Rest Called**********");
	}
	
}
