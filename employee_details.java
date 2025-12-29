public class employee_details {
public static void main (String arg[]){
byte age =28;
int id=25256;
double increment = 1.5;
long salary = 100000L;
char grading = 'A';
boolean isRegular=true;
String fullName="Aswin";
int yearsWorked[]={2021,2021,2022,2023,2024,2025};
System.out.println("Empolyee:"+fullName);
System.out.println("Id :"+id);
System.out.println("Age: "+age);
System.out.println("Grade: "+grading);
System.out.println("Present salary :"+salary);
System.out.println("Regular to work :"+isRegular);
System.out.println("Started year of working :"+yearsWorked[0]);
double compensation = salary*increment ;
System.out.println("Compensation :"+compensation);
}
}