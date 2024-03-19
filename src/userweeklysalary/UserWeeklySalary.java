/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userweeklysalary;

import javax.swing.JOptionPane;

/**
 *
 * @author Ziyaad Hoosen st10322043@vcconnect.edu.za ST10322043
 */
public class UserWeeklySalary
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Dialog 1
        String wageInput = JOptionPane.showInputDialog(null, "Enter employee's hourly wage:",
                "Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);
        if (wageInput == null)
        {
            //  clicked cancel = exit program
            System.exit(0);
        }
        double hourlyWage = Double.parseDouble(wageInput);

        // Dialog 2
        String dependentInput = JOptionPane.showInputDialog(null, "How many dependents does the employee have?",
                "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
        if (dependentInput == null)
        {
            //  clicked cancel = exit program
            System.exit(0);
        }
        int numberOfDependents = Integer.parseInt(dependentInput);

        // calc weekly salary
        double weeklySalary = calculateWeeklySalary(hourlyWage, numberOfDependents);

        // show weekly salary
        JOptionPane.showMessageDialog(null, String.format("Weekly wage: $%.2f\nDeductions will be made for %d dependents.", weeklySalary, numberOfDependents),
                "Weekly Salary", JOptionPane.INFORMATION_MESSAGE);
    }

    // how to calculate weekly salary
    public static double calculateWeeklySalary(double hourlyWage, int numberOfDependents)
    {

        double weeklySalary = hourlyWage * 40;

        weeklySalary -= numberOfDependents * 100;
        return weeklySalary;
    }
}
