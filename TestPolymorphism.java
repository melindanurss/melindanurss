public class TestPolymorphism {
    
    public static void main(String[] args){
        Kotak persegi = new Kotak();
        persegi.setcolor("Blue");
        ObjekGeometri bentukSem = new ObjekGeometri();
        bentukSem.setColor("Black");
        
        displayObject(persegi);
        displayObject(new Lingkaran());
        displayObject(bentukSem);
    }
    public static void displayObject(ObjectGeometri obj){
        System.out.println(obj.getColor());
    }
}
