
import java.io.*; 
import java.util.*;
class task1{
    public static void main(String[] args)throws Exception {

        List<details> books = readdataFromCSV("data//flipkart-product-sample.csv");
        Collections.sort(books,new pricesort());{
            
           
    

    FileWriter fw = null;
    BufferedWriter bw = null;
    try { 
        fw = new FileWriter("sortprice.txt"); 
        bw = new BufferedWriter(fw);
        for(details d:books){

        bw.write(d.toString());
        }
        fw.close();
            System.out.println("Succesfully written(sortprice) to the file: " );           
        }catch(Exception e){
            e.printStackTrace();}}
        
    

         Collections.sort(books,new ratingsort());{
            FileWriter fw = null;
            BufferedWriter bw = null;
           
            
            try { 
                fw = new FileWriter("sortrating.txt"); 
                bw = new BufferedWriter(fw);
                for(details d:books){
        
                bw.write(d.toString());
                }
                fw.close();
                    System.out.println("Succesfully written(sortrating) to the file: " );           
                }catch(Exception e){
                    e.printStackTrace();}
        
                
         }
            

    }

            private static List<details> readdataFromCSV(String fileName)throws Exception {
                 List<details> books = new ArrayList<>();
                 
                 
        FileReader fr=new FileReader(fileName);    
        BufferedReader br=new BufferedReader(fr);
        String line;
        try{
                 while((line=br.readLine())!=null){
                    if (!line.isEmpty()) {
        
                          String[] attributes=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                    details book = createdata(attributes);
                     books.add(book);
                     line = br.readLine(); 
                    }
                }
                 } catch (IOException ioe) { ioe.printStackTrace();


                    
             } 
             
            br.close();    
            fr.close();


            
                 return books;
         }





            private static details createdata(String[] metadata) {
                 String pid = metadata[0]; 
                 String product_name = metadata[1];
                 
                 String brand = null;
            
                 if(metadata[2]=="")
                 brand=null;
                 else
                 brand=metadata[2];  
               
                 String product_url = metadata[3];
                 int retail_price=0;
                 int discounted_price=0;
                 try{
                  retail_price = Integer.parseInt(metadata[4]); 
                  
                  discounted_price = Integer.parseInt(metadata[5]); 
                 }catch(NumberFormatException e){}


                 
                 float rating =0;

                 
         try{   
            if(metadata[6].equals("No rating available"))
             rating  = 0;
            else        
            {    
                rating  =  Float.parseFloat(metadata[6]);;
            }
        }catch(NumberFormatException ex){}
            
        

         return new details(pid,product_name,brand,product_url,retail_price,discounted_price,rating);

            
                
    }
}






