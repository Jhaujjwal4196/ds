import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class StudentInfo{
     String name,fatherName, id;
     
     StudentInfo(String name, String id, String fatherName){
         this.name=name;
         this.id=id;
         this.fatherName=fatherName;
     }
    public void setName(String name){
         this.name=name;
     }
     public void setId(String id) {
         this.id=id;
     }
     public void setFatherName(String fatherName){
         this.fatherName=fatherName;
     }
     public String getName(){
         return name;
     }
     public String getId(){
         return id;
     }
     public String getFatherName(){
         return fatherName;
     }
    
}
class Address extends StudentInfo{
     String currAdrress, prevAddress, emailId, contactNo;
Address(String name, String id, String fatherName, String currAddress, String prevAddress,String contactNo,String emailId){
    super(name,id,fatherName);
    this.currAdrress = currAddress;
    this.prevAddress = prevAddress;
    this.contactNo = contactNo;
    this.emailId = emailId;
}
public void setCurrAdrress(String currAdrress){
    this.currAdrress=currAdrress;
}
public void setPrevAddress(String prevAddress){
    this.prevAddress=prevAddress;
}
public void setContactNo(String contactNo){
    this.contactNo=contactNo;
}
public void setEmailId(String emailId){
    this.emailId=emailId;
}
public String getCurrentAdrress(){
return currAdrress;}
public String getPrevAddress()
{
    return prevAddress;
}
public String getEmailId(){
    return emailId;
}
public String getContactNo(){
    return contactNo;
}
}
public class StudentDetails{

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s, str;
        BufferedWriter bfw = new BufferedWriter(new FileWriter("output.txt"));
        BufferedReader bfr= new BufferedReader(new FileReader("Output.txt"));
        System.out.println("please provide us the number of students you wanna add to the form:");
        int n= sc.nextInt();
        sc.nextLine();
        Address [] details= new Address[n+1];
        System.out.println("let's fetch out the details of student now:");
        for(int i=0;i<n;i++){
            System.out.println("Please Provide the detais of dtudent no>  "+" "+ ++i);
            System.out.println("provide us the name");
            String name = sc.nextLine();
            System.out.println("Enter registration number : ");
            String id = sc.nextLine();
            System.out.println("Enter father's name : ");
            String fatherName = sc.nextLine();
            System.out.println("Enter current address : ");
            String currAddress = sc.nextLine();
            System.out.println("Enter permamanent address : ");
            String prevAddress = sc.nextLine();
            System.out.println("Enter contact number : ");
            String contactNo = sc.nextLine();
            System.out.println("Enter email id : ");
            String emailId = sc.nextLine();
            details[i] = new Address(name, id, fatherName, currAddress, prevAddress, contactNo, emailId);
        }
        for(int i=0;i<n;i++){
            bfw.write("Contact No"+details[i].getContactNo()+"\n");
            bfw.write("Current Address"+details[i].getCurrentAdrress()+"\n");
            bfw.write("Email Id"+details[i].getEmailId()+"\n");
            bfw.write("Name:"+details[i].getName()+"\n");
            bfw.write("Previous Address:"+details[i].getPrevAddress()+"\n");
            bfw.write("Fathers name:"+details[i].getFatherName()+"\n");
            bfw.write("Id:"+details[i].getId()+"\n");
            bfw.write("end"+"\n");

        }
        bfw.close();
        System.out.println("Please provide the registration number of the students you wanna serach for:");
        int id= sc.nextInt();
        boolean flag= false;
        while((s=bfr.readLine())!=null){
            if(s.substring(5,13).equals(id)){
                System.out.println("The dtails of the student are:\n");
                System.out.println(s);
                while(!(str=bfr.readLine()).equals("end"))
                System.out.println(str);
            
             flag =true;
           break;}
        
        else{
            for(int j=0;j<7;j++)
            bfr.readLine();
        }

    }}}

