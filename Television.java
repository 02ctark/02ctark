





/** 
* This class tests the Television class
* 
* date: 9/28/21
* 
* Be able to write a whole program that functions like a computer.
* 
*/

public class Television{
	
	
	
	// Brand name of tele
	 final String MANUFACTURER;
	
	// the dimensions 
	 final int SCREEN_SIZE;
	
	// descriptions of current channel
	 int channel;
	
	// Changing volume
	 int volume;
	
	
	 
	 /**
	  * Method: Television
	  * 
	  * Television initializes manufacturer, screen size, power on to false, volume to 20,
	  * and channel to 2.
	  * 
	  * bring information to the television method
	 	@param MANUFACTURER the brand
		@param SCREEN_SIZE the size 
	 * 
	 */
	 public Television(String MANUFACTURER, int SCREEN_SIZE) {
		 
		 this.MANUFACTURER = MANUFACTURER;
		 this.SCREEN_SIZE = SCREEN_SIZE;
		 this.volume = 20;
		 this.channel = 2;
		 
	 }
	 
	 /**
	  * setChannel
	  * 
	  * initializes channel to station
	  * @param channels
	  */
	 public void setChannel(int station) {
		 
		 this.channel = station;
		 
		 
	 }
	 
	 
	 /**
	  * power
	  * initializes powerOn to the opposite of the original boolean
	  * 
	  */
	 
	 public void power() {
	       
	       
	   }
	 
	 
	 /**
	  * increasedVolume
	  * post increments of volume by 1
	  * 
	  */
	 public void increaseVolume() {
		 
		 this.volume++;
		 
	 }
	 
	 
	 /**
	  * 
	  * decreasedVolume
	  * post decrement volume by 1
	  * 
	  */
	 
	 public void decreaseVolume() {
		 
		 this.volume--;
		 
		 
	 }
	 
	 
	 /**
	  * getVolume
	  * 
	  * @return volume
	  */
	 
	 public int getVolume() {
		 
		 return volume;
		 
		 
	 }
	 
 
 
	 /**
	  * getChannel
	  * 
	  * @return channel
	  */
	 
	 
	 public int getChannel() {
		 
		 return channel;
		 
		 
	 }
	 
	 
	 /**
	  * MANUFACTURER
	  * 
	  * @return MANUFACTURER
	  */
	 
	 
	 public String getManufacturer() {
		 
		 return MANUFACTURER;
		 
		 
	 }
	 
	 
	 /**
	  * getScreenSize
	  * 
	  * @return SCREEN_SIZE
	  */
	 
	 
	 public int getScreenSize() {
		 
		 
		 return SCREEN_SIZE;
		 
	 }
	 
	
}