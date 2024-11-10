public class PolicyHolder // File name
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokeStatus;
   private double height;
   private double weight;
   
   /**
      no-arg constructor that initializes the first and last name, age, smoking status, height, and weight to a person whos a holder of an insurance policy to default values
   */
   public PolicyHolder()
   {
      firstName = "None";
      lastName = "None";
      age = 0;
      smokeStatus = "None";
      height = 0.0;
      weight = 0.0;
   }
   
   /**
      Constructor that initializes the first and last name, age, smoking status, height, and weight to a person whos a holder of an insurance policy to the valaue of the argument that's passed
      @param firstName The policy holder's first name.
      @param lastName The policy holder's last name.
      @param age The policy holder's age.
      @param smokeStatus The policy holder's smoking status.
      @param height The policy holder's height.
      @param weight The policy holder's weight.
   */
   public PolicyHolder(String firstName, String lastName, int age, String smokeStatus, double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokeStatus = smokeStatus;
      this.height = height;
      this.weight = weight;
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
   public int getAge()
   {
      return age;
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
   public double getHeight()
   {
      return height;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's weight.
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder's BMI.
   */
   public double getBMI()
   {
      double BMI = (weight * 703) / (height * height);
      return BMI;
   }
   
   /**
      mutator (setter) method
      @param policyNum The policy number.
   */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   /**
      mutator (setter) method
      @param policyNum The policy number.
   */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   /**
      mutator (setter) method
      @param policyNum The policy number.
   */
   public void setAge(int age)
   {
      this.age = age;
   }
   
   /**
      mutator (setter) method
      @param policyNum The policy number.
   */
   public void setSmokeStatus(String smokeStatus)
   {
      this.smokeStatus = smokeStatus;
   }
   
   /**
      mutator (setter) method
      @param policyNum The policy number.
   */
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   /**
      mutator (setter) method
      @param policyNum The policy number.
   */
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
      
}