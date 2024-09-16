import java.util.*; // package, collection of related classes

public class Project_Christian_NataliGergich
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      //variables
      int policyNum;
      String providerName;
      String firstName;
      String lastName;
      int pHolderAge;
      String smokeStatus;
      double pHolderHeight;
      double pHolderWeight; 
      
      //Get insurance policy information
      System.out.print("Please enter the Policy Number: ");
      policyNum = input.nextInt();
      input.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      pHolderAge = input.nextInt();
      input.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeStatus = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      pHolderHeight = input.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      pHolderWeight = input.nextDouble();
      
      //instantiate a Policy object
      Policy policy = new Policy(policyNum, providerName, firstName, lastName, pHolderAge, smokeStatus, pHolderHeight, pHolderWeight);
      
      //display policy information
      System.out.printf("\nPolicy Number: %d\n", policy.getPolicyNum());
      System.out.printf("Provider Name: %s\n", policy.getProviderName());
      System.out.printf("Policyholder's First Name: %s\n", policy.getFirstName());
      System.out.printf("Policyholder's Last Name: %s\n", policy.getLastName());
      System.out.printf("Policyholder's Age: %d\n", policy.getPHolderAge());
      System.out.printf("Policyholder's Smoking Status: %s\n", policy.getSmokeStatus());
      System.out.printf("Policyholder's Height: %.1f inches\n", policy.getPHolderHeight());
      System.out.printf("Policyholder's Weight: %.1f pounds\n", policy.getPHolderWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getFee(policy.getBMI()));
      
   }
}      
