package complaints;
import java.util.*;
public class Complaint_finder {
File_load f=new File_load();
Scanner sc=new Scanner(System.in);

void load_data()
{
	f.file_list();
}

void YearComplaints(String year)
{   int count=0;
	List<Complaint_info> l=f.Get_listobj();
	for ( Complaint_info c:l) 
	{ 
		
		if(c.getDate_recieved().contains(year))
			  { 
			    
		  		System.out.println(c);
		  		count++;
			  }
	}
	System.out.println("Total complaints in year are "+count);
}

void CompanyComplaints(String company)
{ 
	int count=0;
	List<Complaint_info> l=f.Get_listobj();
	for ( Complaint_info c:l) 
	{ 
		
		if(c.getCompany().equalsIgnoreCase(company))
			  { 
			    
		  		System.out.println(c);
		  		count++;
			  }
	}
	System.out.println("Total complaints based on company are "+count);
}



void ComplaintIDComplaints(String complaintid) {
	int count=0;
	List<Complaint_info> l=f.Get_listobj();
	for ( Complaint_info c:l) 
	{ 
		
		if(c.getComplaint_id().equals(complaintid))
			  { 
			    
		  		System.out.println(c);
		  		count++;
			  }
	}
	System.out.println("Total complaints based on complaint ID is/are "+count);
}
void Complaintsclosed_exp(String closing_state) {
	int count=0;
	List<Complaint_info> l=f.Get_listobj();
	for ( Complaint_info c:l) 
	{ 
		
		if(c.getComplaint_id().equals(closing_state))
			  { 
			    
		  		System.out.println(c);
		  		count++;
			  }
		
	}
	System.out.println("Total complaints based on "+closing_state+" are "+count);
}

void TimelyResponse() {
	int count=0;
	List<Complaint_info> l=f.Get_listobj();
	for ( Complaint_info c:l) 
	{ 
		
		if(c.getComplaint_id().equalsIgnoreCase("Yes"))
			  { 
			    
		  		System.out.println(c);
		  		count++;
			  }
		
	}
	System.out.println("Timely Response complaints were "+count);
}

Complaint_info newComplaint()
{
	Complaint_info id=new Complaint_info();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Date_received");
	id.setDate_recieved(sc.nextLine());
	System.out.println("Enter Product");
	id.setProduct(sc.nextLine());
	System.out.println("Enter Sub Product");
	id.setSub_product(sc.nextLine());
	System.out.println("Enter issue");
	id.setIssue(sc.nextLine());
	System.out.println("Enter sub_issue");
	id.setSub_issue(sc.nextLine());
	System.out.println("Enter company");
	id.setCompany(sc.nextLine());
	System.out.println("Enter state");
	id.setState(sc.nextLine());
	System.out.println("Enter ZIP_code");
	id.setZIP_code(sc.nextLine());
	System.out.println("Enter Submitted_via");
	id.setSubmitted_via(sc.nextLine());
	System.out.println("Enter Company_response");
	id.setCompany_response(sc.nextLine());
	System.out.println("Enter Timely_Response");
	id.setTimely_response(sc.nextLine());
	System.out.println("Enter Consumer_disputed");
	id.setConsumer_disputed(sc.nextLine());
	System.out.println("Enter Complaint_id");
	id.setComplaint_id(sc.next());
	
	return id;
	
}
}
