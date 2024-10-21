import java.util.*; // package, collection of related classes
import java.io.*;

public class Project_Christian_NataliGergich
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt");
      
      if(!file.exists())//make sure file exist
      {
         System.out.println("Unable to locate file");
         System.exit(0);//exit the program early
      }

      Scanner inputFile = new Scanner(file);
      
      //variables
      int policyNum;
      String providerName;
      String firstName;
      String lastName;
      int pHolderAge;
      String smokeStatus;
      double pHolderHeight;
      double pHolderWeight; 
      int totalSmokers = 0;
      int totalNonSmokers = 0;
      
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //Get insurance policy information
      while(inputFile.hasNext())
      {
         policyNum = inputFile.nextInt();
         inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         pHolderAge = inputFile.nextInt();
         inputFile.nextLine();
         smokeStatus = inputFile.nextLine();
         pHolderHeight = inputFile.nextDouble();
         pHolderWeight = inputFile.nextDouble();
         
         if(inputFile.hasNext()){
            inputFile.nextLine();
            inputFile.nextLine();
         }
         
         //instantiate a Policy object
         Policy policy = new Policy(policyNum, providerName, firstName, lastName, pHolderAge, smokeStatus, pHolderHeight, pHolderWeight);
         policies.add(policy);
      }
      
      inputFile.close();

      //display policy information
      for(int i = 0; i < policies.size(); i++){
         System.out.printf("\nPolicy Number: %d\n", policies.get(i).getPolicyNum());
         System.out.printf("Provider Name: %s\n", policies.get(i).getProviderName());
         System.out.printf("Policyholder's First Name: %s\n", policies.get(i).getFirstName());
         System.out.printf("Policyholder's Last Name: %s\n", policies.get(i).getLastName());
         System.out.printf("Policyholder's Age: %d\n", policies.get(i).getPHolderAge());
         System.out.printf("Policyholder's Smoking Status: %s\n", policies.get(i).getSmokeStatus());
         System.out.printf("Policyholder's Height: %.1f inches\n", policies.get(i).getPHolderHeight());
         System.out.printf("Policyholder's Weight: %.1f pounds\n", policies.get(i).getPHolderWeight());
         System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).getBMI());
         System.out.printf("Policy Price: $%.2f\n", policies.get(i).getFee(policies.get(i).getBMI()));
         System.out.println();
         
         if(policies.get(i).getSmokeStatus().equals("smoker")){
            totalSmokers += 1;
         }
         else{
            totalNonSmokers += 1;
         }
      }
      
      System.out.printf("\nThe number of policies with a smoker is: %d\n", totalSmokers);
      System.out.printf("The number of policies with a non-smoker is: %d", totalNonSmokers);
   }
}      