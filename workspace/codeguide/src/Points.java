/**
 * this class contain of customer members' points.
 * 
 * @author Kwankaew Uttama
 *
 */
//TODO write a java doc
public class Points extends Customer {
	/** the customer's points */
	private double point;
	/** the goods' price */
	private double price;
	/** the types of goods that customer bought */
	private String typeGoods;

	/**
	 * the constructor of this class
	 */
	public Points() {
		this.point = 0;
	}

	/**
	 * Initialize a Points object.
	 * 
	 * @param points
	 *            is each member point.
	 */
	public Points(double points) {
		this.point = points;
	}

	// TODO write a class that add points for customer every buying.
	//      type   |     points
	//  -----------|--------------
	//		drink  |   price*0.5
	//		snack  |   price*0.25
	//	ice-cream  |   price*0.7
	//		food   |   price*0.1
	//		other  |   price*0.05

	// TODO write Getters and Setters

}
