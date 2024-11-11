public class Policy // File name
{
   // instance/data field to hold the policy number, provider name, and the policy holder information of an insurance policy
   private int policyNum;
   private String providerName;
   private PolicyHolder policyHolder;
   
   //holds how many polocy objects have been created
   private static int policyCount = 0;
   
   /**
      no-arg constructor that initializes the policy number, provider name, and the policy holder's information of an insurance policy to default values
   */
   public Policy()
   {
      policyNum = 0;
      providerName = "None";
      policyHolder = null;
      policyCount++;
   }
   
   /**
      onstructor that initializes the policy number, provider name, and the policy holder's information of an insurance policy to the value of the argument passed
      @param policyNum The policy number.
      @param providerName The provider name.
      @param policyHolder The policy holder's information.
      w/ added security as copy constructor
   */
   public Policy(int policyNum, String providerName, PolicyHolder policyHolder)
   {
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.policyHolder = new PolicyHolder(policyHolder.getFirstName(),policyHolder.getLastName(),policyHolder.getAge(),policyHolder.getSmokeStatus(),policyHolder.getHeight(),policyHolder.getWeight());
      policyCount++;
   }
   
   /**
      Accessor (getter) method
      @return The policy number.
   */
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   /**
      Accessor (getter) method
      @return The provider's name.
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's information.
      w/ added security returning a copy
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder.getFirstName(),policyHolder.getLastName(),policyHolder.getAge(),policyHolder.getSmokeStatus(),policyHolder.getHeight(),policyHolder.getWeight());
   } 
   
   /**
      Accessor (getter) method
      @return The policy holder's fee.
   */
   public double getFee()
   {
      if(policyHolder.getAge() > 50){
         if(policyHolder.getSmokeStatus().equalsIgnoreCase("smoker") && policyHolder.getBMI() > 35){
            return 600 + 75 + 100 + ((policyHolder.getBMI()-35) * 20);
         }
         else if(policyHolder.getSmokeStatus().equalsIgnoreCase("smoker")){
            return 600 + 75 + 100;
         }
         else if(policyHolder.getBMI() > 35){
            return 600 + 75 + ((policyHolder.getBMI()-35) * 20);
         }
         else{
            return 600 + 75;
         }
      }
      else if(policyHolder.getSmokeStatus().equalsIgnoreCase("smoker")){
         if(policyHolder.getSmokeStatus().equalsIgnoreCase("smoker") && policyHolder.getBMI() > 35){
            return 600 + 100 + ((policyHolder.getBMI()-35) * 20);
         }
         else{
            return 600 + 100;
         }
      }
      else if(policyHolder.getBMI() > 35){
         return 600 + ((policyHolder.getBMI()-35) * 20);
      }
      else{
         return 600;
      }
   }
   
   /**
      Accessor (getter) method
      @return The amount of policies counted
   */
   public static int getPolicyCount()
   {
      return policyCount;
   }
   
   /**
      mutator (setter) method
      @param policyNum The policy number.
   */
   public void setPolicyNum(int policyNum)
   {
      this.policyNum = policyNum;
   }
   
   /**
      mutator (setter) method
      @param providerName The provider name.
   */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   /**
      mutator (setter) method
      @param policyHolder The policy holder's information.
      w/ added security as making a deep copy of the argument
   */
   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      this.policyHolder = new PolicyHolder(policyHolder.getFirstName(),policyHolder.getLastName(),policyHolder.getAge(),policyHolder.getSmokeStatus(),policyHolder.getHeight(),policyHolder.getWeight());
   }
   
   /**
      toString method to display the policy details
   */
   public String toString()
   {
      return String.format("\nPolicy Number: %d\nProvider Name: %s\n%s\nPolicy Price: $%.2f\n", policyNum, providerName, policyHolder.toString(), getFee());
   }
   
}