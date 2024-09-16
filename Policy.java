public class Policy // File name
{
   // instance/data field to hold the policy number, provider name, first and last name, policy holder age, smoking status, policy holder height, and weight of an insurance policy
   private int policyNum;
   private String providerName;
   private String firstName;
   private String lastName;
   private int pHolderAge;
   private String smokeStatus;
   private double pHolderHeight;
   private double pHolderWeight;
   
   /**
      no-arg constructor that initializes the policy number, provider name, first and last name, policy holder age, smoking status, policy holder height, and weight of an insurance policy to default values
   */
   public Policy()
   {
      policyNum = 0;
      providerName = "None";
      firstName = "None";
      lastName = "None";
      pHolderAge = 0;
      smokeStatus = "None";
      pHolderHeight = 0.0;
      pHolderWeight = 0.0;
   }
   
   /**
      Constructor that initializes the policy number, provider name, first and last name, policy holder age, smoking status, policy holder height, and weight of an insurance policy to the valaue of the argument it is
      @param policyNum The policy number.
      @param providerName The provider name.
      @param firstName The policy holder's first name.
      @param lastName The policy holder's last name.
      @param pHolderAge The policy holder's age.
      @param smokeStatus The policy holder's smoking status.
      @param pHolderHeight The policy holder's height.
      @param pHolderWeight The policy holder's weight.
   */
   public Policy(int num, String pName, String fName, String lName, int age, String sStatus, double height, double weight)
   {
      policyNum = num;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      pHolderAge = age;
      smokeStatus = sStatus;
      pHolderHeight = height;
      pHolderWeight = weight;
   }

   /**
      mutator (setter) method
      @param policyNum The policy number.
      @param providerName The provider name.
      @param firstName The policy holder's first name.
      @param lastName The policy holder's last name.
      @param pHolderAge The policy holder's age.
      @param smokeStatus The policy holder's smoking status.
      @param pHolderHeight The policy holder's height.
      @param pHolderWeight The policy holder's weight.
   */
   public void setPolicy(int num, String pName, String fName, String lName, int age, String sStatus, double height, double weight)
   {
      policyNum = num;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      pHolderAge = age;
      smokeStatus = sStatus;
      pHolderHeight = height;
      pHolderWeight = weight;
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
      @return The provider name.
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's first name.
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's last name.
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's age.
   */
   public int getPHolderAge()
   {
      return pHolderAge;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's smoking status.
   */
   public String getSmokeStatus()
   {
      return smokeStatus;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's height.
   */
   public double getPHolderHeight()
   {
      return pHolderHeight;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's weight.
   */
   public double getPHolderWeight()
   {
      return pHolderWeight;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's BMI.
   */
   public double getBMI()
   {
      double BMI = (pHolderWeight * 703) / (pHolderHeight * pHolderHeight);
      return BMI;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's fee.
   */
   public double getFee(double BMI)
   {
      if(pHolderAge > 50){
         if(smokeStatus.equalsIgnoreCase("smoker") && BMI > 35){
            return 600 + 75 + 100 + ((BMI-35) * 20);
         }
         else if(smokeStatus.equalsIgnoreCase("smoker")){
            return 600 + 75 + 100;
         }
         else if(BMI > 35){
            return 600 + 75 + ((BMI-35) * 20);
         }
         else{
            return 600 + 75;
         }
      }
      else if(smokeStatus.equalsIgnoreCase("smoker")){
         if(smokeStatus.equalsIgnoreCase("smoker") && BMI > 35){
            return 600 + 100 + ((BMI-35) * 20);
         }
         else{
            return 600 + 100;
         }
      }
      else if(BMI > 35){
         return 600 + ((BMI-35) * 20);
      }
      else{
         return 600;
      }
   }
}