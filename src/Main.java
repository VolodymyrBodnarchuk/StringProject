public class Main {
    public static void main(String[] args) {

        String myFullName = "Bodnarchuk Volodymyr Myronovych";
        StringBuilder myIntials = new StringBuilder();
        int length = myFullName.length();

        for(int i = 0; i< length;i++){
            if(Character.isUpperCase(myFullName.charAt(i))){
                myIntials.append(myFullName.charAt(i));
            }

        }
        System.out.println("My initials are: " + myIntials);



        String str1 = "Parliament";
        String str2 = "Partial men";

        System.out.println();
        System.out.println("Frits string: " + str1 + " Second string: " + str2);
        if(Anagram.areAnagram(str1,str2)){
            System.out.println("They are ANAGRAMS!");
        } else {
            System.out.println("They are NOT ANAGRAMS!");
        }

    }
}