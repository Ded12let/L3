public class Main {
    public static void main(String[] args) {
        try {
            // Выводим содержимое таблицы users в консоль
            DB.printUsersTable();
        } catch (Exception e) {
            System.err.println("Ошибка при запуске программы:");
            e.printStackTrace();
        }
    }
}