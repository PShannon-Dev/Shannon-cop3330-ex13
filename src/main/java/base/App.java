package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public int counter = 0;

    public static void main(String[] args)
    {
        App compound = new App();
        Investment compInv = new Investment();

        for(int i= 0; i < 4; i++)
            compound.input(compInv);

        //calculate worth
        compound.output(compInv);
    }

    public void input(Investment compound)
    {
        if(counter == 0)
        {
            counter++;
            System.out.print("What is the principal amount? ");
            compound.setPrincipal(input.nextFloat());
        }

        else if(counter == 1)
        {
            counter++;
            System.out.print("What is the rate ");
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
        DecimalFormat df = new DecimalFormat("$0.00");
        System.out.print(compound.getPrincipal() + "invested at " + compound.getRate() + "% for " +
                compound.getYears() + " years compounded " + compound.perYear + " times per year is " + df.format(compound.getEndWorth()));
    }
}
