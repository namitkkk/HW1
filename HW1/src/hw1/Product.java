
package hw1;

/**
 *
 * @author kumar
 */
public class Product 
{
    public String pname;
    public String pdescription;
    
    
    public Product(String pname, String pdescription)
    {
        this.pname = pname;
        this.pdescription = pdescription;
        
    }
    
    public String getPname()
    {
        return this.pname;
    }
    
    public void setPname(String pname)
    {
        this.pname = pname;
    }
    
    public String getPdescription()
    {
        return this.pdescription;
    }
    
    public void setPdescription(String pdescription)
    {
        this.pdescription = pdescription; 
    }
}
