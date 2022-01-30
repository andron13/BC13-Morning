public class Lesson46 {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy"));// → ""
        System.out.println("подсчитай количество bread => " + countBread("breadjambread"));

    }
    // A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
    // appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
    // Сэндвич - это два куска хлеба с чем-то средним. Вернуть строку, которая находится между первым и последним
    // появлением «bread» в данной строке, или вернуть пустую строку "", если двух кусков bread нет.
    // Решение!
    // - считаем количество bread
    // - находим что есть между "bread"

    public static String getSandwich(String str) {
        int breadStart = str.indexOf("bread");
        int breadEnd = str.lastIndexOf("bread");
        if (breadStart != -1 && breadEnd != -1 && breadStart != breadEnd) {
            return str.substring(breadStart + 5, breadEnd);
        }

        return "";
    }

    public static int countBread(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 4; i++) {
            String temp = str.substring(i, i + 5);
            //System.out.println(temp);
            if (temp.contains("bread")) {
                count++;
            }
        }
        return count;
    }

    public static String beteweenBread(String str) {


        return "555";
    }
}