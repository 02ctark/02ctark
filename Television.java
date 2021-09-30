package application;






/** 
* This class tests the Television class
* 
* date: 9/28/21
* 
* Be able to write a whole program that functions like a computer.
* 
*/


public class Television{
	
	static void main(String[] args) {
		
	}
	// Brand name of tele
	  String MANUFACTURER;
	
	// the dimensions 
	  int SCREEN_SIZE;
	
	// descriptions of current channel
	 int channel;
	
	// Changing volume
	 int volume;
	 
	 //power
	 private boolean powerOn = false;
	
	
	
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
	 public Television(String manufacturer, int screen_size) {
		 
		 MANUFACTURER = manufacturer;
		 SCREEN_SIZE = screen_size;
		 volume = 20;
		 channel = 2;
		 
	 }
	 
	 /**
	  * setChannel
	  * 
	  * initializes channel to station
	  * @param channels
	  */
	 public void setChannel(int station) {
		 
		 channel = station;
		 
		 
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
		 
		 volume++;
		 
	 }
	 
	 
	 /**
	  * 
	  * decreasedVolume
	  * post decrement volume by 1
	  * 
	  */
	 
	 public void decreaseVolume() {
		 
		 volume--;
		 
		 
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
