/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(Place.INDOOR, 5, "Basketball"),
	VOLLEY(Place.INDOOR, 6, "Volleyball"),
	TENNIS(Place.OUTDOOR, 1, "Tennis"),
	BIKE(Place.OUTDOOR, 1, "Bike"),
	F1(Place.OUTDOOR, 1, "Formula 1"),
	MOTOGP(Place.INDOOR, 1, "Moto GP"),
	SOCCER(Place.OUTDOOR, 11, "Soccer");

    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	
	private final int noTeamMembers;
	private final Place place;
	private final String actualName;

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */

	/**
	 * @param place
	 * 			Defines is the sport is played INDOOR or OUTDOOR.
	 * @param noTeamMembers
	 * 			Number of team members.
	 * @param actualName
	 * 			Actual string name of the sport.
	 */
	private Sport(Place place, int noTeamMembers,  String actualName) {
		this.noTeamMembers = noTeamMembers;
		this.place = place;
		this.actualName = actualName;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	
	//1)
	/**
	 * @return
	 * 		true if the number of team members is 1.
	 */
	public boolean isIndividualSport() {
		return this.noTeamMembers == 1;
	}
	
	
	//2)
	/**
	 * @return
	 * 		true if sport is played indoors.
	 */
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
	
	//3)
	/**
	 * A getter for the place.
	 * @return
	 * 		INDOOR or OUTDOOR.
	 */
	public Place getPlace() {
		return this.place;
	}
	
	//4)
	/**
	 *	ToString that return the actual sport name.
	 *	@return
	 *			Actual sport name.
	 */
	public String toString() {
		return this.actualName;
	}
}
