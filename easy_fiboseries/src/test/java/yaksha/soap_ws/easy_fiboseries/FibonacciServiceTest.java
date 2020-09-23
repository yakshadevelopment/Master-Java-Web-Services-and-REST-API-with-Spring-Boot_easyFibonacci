package yaksha.soap_ws.easy_fiboseries;

import static org.junit.Assert.*;
import org.junit.Test;
import yaksha.soap_ws.easy_fiboseries.bean.FibonacciBean;
import yaksha.soap_ws.easy_fiboseries.service.FibonacciService;
import static yaksha.soap_ws.easy_fiboseries.TestUtils.*;
import java.util.List;public class FibonacciServiceTest {

	@Test
	public void testGenerateFibonacciSeries() throws Exception {
		List<FibonacciBean> fiboList=new FibonacciService().generateFibonacciSeries(10);
		FibonacciBean fiboBean=fiboList.get(9);
		int value=fiboBean.getFibonacciNumber();
		yakshaAssert(currentTest(),(value==55?"true":"false"),businessTestFile);
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }
}
