import java.sql.SQLOutput;

public class Printer {
    private static int count = 0; // общее количество страниц на печать
    private static String queue = ""; //список документов на печать
    private static int printedPagesCount = 0;//количество напечатанных страниц

    public void append(String docText, String title, int pagesCount) {
        if (!docText.isEmpty()) {
            queue = queue + "\n" + title + " - " + pagesCount + " страниц";
        } else {System.out.println("Документ пуст");}
        count = count + pagesCount;
    }

    public void append(String docText, String title) {append(docText, title, 15);}

    public void append(String docText) {append(docText, "неизвестный", 39);}

    public void clear() {
        queue = null;
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("Нет документов для печати");
        } else {
            System.out.println(queue);
        }

        clear();

    }

    public int getPendingPagesCount() {
        return count;
    }

   /* public int getPrintedPagesCount() {
        return
    }
    */




    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("текст1", "Белая", 46);
        printer.append("текст2", "Ворона", 13);
        printer.append("текст3", "Ууууу");
        System.out.println("Количество страниц для печати " + printer.getPendingPagesCount());
        printer.print();

    }

}
