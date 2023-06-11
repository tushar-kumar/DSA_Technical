public class q12_replaceAdjEle {

    // 1st way
    static String replaceCharacter(String str){
        if(str.length()==0){
            return "";
        }
        String s=replaceCharacter(str.substring(1));
        if(s.length()>0 && s.charAt(0)==str.charAt(0)){
            s=s.charAt(0)+"#"+s.substring(1);
        }else{
            s=str.charAt(0)+s;
        }
        return s;
    }
    
    public static void main(String[] args) {
        String s="aabbcc";
        System.out.println(replaceCharacter(s));
        
    }
}
