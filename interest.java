import java.util.*;
import javax.lang.model.util.ElementScanner14;
class interest
{
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    int max = 20;
    int min = 1;
    int z = 0;
    System.out.println("TEAMROSH FINTECH SOLUTIONS");
    System.out.println("     A Company of KuhuRosh");
    System.out.println("");
    System.out.println("INTEREST CALCULATOR");
    System.out.println("Ver - 1.0");
    System.out.println(""); 
    System.out.println("Os Name : "+System.getProperty("os.name"));
    System.out.println("");  
    System.out.println("Java Version is : "+System.getProperty("java.version"));
    System.out.println("");
    System.out.println("Java Version Date : "+System.getProperty("java.version.date"));
    System.out.println("");
    System.out.println("Java Vendor : "+System.getProperty("java.vendor"));
    System.out.println(""); 
    while(true)
    {
    int random_int_one = (int)Math.floor(Math.random()*(max-min+1)+min); //CAPTCHA GENRATOR
    int random_int_two = (int)Math.floor(Math.random()*(max-min+1)+min); //CAPTCHA GENRATOR
    int vone = random_int_two+random_int_one;
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("CHANCES LEFT "+z);
    System.out.println("YOU HAVE ONLY 3 CHANCES TO VERIFY YOURSELF");
    System.out.println("");
    System.out.println("");
    System.out.println("PLEASE VERIFY YOURSELF AS A HUMAN");
    System.out.println("");
    System.out.println("ADD THIS "+random_int_one+" + "+random_int_two+" NUMBER TO VERFIY YOURSELF");
    int userver = sc.nextInt();
    z++;
    if(z==4)
    {
    System.out.println("");
    System.out.println("NO CHANCES LEFT");
    System.out.println("PLEASE TRY AGAIN LATER");
    System.exit(0);
    System.out.println("");
    }
    else
    {
    if(userver==vone)
    {
    System.out.println("");
    System.out.println("");
    System.out.println("IMPORTANT - ONLY ENTER THE NUMERIC VALUES AND DECIMAL VALUES");
    System.out.println("");
    System.out.println("CHOOSE THE DESIRABLE NUMBER");
    System.out.println("");
    System.out.println("1. COMPOUND INTEREST");
    System.out.println("2. SIMPLE INTEREST");
    System.out.println("3. FIXED INTEREST");
    System.out.println("4. VARIABLE INTEREST");
    System.out.println("5. DISCOUNTED INTEREST");
    System.out.println("6. ANNUAL PERCENTAGE");
    System.out.println("7. PRIME INTEREST");
    int cho1 = sc.nextInt();
    switch(cho1)
    {
    case 1:
    {
    System.out.println("");
    System.out.println("INPUT SECTION");
    System.out.println("");
    System.out.println("ENTER THE PRINCIPAL AMOUNT");
    Double pr1 = sc.nextDouble();
    System.out.println("ENTER THE RATE OF INTEREST");
    Double rm1 = sc.nextDouble();
    System.out.println("ENTER THE RATE OF TIME PERIOD");
    Long tm1 = sc.nextLong();
    Double sum1 = pr1 * (Math.pow((1 + rm1 / 100), tm1));
    Double cm1 = sum1-pr1;
    System.out.println("");
    System.out.println("SELECT TIME IN DAYS, MONTHS OR YEARS");
    System.out.println("1. DAYS");
    System.out.println("2. MONTHS");
    System.out.println("3. YEARS");
    int cho2 = sc.nextInt();
    if(cho2==1)
    {
    System.out.println("");
    System.out.println("***OUTPUT SECTION***");
    System.out.println("");
    System.out.print("PRINCIPAL IS "+pr1);System.out.print("  --  ");System.out.print("INTEREST IS "+rm1);System.out.print("  --  ");System.out.print("TIME IS "+tm1+" YEAR");System.out.println("");
    System.out.println("");
    System.out.println("AMOUNT FOR "+tm1+" DAYS IS "+sum1);
    System.out.println("");
    System.out.println("COMPOUND INTEREST FOR "+tm1+" DAYS IS "+cm1);
    System.out.println("");
    break;
    }
    else if(cho2==2)
    {
    System.out.println("");
    System.out.println("***OUTPUT SECTION***");
    System.out.println("");
    System.out.print("PRINCIPAL IS "+pr1);System.out.print("  --  ");System.out.print("INTEREST IS "+rm1);System.out.print("  --  ");System.out.print("TIME IS "+tm1+" YEAR");System.out.println("");
    System.out.println("");
    System.out.println("AMOUNT FOR "+tm1+" MONTHS IS "+sum1);
    System.out.println("");
    System.out.println("COMPOUND INTEREST FOR "+tm1+" MONTHS IS "+cm1);
    System.out.println("");
    break;
    }
    else
    {
    System.out.println("");
    System.out.println("***OUTPUT SECTION***");
    System.out.println("");
    System.out.print("PRINCIPAL IS "+pr1);System.out.print("  --  ");System.out.print("INTEREST IS "+rm1);System.out.print("  --  ");System.out.print("TIME IS "+tm1+" YEAR");System.out.println("");
    System.out.println("");
    System.out.println("AMOUNT FOR "+tm1+" YEARS IS "+sum1);
    System.out.println("");
    System.out.println("COMPOUND INTEREST FOR "+tm1+" YEARS  IS "+cm1);
    System.out.println("");
    break;
    }
    }
    case 2:
    {
    System.out.println("");
    System.out.println("INPUT SECTION");
    System.out.println("");
    System.out.println("ENTER THE PRINCIPAL AMOUNT");
    Double pr1 = sc.nextDouble();
    System.out.println("ENTER THE RATE OF INTEREST");
    Double rm1 = sc.nextDouble();
    System.out.println("ENTER THE RATE OF TIME PERIOD");
    Long tm1 = sc.nextLong();
    Double sum1 = pr1*rm1*tm1/100;
    System.out.println("");
    System.out.println("SELECT TIME IN DAYS, MONTHS OR YEARS");
    System.out.println("1. DAYS");
    System.out.println("2. MONTHS");
    System.out.println("3. YEARS");
    int cho2 = sc.nextInt();
    if(cho2==1)
    {
    System.out.println("");
    System.out.println("***OUTPUT SECTION***");
    System.out.println("");
    System.out.print("PRINCIPAL IS "+pr1);System.out.print("  --  ");System.out.print("INTEREST IS "+rm1);System.out.print("  --  ");System.out.print("TIME IS "+tm1+" YEAR");System.out.println("");
    System.out.println("");
    System.out.println("SIMPLE INTEREST FOR "+tm1+" DAYS IS "+sum1);
    System.out.println("");
    break;
    }
    else if(cho2==2)
    {
    System.out.println("");
    System.out.println("***OUTPUT SECTION***");
    System.out.println("");
    System.out.print("PRINCIPAL IS "+pr1);System.out.print("  --  ");System.out.print("INTEREST IS "+rm1);System.out.print("  --  ");System.out.print("TIME IS "+tm1+" YEAR");System.out.println("");
    System.out.println("");
    System.out.println("SIMPLE INTEREST FOR "+tm1+" MONTHS IS "+sum1);
    System.out.println("");
    break;
    }
    else
    {
    System.out.println("");
    System.out.println("***OUTPUT SECTION***");
    System.out.println("");
    System.out.print("PRINCIPAL IS "+pr1);System.out.print("  --  ");System.out.print("INTEREST IS "+rm1);System.out.print("  --  ");System.out.print("TIME IS "+tm1+" YEAR");System.out.println("");
    System.out.println("");
    System.out.println("SIMPLE INTEREST FOR "+tm1+" YEARS  IS "+sum1);
    System.out.println(""); 
    break;
    }
    }
    }
    }
    else
    {
    System.out.println("");
    System.out.println("UNABLE TO VERIFY YOURSELF");
    System.out.println("");
    System.out.println("PLEASE TRY AGAIN");
    System.out.println("");
    }
}
}
}
}