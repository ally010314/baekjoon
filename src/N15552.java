import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class N15552 {


    public static void main(String[] args) throws IOException {

        //system.in을 문자 단위로 바꾸고 버퍼를 둠 -> IO횟수의 감소
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("줄의 수 n을 입력하세요");

        //입력 스트림으로 한 줄을 읽어와서 int로 변환, br.readLine()은 IOException 발생새킴
        int n = Integer.parseInt(br.readLine());

        System.out.println("10 20과 같이 두 정수를 띄어쓰기로 구분하여 n줄 입력하세요");

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n");

        }
        bw.flush();
    }

}
