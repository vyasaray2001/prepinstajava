package GettingStarted;
class PrimenumberWithinRange{
  
    public static void main(String[] args) {
        int start=50,stop=90,flag=0;
        for(int i=start;i<=stop;i++){
            for(int j=2;j<i;j++){
                flag=0;
                if(i % j ==0){
                   flag=1;
                   //System.out.println(i+" "+j);
                   break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }
    }
}