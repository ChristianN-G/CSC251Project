public class Policy // File name
{
   // instance/data field to hold the policy number, provider name, and the policy holder information of an insurance policy
   private int policyNum;
   private String providerName;
   private PolicyHolder policyHolder;
   
   /**
      no-arg constructor that initializes the policy number, provider name, and the policy holder's information of an insurance policy to default values
   */
   public Policy()
   {
      policyNum = 0;
      providerName = "None";
      policyHolder = null;
   }
   
   /**
      onstructor that initializes the policy number, provider name, and the policy holder's information of an insurance policy to the value of the argument passed
      @param policyNum The policy number.
      @param providerName The provider name.
      @param policyHolder The policy holder's information.
   */
   public Policy(int policyNum, String providerName, PolicyHolder policyHolder)
   {
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
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
   */
   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   } 
   
   /**
      Accessor (getter) method
      @return The policy holder's fee.
   */
   public double getFee(double BMI)
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
      @param policyHolder The policy holder's information..
   */
   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      this.policyHolder = policyHolder;
   }
   
}