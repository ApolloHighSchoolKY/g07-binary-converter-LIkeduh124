public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;

	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public String getBinary()
    {
        return binaryValue;
    }

    public void setBinary(String newBinary)
    {
        binaryValue = newBinary;
    }

    public String toBinary()
    {

        int count = 8;
        int valval = value;
        String end = "";
    	//Convert the integer value to binary
        while(count > 0)
        {
            end = (valval%2) + end;
            valval/=2;
            count--;
        }
        
    	return end;
    }

    public int toDecimal()
    {

        int x = value;
    	//Convert the binary value to decimal
        for(int pos = 0; pos<binaryValue.length(); pos++)
        {
            if(binaryValue.charAt(pos) == '1')
            {
                x += (Math.pow(2, binaryValue.length()-pos-1));
            }
        }
    	return x;
    }

    public String toString()
    {
        return "" + value;
    }

}