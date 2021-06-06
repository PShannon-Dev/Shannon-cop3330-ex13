package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public int counter = 0;

    public static void main(String[] args)
    {
        //create instance variables
        App compound = new App();
        Investment compInv = new Investment();

        //set values based on input
        for(int i= 0; i < 4; i++)
            compound.input(compInv);

        //calculate worth
        compInv.setEndWorth(compInv.calculateWorth(compInv.getPrincipal(), compInv.getYears(), compInv.getRate(), compInv.getPerYear()));

        //output future worth
        compound.output(compInv);

    }

    public void input(Investment compound)
    {
        //input four values: principal, rate, years, and  times compounded per year
        if(counter == 0)
        {
            counter++;
            System.out.print("What is the principal amount? ");
            compound.setPrincipal(input.nextFloat());
        }

        else if(counter == 1)
        {
            counter++;
            System.out.print("What is the rate? ");
            compound.setRate(input.nextFloat());
        }

        else if(counter == 2)
        {
            counter++;
            System.out.print("What is the number of years? ");
            compound.setYears(input.nextInt());
        }

        else
        {
            counter = 0;
            System.out.print("What is the number of times the interest is compounded per year? ");
            compound.setPerYear(input.nextInt());
        }

    }

    public void output(Investment compound)
    {
        //format output as money
        DecimalFormat df = new DecimalFormat("$0.00");

        //output
        System.out.println(df.format(compound.getPrincipal()) + " invested at " + compound.getRate() + "% for " +
                compound.getYears() + " years compounded " + compound.perYear + " times per year is " + df.format(compound.getEndWorth()) + ".");
    }
}
