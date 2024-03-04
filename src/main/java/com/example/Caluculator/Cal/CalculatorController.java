package com.example.Caluculator.Cal;

import com.example.Caluculator.Cal.CalFunctions.Calculater;
import com.example.Caluculator.Cal.Model.CalModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    Calculater add;
    public CalculatorController(){
        add = new Calculater();
        System.out.println("Controller loaded");
    }

    @GetMapping("/add/{num1}/{num2}")
    public String AddTwoElements(@PathVariable("num1") int num1,
                                 @PathVariable("num2") int num2){
        return (Integer.toString(add.addEle(num1,num2)));
    }

    @GetMapping("/sub/{num1}/{num2}")
    public String SubTwoElements(@PathVariable("num1") int num1,
                                 @PathVariable("num2") int num2){
        return (Integer.toString(add.subEle(num1,num2)));
    }

    @GetMapping("/mul/{num1}/{num2}")
    public String MultiplyTwoElements(@PathVariable("num1") int num1,
                                 @PathVariable("num2") int num2){
        return (Integer.toString(add.mulEle(num1,num2)));
    }

    @GetMapping("/div/{num1}/{num2}")
    public String DivTwoElements(@PathVariable("num1") int num1,
                                      @PathVariable("num2") int num2){
        return (Integer.toString(add.divEle(num1,num2)));
    }

    @PostMapping("/cal")
    public String MyCalculator(@RequestBody CalModel calModel){
        if(calModel.getCalMethod().equals("addition")){
            return Integer.toString(add.addEle(calModel.getNum1(), calModel.getNum2()));
        } else if (calModel.getCalMethod().equals("subtract")){
            return Integer.toString(add.subEle(calModel.getNum1(), calModel.getNum2()));
        }
        else if (calModel.getCalMethod().equals("multiply")) {
            return Integer.toString(add.mulEle(calModel.getNum1(), calModel.getNum2()));
        }
        else {
            return Integer.toString(add.divEle(calModel.getNum1(), calModel.getNum2()));
        }
    }
}
