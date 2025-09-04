import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class N1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("단어의 개수 n을 입력하세요");
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i =0; i<n; i++){
            String word = br.readLine();
            if(isGroupWord(word)){
                count ++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {

        //모두 false로 초기화
        boolean seen []= new boolean[26];
        //이전 문자 없음
        int prevChar = -1;
        for (int i = 0; i < word.length(); i++) {
            //문자열 word의 i+1 번째 글자 가져옴
            int currentChar = word.charAt(i);
            //이전 문자와 현재 문자가 다를때 - 문자 그룹이 바뀜, 새로 시작된 문자가 과거에 등장한 적 있는지 확인하기
            if (prevChar != currentChar){
                //현재 문자가 처음 나오는 경우
                if(seen[currentChar-'a'] == false){
                    // seen 업데이트
                    seen[currentChar-'a'] = true;
                    prevChar = currentChar;
                }
                //이미 등장했던 문자라면 그룹단어 아님
                else{
                    return false;
                }

            }

        }
        return true;
    }

}
