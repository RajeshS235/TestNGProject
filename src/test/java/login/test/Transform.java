package login.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Transform implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer r = a.getRetryAnalyzer();
		
		a.setRetryAnalyzer(FailedCases.class);
	}

}
