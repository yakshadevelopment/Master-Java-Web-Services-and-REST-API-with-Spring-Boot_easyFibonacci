package yaksha.soap_ws.easy_fiboseries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import edu.yaksha.fiboapp.Fibonacci;
import edu.yaksha.fiboapp.ShowFibonacciSeriesRequest;
import edu.yaksha.fiboapp.ShowFibonacciSeriesResponse;
import yaksha.soap_ws.easy_fiboseries.bean.FibonacciBean;
import yaksha.soap_ws.easy_fiboseries.service.FibonacciService;

@Endpoint
public class FibonacciEndpoint {

	@Autowired
	FibonacciService service;
	@PayloadRoot(namespace = "http://yaksha.edu/fiboapp", localPart = "ShowFibonacciSeriesRequest")
	@ResponsePayload
	public ShowFibonacciSeriesResponse  processFibonacciSeriesRequest (@RequestPayload ShowFibonacciSeriesRequest  request)
	{
		List<FibonacciBean> fiboList=service.generateFibonacciSeries(request.getSeriesNumber());
		ShowFibonacciSeriesResponse response=new ShowFibonacciSeriesResponse();
		for(FibonacciBean fibo:fiboList)
		{
			Fibonacci fibonacci=new Fibonacci();
			fibonacci.setSerialNumber(fibo.getSerialNumber());
			fibonacci.setFibonacciNumber(fibo.getFibonacciNumber());
			response.getFibonacci().add(fibonacci);
		}
		return response;
	}
}
