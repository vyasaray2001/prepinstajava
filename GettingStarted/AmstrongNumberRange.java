package GettingStarted;

public class AmstrongNumberRange {
    public static void main(String[] args) {
        int start=1500,stop=2000,temp=0,res,order=4;
        for(int i=start;i<=stop;i++){
            temp=i;
            res=0;
            while(temp!=0){
                res+=Math.pow(temp%10, order);
                temp=temp/10;
            }
            if(res==i){
                System.out.println(i);
            }
        }
    }
}
