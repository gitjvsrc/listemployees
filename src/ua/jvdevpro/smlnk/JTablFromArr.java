package ua.jvdevpro.smlnk;


import javax.swing.*;
import java.awt.*;

// заполнение таблицы из массива, вывод на форму;

public class JTablFromArr {

    public static void main(String[] args) {


        // массив с названием столбцов таблицы;
        Object[] colmHead = {"Surname", "Name", "Middle_Name"};

        // массив с данными для таблицы;
        Object[][] arrData = {
                {"Иванов", "Иван", "Иванич"},
                {"Сидоров", "Сидор", "Сидорович"},
                {"Петров", "Петр", "Петрович"},
                {"Сергеев", "Сергей", "Сергеевич"},
                {"Александров", "Александр", "Александрович"},
                {"Владимиров","Владимир","Владимирович"},
                {"Гайдуков","Гайдар","Гайдарович"},
                {"Давидов","Давид","Давидич"},
                {"Житков","Жигло","Жиглович"},
                {"Климов","Клим","Климович"},
                {"Левшук","Левша","Левшович"},
                {"Мельник","Сергей","Владимирович"},
                {"Рабинович","Равин","Равинович"},
                {"Николайчук","Николай","Николаевич"},
                {"Грищук","Григорий","Григорович"},
                {"Мешков","Миша","Михайлович"}
        };

        // создание формы (JFrame);
        JFrame jfrm = new JFrame("Список работников");

        jfrm.getContentPane().setLayout(new FlowLayout()); // размещение данных;

        jfrm.setSize(400, 200); // размер окна;
        jfrm.setLocationRelativeTo(null); // вывод окна по средине экрана монитора;
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закритие окна(фрейма);

        JTable jtblFIO = new JTable(arrData, colmHead); // прорисовка таблицы на фрейме;
        JScrollPane scr = new JScrollPane(jtblFIO); // скролинг (пролистывание) таблицы на фрейме


        // размер прокручиваемой области;
        jtblFIO.setPreferredScrollableViewportSize(new Dimension(380,200));

        jfrm.getContentPane().add(scr); // добавление скролинга таблицы на фрейм;
        jfrm.setVisible(true); // показать окно;

    }

}
