import java.util.Scanner;

public class TCai {

        public static void main(String[] args) {
            // write your code here
            int times;
            Scanner scanner=new Scanner(System.in);
            times =scanner.nextInt();
            for(int i=0;i<times;i++){
                GroupRightBall();
                System.out.println();
            }


        }
        public static void GroupRightBall(){
            int[] blueBall= new int[12];
            int[] redBall = new int[35];
            int[] rightBall = new int [7];


            for (int i = 0; i<12; i++){
                blueBall[i]=i+1;
            }
            for (int i=0;i<35;i++){
                redBall[i]=i+1;
            }
            int right =0;
            int pitch;
            while(right<5){
                pitch=(int) Math.ceil((Math.random()*35));
                while(redBall[pitch-1]==36){
                    pitch=(int) Math.ceil((Math.random()*35));
                }
                redBall[pitch-1]=36;


                rightBall[right]=pitch;
                right++;
            }
            while(right<7){
                pitch=(int) Math.ceil((Math.random()*12));
                while(blueBall[pitch-1]==13){
                    pitch=(int) Math.ceil((Math.random()*12));
                }
                blueBall[pitch-1]=13;


                rightBall[right]=pitch;
                right++;
            }
            for(int i=0;i<7;i++){
                if(rightBall[i]>10){
                    System.out.print(rightBall[i]+" ");
                }else {
                    System.out.print(" "+rightBall[i]+" ");
                }

            }
        }

}
