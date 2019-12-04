package main;

import java.util.Scanner;

public class InputTreatment
{
    public static int sixOptions()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag)
        {
            try
            {
                option = 0;
                flag = true;
                option = input.nextInt();
                if (option < 1 || option > 6)
                    throw new Exception();

            }
            catch (Exception e)
            {
                System.out.println("Please, type a valid option!");
                input.nextLine();
                flag = false;
            }
        }

        return option;
    }

    public static int fiveOptions()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag)
        {
            try
            {
                option = 0;
                flag = true;
                option = input.nextInt();
                if (option < 1 || option > 5)
                    throw new Exception();

            }
            catch (Exception e)
            {
                System.out.println("Please, type a valid option!");
                input.nextLine();
                flag = false;
            }
        }

        return option;
    }

    public static int fourOptions()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag)
        {
            try
            {
                option = 0;
                flag = true;
                option = input.nextInt();
                if (option < 1 || option > 4)
                    throw new Exception();

            }
            catch (Exception e)
            {
                System.out.println("Please, type a valid option!");
                input.nextLine();
                flag = false;
            }
        }

        return option;
    }

    public static int threeOptions()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag)
        {
            try
            {
                option = 0;
                flag = true;
                option = input.nextInt();
                if (option < 1 || option > 4)
                    throw new Exception();

            }
            catch (Exception e)
            {
                System.out.println("Please, type a valid option!");
                input.nextLine();
                flag = false;
            }
        }

        return option;
    }

    public static int twoOptions_1_2()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag)
        {
            try
            {
                option = 0;
                flag = true;
                option = input.nextInt();
                if (option != 1 && option != 2)
                    throw new Exception();

            }
            catch (Exception e)
            {
                System.out.println("Please, type a valid option!");
                input.nextLine();
                flag = false;
            }
        }

        return option;
    }

    public static int twoOptions_0_1()
    {
        int option = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag)
        {
            try
            {
                option = 0;
                flag = true;
                option = input.nextInt();
                if (option != 0 && option != 1)
                    throw new Exception();

            }
            catch (Exception e)
            {
                System.out.println("Please, type a valid option!");
                input.nextLine();
                flag = false;
            }
        }

        return option;
    }

    public static String readString()
    {
        String textOption = "";
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag)
        {
            try
            {
                textOption = "";
                flag = true;
                textOption = input.nextLine();
                if (textOption.equals(""))
                    throw new Exception();

            }
            catch (Exception e)
            {
                System.out.println("Please enter a valid option, not an empty space!");
                flag = false;
            }
        }

        return textOption;
    }

    public static String yesOrNo()
    {
        String yerOrNoOption = "";
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag)
        {
            try
            {
                yerOrNoOption = "";
                flag = true;
                yerOrNoOption = input.nextLine();
                if (!yerOrNoOption.equalsIgnoreCase("yes") && !yerOrNoOption.equalsIgnoreCase(("no")))
                    throw new Exception();

            } catch (Exception e) {
                System.out.println("Please choose yer or no!");
                flag = false;
            }
        }

        return yerOrNoOption;
    }
}