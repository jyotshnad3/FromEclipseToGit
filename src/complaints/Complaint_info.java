package complaints;

public class Complaint_info {

      
		private String Date_recieved;
		private String Product;
		private String Sub_product;
		private String Issue;
		private String Sub_issue;
		private String Company;
		private String State;
		private String ZIP_code;
		private String Submitted_via;
		private String Date_sent;
		private String Company_response;
		private String Timely_response;
		private String Consumer_disputed;
		private String Complaint_id;
		
		public String getDate_recieved() {
			return Date_recieved;
		}
		public void setDate_recieved(String date_recieved) {
			Date_recieved = date_recieved;
		}
		public String getProduct() {
			return Product;
		}
		public void setProduct(String product) {
			Product = product;
		}
		public String getSub_product() {
			return Sub_product;
		}
		public void setSub_product(String sub_product) {
			Sub_product = sub_product;
		}
		public String getIssue() {
			return Issue;
		}
		public void setIssue(String issue) {
			Issue = issue;
		}
		public String getSub_issue() {
			return Sub_issue;
		}
		public void setSub_issue(String sub_issue) {
			Sub_issue = sub_issue;
		}
		public String getCompany() {
			return Company;
		}
		public void setCompany(String company) {
			Company = company;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getZIP_code() {
			return ZIP_code;
		}
		public void setZIP_code(String zIP_code) {
			ZIP_code = zIP_code;
		}
		public String getSubmitted_via() {
			return Submitted_via;
		}
		public void setSubmitted_via(String submitted_via) {
			Submitted_via = submitted_via;
		}
		public String getDate_sent() {
			return Date_sent;
		}
		public void setDate_sent(String date_sent) {
			Date_sent = date_sent;
		}
		public String getCompany_response() {
			return Company_response;
		}
		public void setCompany_response(String company_response) {
			Company_response = company_response;
		}
		public String getTimely_response() {
			return Timely_response;
		}
		public void setTimely_response(String timely_response) {
			Timely_response = timely_response;
		}
		public String getConsumer_disputed() {
			return Consumer_disputed;
		}
		public void setConsumer_disputed(String consumer_disputed) {
			Consumer_disputed = consumer_disputed;
		}
		public String getComplaint_id() {
			return Complaint_id;
		}
		public void setComplaint_id(String complaint_id) {
			Complaint_id = complaint_id;
		}
		public String toString() {
			return "Complaint_info [Date_recieved=" + Date_recieved + ", Product=" + Product + ", Sub_product="
					+ Sub_product + ", Issue=" + Issue + ", Sub_issue=" + Sub_issue + ", Company=" + Company
					+ ", State=" + State + ", ZIP_code=" + ZIP_code + ", Submitted_via=" + Submitted_via
					+ ", Date_sent=" + Date_sent + ", Company_response=" + Company_response + ", Timely_response="
					+ Timely_response + ", Consumer_disputed=" + Consumer_disputed + ", Complaint_id=" + Complaint_id
					+"]";
		}
		
		public Complaint_info() {
		}
		public Complaint_info(String date_recieved, String product, String sub_product, String issue, String sub_issue,
				String company, String state, String zIP_code, String submitted_via, String date_sent,
				String company_response, String timely_response, String consumer_disputed, String complaint_id) {
			super();
			Date_recieved = date_recieved;
			Product = product;
			Sub_product = sub_product;
			Issue = issue;
			Sub_issue = sub_issue;
			Company = company;
			State = state;
			ZIP_code = zIP_code;
			Submitted_via = submitted_via;
			Date_sent = date_sent;
			Company_response = company_response;
			Timely_response = timely_response;
			Consumer_disputed = consumer_disputed;
			Complaint_id = complaint_id;
		}
	
		

}
