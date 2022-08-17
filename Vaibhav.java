import java.util.*; 
public class Main 
{ 
	public static void main(String[] args)  
	{ 
		Shreevat v=new Shreevat(); 
		System.out.println("human resources");
		v.Add(2,3); //addition of two integers 
		v.Add(2.3f,2.7f); // addition of two floats 
		Tejus m=new Tejus(); 
		System.out.println("Tejus and sreevatsa working together"); 
		m.Add(2,3); // multiplication of two integers 
		Jinesh p=new Jinesh();// constructor created, object Instantiation 
		p.manage(); 
		p.team(); 
	} 
} 
class Shreevat// Encapsulation 
{ 
    public void Add(int a,int b) 
    { 
        int c=a+b; 
        System.out.println("ths int sum "+c); 
    } 
    public void Add(float a,float b)// Overload 
    { 
        float c=a+b; 
        System.out.println("ths float sum "+c); 
    } 
} 
class Tejus extends Shreevat 
{ 
    public void Add(int a,int b)// Override 
    { 
        int c=a*b; 
        System.out.println("Hr team  hit  "+c); 
    } 
} 
interface aaa// Abstraction 
{ 
    void manage(); 
    void team(); 
} 
class Jinesh implements aaa 
{ 
    public void manage()
    { 
        System.out.println("managing the team"); 
    } 
    public void team() 
    { 
        System.out.println ("team doing well"); 
    } 
} 