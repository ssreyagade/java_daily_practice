class Solution3{
    
    public static Truck[] getAllTruckWithDistance(Truck[] t, float threshold){
        int index=0;
        
        for(int i=0;i<t.length;i++){
            if(t[i].getTotalMilesTraveled()>=threshold){
                
                index++;
            }
        }
        if(index==0){
            return null;
        }
        Truck[] newt=new Truck[index];
        int k=0;
        for(int i=0;i<t.length;i++){
            if(t[i].getTotalMilesTraveled()>=threshold){
                newt[k]=t[i];
                k++;
            }
        }
        
        for(int i=0;i<index-1;i++){
            for(int j=i+1;j<index;j++){
                if(newt[i].getDriver().getExperience()<newt[j].getDriver().getExperience()){
                    Truck temp=newt[i];
                    newt[i]=newt[j];
                    newt[j]=temp;
                    
                }
            }
        }return newt;
    }
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        Truck[] tu=new Truck[n];
        
        for(int i=0;i<n;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            float c= sc.nextFloat();sc.nextLine();
            
            int a1=sc.nextInt();sc.nextLine();
            String b1=sc.nextLine();
            String c1=sc.nextLine();
            float d1=sc.nextFloat();sc.nextLine();
            
            Driver driver= new Driver(a1,b1,c1,d1);
            tu[i]=new Truck(a,b,c,driver);
        }
        float threshold = sc.nextFloat();

        Truck[] ans = getAllTruckWithDistance(tu,threshold);
        
        if(ans==null)
        {
            System.out.println("No Truck Found");
        }
        else
        {
            for(int i=0;i<ans.length;i++)
            {
                System.out.println(ans[i].getId());
                System.out.println(ans[i].getName());
                System.out.println(ans[i].getTotalMilesTraveled());
                System.out.println(ans[i].getDriver().getId());
                System.out.println(ans[i].getDriver().getName());
                
                
                
            }
        }
            
    }
}

class Truck{
    private int id;
    private String name;
    private float totalMilesTraveledByTruck;
    private Driver driver;
    
    public Truck(int id, String name, float totalMilesTraveled, Driver driver) {
        this.id = id;
        this.name = name;
        this.totalMilesTraveledByTruck = totalMilesTraveled;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getTotalMilesTraveled() {
        return totalMilesTraveledByTruck;
    }

    public Driver getDriver() {
        return driver;
    }
    
}

class Driver{
    private int id;
    private String name;
    private String contact;
    private float experience;
    
    
    
    public Driver(int id, String name, String contact, float experience) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.experience = experience;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getExperience() {
        return experience;
    }
    
}

