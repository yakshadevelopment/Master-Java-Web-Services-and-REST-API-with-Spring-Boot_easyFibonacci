package yaksha.soap_ws.easy_fiboseries.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import yaksha.soap_ws.easy_fiboseries.bean.FibonacciBean;
@Component
public class FibonacciService {
	public List<FibonacciBean> generateFibonacciSeries(int seriesNumber)
	{
		List<FibonacciBean> fiboList=new ArrayList<FibonacciBean>();
		int x=1;
		int y=0;
		int serialNumber=1;
		while(serialNumber<=seriesNumber)
		{
			int fibonacciNumber=x+y;
			FibonacciBean fiboBean=new FibonacciBean(serialNumber,fibonacciNumber);
			fiboList.add(fiboBean);
			serialNumber++;
			x=y;
			y=fibonacciNumber;
		}
       return fiboList;
		
	}

}
