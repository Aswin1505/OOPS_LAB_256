class Person{
String name;
int age;
Person(String name,int age){
this.name=name;
this.age=age;}
void display(){
System.out.println("Name:"+name+", Age:"+age);
}
}
class Doctor extends Person{
String special;
Doctor(String name,int age,String special){
super(name,age);
this.special=special;
}
void display(){
super.display();
System.out.println("Special:"+special);
}
public static void main(String[]args){
Doctor d=new Doctor("Dr.Roa",18,"Love");
d.display();
}
}