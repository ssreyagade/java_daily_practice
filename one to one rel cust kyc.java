class Solution3{

	public static Customer1[] findVerifiedCustomers(Customer1[] c, float minScore){
		int count=0;
	for(int i=0;i<c.length;i++){
		if(c[i].getKYC().getverStatus().equalsIgnoreCase("Verified") && c[i].getKYC().getverScore()>=minScore){
			count++;
		}
	}
	if(count==0){
		return null;
	}

	int index=0;
	Customer1[] newc=new Customer1[count];
	for(int i=0;i<c.length;i++){
		if(c[i].getKYC().getverStatus().equalsIgnoreCase("Verified") && c[i].getKYC().getverScore()>=minScore){
		newc[index]=c[i];
		index++;
		}

	}
	for(int i=0;i<index-1;i++){
		for(int j=i+1;j<index;j++){
			if(newc[i].getaccBalance()<newc[j].getaccBalance()){
				Customer1 temp=newc[i];
				newc[i]=newc[j];
				newc[j]=temp;
				}
		}
	}
	return newc;
		
	}


	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		Customer1[] cust=new Customer1[n];

		for(int i=0;i<cust.length;i++){
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			long c=sc.nextLong();sc.nextLine();
			double d=sc.nextDouble();sc.nextLine();

			int a1=sc.nextInt();sc.nextLine();
			String b1=sc.nextLine();
			String c1=sc.nextLine();
			float d1=sc.nextFloat();sc.nextLine();
			KYC k= new KYC(a1,b1,c1,d1);

			cust[i]=new Customer1(a,b,c,d,k);

			
		}
	float minScore=sc.nextFloat();sc.nextLine();

	Customer1[] res=findVerifiedCustomers(cust,minScore);
	if(res==null){
		System.out.println("No customer found");
	}
	else{
		for(int i=0;i<res.length;i++){
		System.out.println(res[i].getcustid());
		System.out.println(res[i].getcustname());
		System.out.println(res[i].getaccBalance());
		System.out.println(res[i].getKYC().getkycId());
		System.out.println(res[i].getKYC().getdoctype());
	}
	}

}
}



class Customer1{
	private int custid;
	private String custname;
	private long accNo;
	private double accBalance;
	private KYC k;

	public Customer1(int custid,String custname, long accNo, double accBalance, KYC k){
		this.custid=custid;
		this.custname=custname;
		this.accNo=accNo;
		this.accBalance=accBalance;
		this.k=k;
	}

	public int getcustid(){
		return custid;
	}
	public String getcustname(){
		return custname;
		}
	public long getaccNo(){
		return accNo;
		}
	public double getaccBalance(){
		return accBalance;
		}
	public KYC getKYC(){
		return k;
		}
}





class KYC{
	private int kycId;
	private String doctype;
	private String verStatus;
	private float verScore;
	

	public KYC(int kycId, String doctype, String verStatus, float verScore){
		this.kycId=kycId;
		this.doctype=doctype;
		this.verStatus=verStatus;
		this.verScore=verScore;

	}

	public int getkycId(){
		return kycId;
		}
	public String getdoctype(){
		return doctype;
		}
	public String getverStatus(){
		return verStatus;
		}
	public float getverScore(){
		return verScore;
		}

}