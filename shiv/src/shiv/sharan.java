package shiv;

public class sharan {
	public static void main(String args[])
	{
		sharan sh=new sharan();
		System.out.println(sh.sumNumbers("abc1 2dsff"));
	}
	public int sumNumbers(String str) {

	    int sum=0;
	    String temp=" ";
	    str=str+"";
	    for (int i = 0; i < str.length(); i++)
	    {
	        if(Character.isDigit(str.charAt(i)))
	        {
	            temp+=str.charAt(i);
	        }
	        else
	        { 
	            if(temp!="")
	            {
	                int value=Integer.parseInt(temp);
	                sum+=value;
	                temp="";
	            }

	        }
	    }

	    return sum; 
	}


}
