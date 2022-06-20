import java.util.*;
public class ACMhotel {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] str=new String[x];
        int t=0;
        for (int i = 0; i < x; i++) {
            int h = sc.nextInt(); //층
            int w = sc.nextInt(); //층에 있는 방 개수
            int n = sc.nextInt();
            for(int j=1;j<=w;j++){
                for(int k=1;k<=h;k++){
                    n--;
                    if(n==0){
                        if(j<=10&&k>=10)
                            str[t]=k+"0"+j;
                        else if(j>=10&&k<=10)
                            str[t]=k+""+j;
                        else if(j>=10&&k>=10)
                            str[t]=k+""+j;
                        else
                            str[t]=k+"0"+j;
                       t++;
                    }
                }
            }
        }
        for(int a=0;a<x;a++){
            System.out.println(str[a]);
        }
        sc.close();
        return;
    }

    public static void main(String[] args){
        ACMhotel acMhotel=new ACMhotel();
        acMhotel.run();
    }
}
