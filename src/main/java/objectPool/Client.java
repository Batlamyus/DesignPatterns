package objectPool;

import javafx.scene.chart.PieChart;

public class Client {

    public static void main(String[] args) {
        Connection con1 = DataSource.getConnection();
        Connection con2 = DataSource.getConnection();
        Connection con3 = DataSource.getConnection();
        System.out.println("----------------------------");
        DataSource.release(con1);
        Connection con4 = DataSource.getConnection();
    }
}
