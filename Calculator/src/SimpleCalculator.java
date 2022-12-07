import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любые 3 слова через запятую: ");
        String phrase1 = sc.nextLine();
        String[] values = phrase1.split(",");
        int filter = 1;
        while (filter != 0) {
            System.out.println("Выберите фильтр: ");
             filter = sc.nextInt();
            switch (filter) {
                case 1: {
                    String longestPhrase = "";
                    for (String value : values) {
                        if (value.length() > longestPhrase.length()) {
                            longestPhrase = value;
                        }
                    }
                    System.out.println("Cлово с максимальной длиной: " + longestPhrase);
                    break;
                }

                case 2: {
                    System.out.println("Введите первую букву: ");
                    String letter = sc.next();
                    for (String value : values) {
                        if (value.startsWith(letter)) {
                            System.out.println("Слово с такой первой буквой:" + value);
                        } else {
                            System.out.println();
                        }
                    }


                    break;
                }
                case 3: {
                    System.out.println("Введите последнюю букву: ");
                    String lastLetter = sc.next();
                    for (String value : values) {
                        if (value.endsWith(lastLetter)) {
                            System.out.println("Слово с такой последней буквой:" + value);
                        }
                    }

                    break;
                }
                case 4: {
                    System.out.println("Введите часть слова: ");
                    String partOfString = sc.next();
                    for (String value : values) {
                        if (value.contains(partOfString)) {
                            System.out.println("Слово с такой частью:" + value);
                        }
                    }
                    break;

                }
            }
        }
    }
}





