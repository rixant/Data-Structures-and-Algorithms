//Rishant Rokaha
//Professor Vohra
//Data Structures and Algorithms
//13 September 2020
//Assignment 1
public class VowelsBag {
    public static void main(String[] args){
        Bag<String> letters=new Bag<String>();

        letters.add("a");
        letters.add("a");
        letters.add("b");
        letters.add("b");
        letters.add("e");
        letters.add("f");
        letters.add("i");
        letters.add("i");
        letters.add("i");
        letters.add("k");
        letters.add("l");
        letters.add("z");
        letters.add("u");
        letters.add("r");
        letters.add("x");



        Bag<String> vowels=new Bag<String>();
        for (int i=letters.getCurrentSize();i>0;i--){
           String c= (String)letters.remove();
            if (c=="a" || c=="e" || c=="i" || c=="o" || c=="u" ){
                vowels.add(c);
            }
        }

        System.out.println("Total vowels= "+vowels.getCurrentSize());
        System.out.println("No. of. a= "+ vowels.getFrequencyOf("a"));
        System.out.println("No. of. e= "+ vowels.getFrequencyOf("e") );
        System.out.println("No. of. i= "+ vowels.getFrequencyOf("i"));
        System.out.println("No. of. o="+ vowels.getFrequencyOf("o"));
        System.out.println("No. of. u="+ vowels.getFrequencyOf("u"));

    }
}
