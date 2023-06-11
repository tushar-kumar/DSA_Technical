public class q12_replaceAdjEle1 {

    static void replaceCharacter(String str,String newValue){
        if(str.length()==0){
            System.out.println(newValue);
            return;
        }
        char ch=str.charAt(0);
        if(newValue.length()>0 && newValue.charAt(newValue.length()-1)==ch){
            replaceCharacter(str.substring(1), newValue+"#");
        }else{
            replaceCharacter(str.substring(1), newValue+ch);
        } 
    }
    public static void main(String[] args) {
        String s="aabbcc";
        replaceCharacter(s,"");
                
    }
}
