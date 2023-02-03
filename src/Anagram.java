public class Anagram {

    public static boolean areAnagram(String one, String two){

        String work1 = removeSpaces(one);
        String work2 = removeSpaces(two);

        work1 = work1.toLowerCase();
        work2 = work2.toLowerCase();

        work1= sort(work1);
        work2 = sort(work2);

        return work1.equals(work2);
    }

    protected static String sort(String string){
        char[] content  = string.toCharArray();
        java.util.Arrays.sort((content));
        return new String(content);
    }

    protected static String removeSpaces(String string){

        int i, leng = string.length();
        StringBuilder dest = new StringBuilder(leng);
        char c;

        for(i =(leng - 1); i >= 0;i--){
            c = string.charAt(i);
            if(Character.isLetter(c)){
                dest.append(c);
            }
        }

        return dest.toString();
    }


}
