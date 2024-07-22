package homework;

class Clock{
	
	int hours,minutes,seconds;
	
//	public Clock() {
//		
//		hours = 12;
//		minutes = 0;
//		seconds = 0;
//		
//	}
//	
	public Clock(int hours,int minutes,int seconds) {
		
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
	}
	
	
	public void setClock(int seconds) {
		
		System.out.println(" Total No Of Seconds :  "+seconds);
		
		if(seconds<=60) {
			System.out.println("Seconds :  "+seconds);
		}
		else if(seconds>60){
			
			int temp = seconds/60;
			int temp2 = seconds%60;
			int temp3 = seconds/3600;
			System.out.println("Minutes : "+temp+" \n"+"Seconds : "+temp2+" \n"+"Hourse : "+temp3);
		}
	}
	
	
	
	
	
	
	
	
	
	public void secincrement() {
		
		seconds++;
		
	}
	
	public void secdecrement() {
		
		seconds++;
		
	}
	

	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public int getMinutes() {
		return minutes;
	}


	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}


	public int getSeconds() {
		return seconds;
	}


	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	
	public void substractClock(int sec) {
		
		
		int temp = seconds - sec;
		System.out.println("Diffrence of Seconds : "+ temp);
		
		
		
		
	}


	@Override
	public String toString() {
		return "Clock [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}
	
}




public class Question2 {

	
	public static void main(String[] ards) {
			
//		Clock cl = new Clock();
//		System.out.println(cl);

		Clock c2 = new Clock(12,5,38);
		System.out.println(c2);	
		
		
		c2.setClock(7265);
	
		c2.setHours(5);
		c2.setMinutes(45);
		c2.setSeconds(50);
		c2.secincrement();
		System.out.println("Hourse : "+c2.getHours()+"  "+" Minutes : " +c2.getMinutes()+"  "+"Seconds : "+c2.getSeconds());
		
		c2.secdecrement();
		System.out.println("Hourse : "+c2.getHours()+"  "+" Minutes : " +c2.getMinutes()+"  "+"Seconds : "+c2.getSeconds());
		
		c2.substractClock(45);
		

		
	}
	
	
	
}
