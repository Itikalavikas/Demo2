package score;

import java.util.Comparator;

public class Students implements Comparable<Students>
{
String s1; 
int i1;

public static  Comparator<Students> i1Comparator;
Students(String s1,int i1)
{
	this.s1 = s1;
	this.i1 = i1;
}

public int compareTo(Students arg0) 
{
	
	return 0;
}
public String toString()
{
	return "name : "+this.s1+" Score : "+this.i1;
			}
}