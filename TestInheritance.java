class Animal{
void eat(){
System.out.println("eating");
}
}
class Cat extends Animal{
void meow(){
System.out.println("meowing");
}
}
class TestInheritance{
public static void main(String[] args){
Cat c=new Cat();
c.meow();
c.eat();
}
}
