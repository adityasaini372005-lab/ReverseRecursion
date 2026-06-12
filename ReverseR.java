public class ReverseR {
    static String reverse(String str){
        if(str==""){
            return "";
        }
        String result= reverse(str.substring(1));
        result+=str.charAt(0);
        return result;
    }
    static String replace(String str, char toReplace, char replacewith){
        if(str==""){
            return str;
        }
       String result =replace(str.substring(1), toReplace,replacewith);
       if(str.charAt(0)==toReplace){
        result=replacewith+result;
       }else{
        result=str.charAt(0)+result;
       }
       return result;
    }

    static String remove(String str ,char removeWith ){
        if(str==""){
            return str;
        }
        String result=remove(str.substring(1),  removeWith);
        if(str.charAt(0)==removeWith){
            result=""+result;
         } else{
            result=str.charAt(0)+result;
         }
         return result;
    }
    public static void main(String[] args) {
        String str ="HELLO";
        System.out.println(reverse(str));
       String result= replace(str, 'L','X');
       System.out.println(result);

       String result = remove(str,'L');
       System.out.println(result);
    }
    
}
