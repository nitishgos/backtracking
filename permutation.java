public class permutation {
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"=> "ab"+"de"="abde"
            String newstr=str.substring(0,i)+str.substring(i+1);
            permutation(newstr, ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str, "");
    }
}
