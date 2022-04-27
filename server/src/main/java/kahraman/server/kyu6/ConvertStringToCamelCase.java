package kahraman.server.kyu6;

public class ConvertStringToCamelCase {

    public String toCamelCase(String s){

        char[] arr = s.toCharArray();

        for(int i = 1; i<arr.length; i++) {
            if(arr[i-1] == '-' || arr[i-1] == '_' ) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        String result = new String(arr);
        result = result.replace("-","");
        result = result.replace("_","");

        return result;
    }
}
