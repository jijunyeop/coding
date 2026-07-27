public class linprint {
    public void line(){
        System.out.println("----------------------------------------------");
    }
    public void line(int value){
        for(int i=0;i<=value;i++){
            System.out.printf("-");
        }
        System.out.printf("\n");
    }
}