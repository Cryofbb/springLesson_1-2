package com.example.demo.apps;

import com.example.demo.beansCalc.Divide;
import com.example.demo.beansCalc.Extraction;
import com.example.demo.beansCalc.Multiply;
import com.example.demo.beansCalc.Summary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.demo")
public class CalcBeans {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CalcBeans.class);
        Scan sc = new Scan();
        String[] sum = sc.sum();

        switch (sum[1]) {
            case "+" -> {
                Summary calc = context.getBean("summary", Summary.class);
                calc.calculate(Integer.parseInt(sum[0]), Integer.parseInt(sum[2]));
            }
            case "-" -> {
                Extraction calc = context.getBean("extraction", Extraction.class);
                calc.calculate(Integer.parseInt(sum[0]), Integer.parseInt(sum[2]));
            }
            case "*" -> {
                Multiply calc = context.getBean("multiply", Multiply.class);
                calc.calculate(Integer.parseInt(sum[0]), Integer.parseInt(sum[2]));
            }
            default -> {
                Divide calc = context.getBean("divide", Divide.class);
                calc.calculate(Integer.parseInt(sum[0]), Integer.parseInt(sum[2]));
            }
        }
    }
}
