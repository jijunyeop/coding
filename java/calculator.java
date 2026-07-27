public class calculator {
    int[] num = new int[3];
    int[] kor = new int[3];
    int[] eng = new int[3];
    int[] math = new int[3];
    int[] sum = new int[3];
    double[] avr = new double[3];
    int[] rank = new int[3];
    String[] name = new String[3];
    double tmp;
    int tmp2;
    String tmp3;
    public void sum(){
        for(int i=0;i<3;i++){
            sum[i]=kor[i]+eng[i]+math[i];
        }
    }
    public void avr(){
        for(int i=0;i<3;i++){
            avr[i]=sum[i]/3.00;
        }
    }
    public void rank(){
        for(int i=0;i<3;i++){
            rank[i]=1;
            for(int e=0;e<3;e++){
                if(avr[i]<avr[e]){
                    rank[i]+=1;
                }
            }
        }
    }
    public void array(){
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                if(num[i]<num[j]){
                    tmp2=num[j];
                    num[j]=num[i];
                    num[i]=tmp2;

                    tmp3=name[j];
                    name[j]=name[i];
                    name[i]=tmp3;

                    tmp2=kor[j];
                    kor[j]=kor[i];
                    kor[i]=tmp2;

                    tmp2=eng[j];
                    eng[j]=eng[i];
                    eng[i]=tmp2;

                    tmp2=math[j];
                    math[j]=math[i];
                    math[i]=tmp2;

                    tmp2=sum[j];
                    sum[j]=sum[i];
                    sum[i]=tmp2;

                    tmp=avr[j];
                    avr[j]=avr[i];
                    avr[i]=tmp;

                    tmp2=rank[j];
                    rank[j]=rank[i];
                    rank[i]=tmp2;
                }
            }
        }
    }
}