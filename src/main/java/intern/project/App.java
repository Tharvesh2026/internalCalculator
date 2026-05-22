package intern.project;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== INTERNAL MARK CALCULATOR =====");

        // Input CA marks
        System.out.print("Enter CA1 marks (out of 50): ");
        double ca1 = sc.nextDouble();

        System.out.print("Enter CA2 marks (out of 50): ");
        double ca2 = sc.nextDouble();

        // Input Activity marks (if unknown, user estimates)
        System.out.print("Enter Activity1 marks (out of 40 or estimate): ");
        double act1 = sc.nextDouble();

        System.out.print("Enter Activity2 marks (out of 40 or estimate): ");
        double act2 = sc.nextDouble();

        // --------------------------
        // CA conversion (30 marks)
        // --------------------------
        double ca1_scaled = ca1 * 0.3; // 15 marks max
        double ca2_scaled = ca2 * 0.3; // 15 marks max

        double ca_total = ca1_scaled + ca2_scaled;

        // --------------------------
        // Activity conversion (10 marks)
        // --------------------------
        double act1_scaled = act1/8; // 5 marks max
        double act2_scaled = act2/8; // 5 marks max

        double activity_total = act1_scaled + act2_scaled;

        // Final internal marks
        double final_total = ca_total + activity_total;

        // SAFE CHECK (based on CA only)
        String status = (ca_total >= 17) ? "SAFE" : "NOT SAFE";

        // OUTPUT
        System.out.println("\n===== RESULT =====");

        System.out.printf("CA Marks (out of 30): %.2f\n", ca_total);
        System.out.printf("Activity Marks (out of 10): %.2f\n", activity_total);
        System.out.printf("Final Internal (out of 40): %.2f\n", final_total);

        System.out.println("Status: " + status);

        sc.close();
    }
}