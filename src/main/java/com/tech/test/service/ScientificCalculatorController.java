/**
 * 
 */
package com.tech.test.service;

import java.util.stream.LongStream;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * Scientific calculator controller.
 * 
 * @author Jamshid
 */
@RestController
public class ScientificCalculatorController {
	
	@RequestMapping("/scientific/square")
    public double square(@RequestParam(value="a") String a) {
		double square = 0;
		try{
			double input = Double.parseDouble(a);
			square = input * input;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Input", e);
		}
		
		return square;
    }
	
	@RequestMapping("/scientific/root")
    public double root(@RequestParam(value="a") String a) {
		double root = 0;
		try{
			double input = Double.parseDouble(a);
			root = Math.sqrt(input);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Input", e);
		}
		
		return root;
    }
	
	@RequestMapping("/scientific/factorial")
    public long factorial(@RequestParam(value="a") String a) {
		long factorial = 1;
		try{
			long input = Long.parseLong(a);
			factorial = LongStream.rangeClosed(1, input).reduce(1, (long x, long y) -> x * y);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Input", e);
		}
		
		return factorial;
    }
	
	@RequestMapping("/scientific/prime")
    public String prime(@RequestParam(value="a") String a) {
		boolean isPrime = false;
		try{
			long input = Long.parseLong(a);
			if (input < 0) {
				throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
			}
			
			if (input == 0 || input == 1) {
				return "Not a Prime number";
			}
			
			for (int i = 2; i <= input; i++) {
				if (input % i == 0) {
					isPrime = true;
					break;
				}
			}
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Input", e);
		}
		
		if (isPrime) {
			return "Is a Prime number";
		}
		
		return "Not a Prime number";
    }
}
