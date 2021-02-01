import java.util.*;
public class details{
    private String pid,product_name,brand,product_url;
    private int retail_price,discounted_price;
    private float product_rating;
    public details(){}
    public details(String pid,String name,String brand,String url,int retail,int discount,float rating){

        this.pid=pid;
        this.product_name=name;
        this.brand=brand;
        this.product_url=url;
        this.retail_price=retail;
        this.discounted_price=discount;
        this.product_rating=rating;

    }
    public void setpid(String pid)throws Exception

     
    {    this.pid=pid;  
     
    }  

    public String getpid()
    {
        return pid;
    }
    public String getname()
    {
        return product_name;
    }    
    public String getbrand()
    {
        return brand;
    }
    public String geturl()
    {
        return product_url;
    }
    public int getretail()
    {
        return retail_price;
    }
    public int getdiscount()
    {
        return discounted_price;
    }
    public float getrating()
    {
        return product_rating;
    }
    public void setname(String name)throws Exception

     
    {    this.product_name=name;  
     
    }
    public void setbrand(String brand)throws Exception

     
    {   if(brand=="")
        this.brand=null;
        else
        this.brand=brand;  
     
    }
    public void seturl(String url)throws Exception

     
    {    this.product_url=url;  
     
    }
    public void setretail(int retail) 
    {
        this.retail_price=retail;
    }
    public void setdiscount(int discount) 
    {
        this.discounted_price=discount;
    }
    public void setrating(float rating) 
    {
        this.product_rating=rating;
    }


    
    @Override 
    public String toString() {
         return "[ "+ pid + ", " + product_name + ", " + brand +","+ product_url + "," + retail_price + "," + discounted_price +","+product_rating+" ]\n"; 
        }

        



}


