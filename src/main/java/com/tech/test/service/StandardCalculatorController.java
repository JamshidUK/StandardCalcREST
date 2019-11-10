/**
 * 
 */
package com.tech.test.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * Standard calculator controller.
 * 
 * @author Jamshid
 */
@RestController
public class StandardCalculatorController {
	
	@RequestMapping("/standard/add")
    public double add(@RequestParam(value="a") String a, @RequestParam(value="b") String b) {
		double sum = 0;
		try{
			double input1 = Double.parseDouble(a);
			double input2 = Double.parseDouble(b);
			sum = input1 + input2;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Input", e);
		}
		
		return sum;
    }
	
	@RequestMapping("/standard/sub")
    public double sub(@RequestParam(value="a") String a, @RequestParam(value="b") String b) {
		double diff = 0;
		try{
			double input1 = Double.parseDouble(a);
			double input2 = Double.parseDouble(b);
			diff = input1 - input2;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Input", e);
		}
		
		return diff;
    }
	
	@RequestMapping("/standard/mul")
    public double mul(@RequestParam(value="a") String a, @RequestParam(value="b") String b) {
		double prod = 0;
		try{
			double input1 = Double.parseDouble(a);
			double input2 = Double.parseDouble(b);
			prod = input1 * input2;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Input", e);
		}
		
		return prod;
    }
	
	@RequestMapping("/standard/div")
    public double div(@RequestParam(value="a") String a, @RequestParam(value="b") String b) {
		double division = 0;
		boolean invalidDenominator = false;
		try{
			double input1 = Double.parseDouble(a);
			double input2 = Double.parseDouble(b);
			if (input2 != 0.0) {
				division = input1 / input2;
			} else {
				invalidDenominator = true;
			}
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Input", e);
		}
		
		if (invalidDenominator) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Invalid Denominator");
		}
		
		return division;
    }

}
