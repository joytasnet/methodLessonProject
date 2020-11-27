import java.util.*;
public class takedaAns{
	public static void main(String[] args){
		System.out.println("どうする？ 1...円状に配置する 0...直線状に配置する>");
		int form=new Scanner(System.in).nextInt();
		System.out.print("盆栽の数を入力してください>");
		int bonsaiNum=new Scanner(System.in).nextInt();

		String shape="円状";
		if(circleOrLine(bonsaiNum,form)==true){
			System.out.printf("%sに%d個配置する時、必要な苔玉は%d個です。",shape,bonsaiNum,bonsaiNum);
		}else {
			System.out.printf("%sに%d個配置する時、必要な苔玉は%d個です。",shape,bonsaiNum,bonsaiNum-1);
		}
	}
	static boolean circleOrLine(int bonsaiNum,int isRound){
		boolean form=true;
		if(isRound==0){
			form=false;
		}
		return form;
	}
}
