import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

//Create by Christy at 19/08/2020...

public class Deal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		    private String sellerName;
		    private LocalDate closeDate;
		    private LocalDateTime closeTime;
		    private String buyerName;
		    
		    /**
		     * @param SellerName
		     * @param closeDate
		     * @param closeTime
		     * @param buyerrName
		     */
		    public Deal(String sellerName, LocalDate closeDate, LocalDateTime closeTime, String buyerName) {
		        this.sellerName = sellerName;
		        this.closeDate = closeDate;
		        this.closeTime = closeTime;
		        this.buyerName = buyerName;
		    }
		    /**
		     * @return the sellerName
		     */
		    public String getsellerName() {
		        return sellerName;
		    }
		    /**
		     * @param sellerName the sellerName to set
		     */
		    public void setsellerName(String sellerName) {
		        this.sellerName = sellerName;
		    }
		    /**
		     * @return the closeDate
		     */
		    public LocalDate getcloseDate() {
		        return closetDate;
		    }
		    /**
		     * @param closeDate the closeDate to set
		     */
		    public void setcloseDate(LocalDate closeDate) {
		        this.closeDate = closeDate;
		    }
		    /**
		     * @return the closeTime
		     */
		    public LocalDateTime getcloseTime() {
		        return closeTime;
		    }
		    /**
		     * @param closeTime the closeTime to set
		     */
		    public void setcloseTime(LocalDateTime closeTime) {
		        this.closeTime = closeTime;
		    }
		    /**
		     * @return the buyerName
		     */
		    public String getbuyerName() {
		        return buyerName;
		    }
		    /**
		     * @param buyerName the buyerName to set
		     */
		    public void setbuyerName(String buyerName) {
		        this.buyerName = buyerName;
		    }
		    
		    public void showDealtDetails( ) {
		        
		        System.out.println("Date of Dealt: " + DealDate);
		        System.out.println(" Close Time : " + closeTime);
		        System.out.println("Buyer Name: " + buyerName);
		        
		    }
	}

}
