package complaints;
import java.util.*;
import java.io.*;
public class App {

	public static void main(String[] args) {
		
		Complaint_finder find= new Complaint_finder ();
		find.load_data();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Display all the complaints based on the year provided by the user \n"
				 +"2.Display all the complaints based on the name of the bank provided by the user \n"
				 + " 3.Display complaints based on the complaint id provided by the user \n "
				 + "4.Display number of days took by the Bank to close the complaint \n "
				 + "5.Display all the complaints closed/closed with explanation \n "
				 + "6.Display all the complaints which received a timely response \n "
				 + "7.For storing a complaint");
	
		
		int scan=sc.nextInt();
		sc.nextLine();
		
		switch(scan)
		{
		case 1: 
			System.out.println("Enter the year");
			String year=sc.next();
			find.YearComplaints(year);
			 break;
		case 2:
			 System.out.println("Enter company name");
			 String company=sc.nextLine();
			 //sc.next();
			 find.CompanyComplaints(company);
			 break;
		case 3:
			System.out.println("Enter complaint id");
			String complaintid=sc.nextLine();
			 find.ComplaintIDComplaints(complaintid);
		     break;
		case 5:
			System.out.println("Enter Company response to consumer ");
			String closing_state=sc.nextLine();
			find.Complaintsclosed_exp(closing_state);
			break;
		case 6:
			find.TimelyResponse();
			break;
		case 7:
			//File file=new File("C:\\Users\\Jotsna\\Desktop\\Sample.csv");
			File file=new File("C:\\Users\\Jotsna\\Downloads\\complaints.csv");
			try {
				FileWriter output=new FileWriter(file);
				Complaint_info x=find.newComplaint();
				output.append(x.getDate_recieved()+","+x.getProduct()+","+x.getSub_product()+","+x.getIssue()+","+x.getSub_issue()+","+x.getCompany()+","+x.getState()+","+x.getZIP_code()+","+x.getSubmitted_via()+","+x.getDate_sent()+","+x.getCompany_response()+","+x.getTimely_response()+","+x.getConsumer_disputed()+","+x.getComplaint_id());
				//System.out.println(output);
				output.flush();
				output.close();
				//CSVWriter write
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		 default:
			 System.out.println("Done");
	}

}
}
