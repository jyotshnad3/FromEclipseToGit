package complaints;
import java.util.*;
import java.io.*;
public class File_load {
	List<Complaint_info> listofcom=new ArrayList<Complaint_info>();
	public void file_list()
	{
		
		String csv_path="C:\\Users\\Jotsna\\Downloads\\complaints.csv";
		String l="";
		
		try {
			BufferedReader bu=new BufferedReader(new FileReader(csv_path));
				while((l=bu.readLine())!=null)
				{
					String []complaints=l.split(",");
					Complaint_info obj=new Complaint_info();
					obj.setDate_recieved(complaints[0]);
					obj.setProduct(complaints[1]);
					obj.setSub_product(complaints[2]);
					obj.setIssue(complaints[3]);
					obj.setSub_issue(complaints[4]);
					obj.setCompany(complaints[5]);
					obj.setState(complaints[6]);
					obj.setZIP_code(complaints[7]);
					obj.setSubmitted_via(complaints[8]);
					obj.setDate_sent(complaints[9]);
					obj.setCompany_response(complaints[10]);
					obj.setTimely_response(complaints[11]);
					obj.setConsumer_disputed(complaints[12]);
					obj.setComplaint_id(complaints[13]);
					listofcom.add(obj);
				}
				bu.close();
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		}
	List<Complaint_info> Get_listobj(){
		
		return listofcom;
		
	}
}
