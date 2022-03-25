public class SubSystem01 {
    String name;
    float age;
    float height;

    public SubSystem01(String name, float age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    String getSubSystem01(){
        System.out.println(name + " " + age + " " + height);
        return null;
    }

}
