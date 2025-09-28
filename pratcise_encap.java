class Animal{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("Enter the positive number");
        }
        
    }

}





public class pratcise_encap {
    public static void main(String[] args){
        Animal a2 = new Animal();
        a2.setName("Cow");
        a2.setAge(34);
        // to print the values we use getter method
        System.out.println("The name of the animal is : "+a2.getName());
        System.out.println("The age of the animal is : "+a2.getAge());

    }


    
}
