package com.example.taxconv;

public class Conveter {

    public double percent (double salary)
    {
        double tax=0.0;

        if (salary<200000){
            tax=.01*salary;
        }else if (salary>20000 && salary<=350000){
            double remsalary = salary-200000;

            tax = .01*200000 + .15*remsalary;
        }else if(salary>350000){
            double rensalary = salary-350000;
            tax =.01*200000+.15*150000+rensalary*.25;
        }
        return tax;
    }


}
