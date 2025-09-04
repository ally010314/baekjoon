import java.util.Scanner;
//크로아티아 알파벳
class N1542 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("알파벳을 입력하세요");
        String word = sc.nextLine();
        String [] array = word.split("");

        int count = 0;

        for(int i=0;i<array.length;i++){
            switch (array[i]) {
                case "c" -> {
                    if(i+1<array.length){
                        if (array[i + 1].equals("=") || array[i + 1].equals("-")) {
                            i++;
                        }
                        count++;
                    }

                }
                case "d" -> {
                    if(i+1<array.length){
                        if (array[i + 1].equals("z") && array[i + 2].equals("=")) {
                            i = i+2;
                        } else if (array[i + 1].equals("-")) {
                            i++;
                        }
                        count++;
                    }

                }
                case "l", "n" -> {
                    if(i+1<array.length){
                        if (array[i + 1].equals("j")) {
                            i++;
                        }
                        count++;

                    }

                }
                case "s" , "z"-> {
                    if(i+1<array.length){
                        if (array[i + 1].equals("=")) {
                            i++;
                        }
                        count++;
                    }

                }

                default-> count++;
            }
        }
        System.out.println(count);
    }

}
