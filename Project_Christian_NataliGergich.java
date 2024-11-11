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
      
      //add each policy to an array list policies
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
         
         //create a policyHolder object
         PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, pHolderAge, smokeStatus, pHolderHeight, pHolderWeight);
         
         //instantiate a Policy object
         Policy policy = new Policy(policyNum, providerName, policyHolder);
         policies.add(policy);
         
         if(smokeStatus.equalsIgnoreCase("smoker")){
            totalSmokers ++;
         }
         else{
            totalNonSmokers ++;
         }
         
      }
                  
      inputFile.close();      
      
      //display policy information
      //implicitly calls the toString method
      for(Policy policy : policies){
         System.out.println(policy);
      }
      
      System.out.printf("\nThere were %d Policy objects created.\n", Policy.getPolicyCount());      
      System.out.printf("\nThe number of policies with a smoker is: %d\n", totalSmokers);
      System.out.printf("The number of policies with a non-smoker is: %d", totalNonSmokers);

   }
}      