
class AddressList {
	public static int countAddressWithCity(Address[] addressList, String city){ 
		/* This method returns the count of the addresses from addressList which have the city attribute equals to city parameter passed for 
		 * this method. If the length of any passed argument is zero or value of any passed argument is null then it returns -1.*/
		if(city==null || addressList==null || city.length()==0 || addressList.length==0) return -1;
		int count =0;
		for(int i=0;i<addressList.length;i++) {
			if(addressList[i].getCity().equals(city)) count++;
		}
		return count;
	}// End of method countAddressWithCity() 
	
	public static int countAddressWithPin(Address[] addressList, String strP){ 
		/* This method returns the count of the addresses from addressList which have the pin attribute starting with strP parameter passed 
		 * for this method. If the length of any passed argument is zero or value of any passed argument is null then it returns -1.*/ 
		if(strP==null || addressList==null || strP.length()==0 || addressList.length==0) return -1;
		int count =0;
		for(int i=0;i<addressList.length;i++) {
			if(addressList[i].getPin().substring(0,strP.length()).equals(strP)) count++;
		}
		return count;
	}// End of method countAddressWithCity() 
	
	public static Address[] getAddressWithCity(Address[] addressList, String city){ 
		/* This method returns all the addresses from addressList by storing them in String[] which have the city attribute equals to city 
		 * parameter passed for this method. If the length of any passed argument is zero or value of any passed argument is null then it 
		 * returns null. If addressList does not contain any address with city attribute value equal to city parameter passed for this 
		 * method even then it returns null.*/ 
		int count=countAddressWithCity(addressList,city);
		if(count==0 || count==-1) return null;
		Address[] list = new Address[count];
		for(int i=0,j=0;i<addressList.length;i++) {
			if(addressList[i].getCity().equals(city)) {
				list[j]=addressList[i];
				j++;
			}
		}
		return list;
	}// End of method getAddressWithCity() 
	
	public static Address[] getAddressWithPin(Address[] addressList, String strP){ 
		/* This method returns all the addresses from addressList by storing them in String[] which have their pin attribute starting with 
		 * strP parameter passed for this method. If the length of any passed argument is zero or value of any passed argument is null then 
		 * it returns null. If addressList does not contain any address whose pins attribute value starts with strP parameter passed for 
		 * this method even then it returns null.*/ 
		int count=countAddressWithPin(addressList,strP);
		if(count==0 || count==-1) return null;
		Address[] list = new Address[count];
		for(int i=0,j=0;i<addressList.length;i++) {
			if(addressList[i].getPin().substring(0,strP.length()).equals(strP)) {
				list[j]=addressList[i];
				j++;
			}
		}
		return list;
	}// End of method getAddressWithPin() 
}// End of class AddressList
