/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sae.pkg204;
import sae.pkg204.Vue.fenetre;
import java.io.File;
import java.sql.*;  
import java.sql.SQLException;
import static javax.management.remote.JMXConnectorFactory.connect;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.jdbc.JDBCPieDataset;

/**
 *
 * @author p2101068
 */
public class SAE204 {

public static void main( String[ ] args )throws Exception {
      
      
      /* Create MySQL Database Connection */
      
      
      
      

//      
//
//      
//      Camenbert Pie = new Camenbert("select count(p.genre),p.genre as \"Genre\" from Professeurs p\n" +"group by genre;");
//      Pie.CreatePie("genre", "count(p.genre)", "Groupes");

//      Courbe C = new Courbe("select *,count(idSeance) as NbSalleUtiliser from Seances\n" +"natural join Utilise\n" +"group by idSalle");


//      TimeSeriesChart T = new TimeSeriesChart("select *,count(idSeance) as NbSalleUtiliser from Seances\n" +"natural join Utilise\n" +"group by idSalle");
//      T.CreateTimeSeries();
//      
//      C.CreateCourbe( "idSalle","NbSalleUtiliser", "Salles", 100);
//      

   

    fenetre fen = new fenetre();
    fen.setVisible(true);
   }
}
    








