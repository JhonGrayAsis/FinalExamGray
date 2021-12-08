import java.util.Scanner;

class gray1 {
    public static void main(String[] args) {
        Scanner gray = new Scanner(System.in);
        System.out.print("Annual Salary: ");
        float jhon = gray.nextFloat();

        if(jhon < 250000){

            float month_r = jhon / 12;
            float daily_r = month_r / 22;
            float hourly_r = daily_r / 8;
            Double annualTD = 0.00;
            Double monthlyTD = 0.00;
            Double NP = month_r - monthlyTD;

            System.out.println("Monthly Rate: " + String.format("%.2f", month_r));
            System.out.println("Daily Rate: " + String.format("%.2f", daily_r));
            System.out.println("Hourly Rate: " + String.format("%.2f", hourly_r));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", annualTD));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", monthlyTD));
            System.out.println("Net Pay: " + String.format("%.2f", NP));

        }
        else if(jhon >= 250000 && jhon < 400000){

            Double tax_deduction = jhon - 250000 * .20;

            float month_r = jhon / 12;
            float daily_r = month_r / 22;
            float hourly_r = daily_r / 8;
            Double annualTD = tax_deduction;
            Double monthlyTD = annualTD / 12;
            Double NP = month_r - monthlyTD;

            System.out.println("Monthly Rate: " + String.format("%.2f", month_r));
            System.out.println("Daily Rate: " + String.format("%.2f", daily_r));
            System.out.println("Hourly Rate: " + String.format("%.2f", hourly_r));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", annualTD));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", monthlyTD));
            System.out.println("Net Pay: " + String.format("%.2f", NP));

        }
        else if(jhon >= 400000 && jhon < 800000){

            float tax_excess = jhon - 400000;
            Double tax_deduction = 0.25 * tax_excess + 30000;

            float month_r = jhon / 12;
            float daily_r = month_r / 22;
            float hourly_r = daily_r / 8;
            Double annualTD = tax_deduction;
            Double monthlyTD = annualTD / 12;
            Double NP = month_r - monthlyTD;

            System.out.println("Monthly Rate: " + String.format("%.2f", month_r));
            System.out.println("Daily Rate: " + String.format("%.2f", daily_r));
            System.out.println("Hourly Rate: " + String.format("%.2f", hourly_r));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", annualTD));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", monthlyTD));
            System.out.println("Net Pay: " + String.format("%.2f", NP));

        }
        else if(jhon >= 800000 && jhon < 2000000){

            float tax_excess = jhon - 800000;
            Double tax_deduction = 0.30 * tax_excess + 130000;

            float month_r = jhon / 12;
            float daily_r = month_r / 22;
            float hourly_r = daily_r / 8;
            Double annualTD = tax_deduction;
            Double monthlyTD = annualTD / 12;
            Double NP = month_r - monthlyTD;

            System.out.println("Monthly Rate: " + String.format("%.2f", month_r));
            System.out.println("Daily Rate: " + String.format("%.2f", daily_r));
            System.out.println("Hourly Rate: " + String.format("%.2f", hourly_r));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", annualTD));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", monthlyTD));
            System.out.println("Net Pay: " + String.format("%.2f", NP));

        }
        else if(jhon >= 2000000 && jhon < 8000000){

            float tax_excess = jhon - 2000000;
            Double tax_deduction = 0.32 * tax_excess + 490000;

            float month_r = jhon / 12;
            float daily_r = month_r / 22;
            float hourly_r = daily_r / 8;
            Double annualTD = tax_deduction;
            Double monthlyTD = annualTD / 12;
            Double NP = month_r - monthlyTD;

            System.out.println("Monthly Rate: " + String.format("%.2f", month_r));
            System.out.println("Daily Rate: " + String.format("%.2f", daily_r));
            System.out.println("Hourly Rate: " + String.format("%.2f", hourly_r));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", annualTD));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", monthlyTD));
            System.out.println("Net Pay: " + String.format("%.2f", NP));

        }
        else if(jhon >= 8000000){

            float tax_excess = jhon - 8000000;
            Double tax_deduction = 0.35 * tax_excess + 2410000;

            float month_r = jhon / 12;
            float daily_r = month_r / 22;
            float hourly_r = daily_r / 8;
            Double annualTD = tax_deduction;
            Double monthlyTD = annualTD / 12;
            Double NP = month_r - monthlyTD;

            System.out.println("Monthly Rate: " + String.format("%.2f", month_r));
            System.out.println("Daily Rate: " + String.format("%.2f", daily_r));
            System.out.println("Hourly Rate: " + String.format("%.2f", hourly_r));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", annualTD));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", monthlyTD));
            System.out.println("Net Pay: " + String.format("%.2f", NP));

        }
    }

}