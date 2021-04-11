
package taller_7;

import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Datos_vehiculo extends Interfaz {
    public static String EliminarNotaciónCientifica(double Número) {
       return new DecimalFormat("#.####################################").format(Número);
   }

    public Datos_vehiculo() {
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getActionCommand().equalsIgnoreCase("Hylux")){
                t1.setText("Hylux");
        }
        if(ae.getActionCommand().equalsIgnoreCase("Corolla")){
                t1.setText("Corolla");
        }
        if(ae.getActionCommand().equalsIgnoreCase("2021")){
                t2.setText("2021");
        }
        if(ae.getActionCommand().equalsIgnoreCase("2015")){
                t2.setText("2015");
        }
        if(ae.getActionCommand().equalsIgnoreCase("Escape")){
                t1.setText("Escape Ecoboost");
        }
        if(ae.getActionCommand().equalsIgnoreCase("Fusion")){
                t1.setText("Fusion");
        }
        if(ae.getActionCommand().equalsIgnoreCase("2016")){
                t2.setText("2016");
        }
        if(ae.getActionCommand().equalsIgnoreCase("2017")){
                t2.setText("2017");
        }
        if(ae.getActionCommand().equalsIgnoreCase("2018")){
                t2.setText("2018");
        }
        if(ae.getActionCommand().equalsIgnoreCase("2019")){
                t2.setText("2019");
        }
        if(ae.getActionCommand().equalsIgnoreCase("2020")){
                t2.setText("2020");
        }
        if(ae.getActionCommand().equalsIgnoreCase("Toyota")){
                t4.setText("TOYOTA");
        }
        if(ae.getActionCommand().equalsIgnoreCase("Ford")){
                t4.setText("FORD");
        }
        if(t1.getText().equalsIgnoreCase("Corolla") && t2.getText().equalsIgnoreCase("2021")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("132000000");
        }
        if(t1.getText().equalsIgnoreCase("Corolla") && t2.getText().equalsIgnoreCase("2020")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("81900000");
        }
        if(t1.getText().equalsIgnoreCase("Corolla") && t2.getText().equalsIgnoreCase("2019")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("68500000");
        }
        if(t1.getText().equalsIgnoreCase("Corolla") && t2.getText().equalsIgnoreCase("2018")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("51000000");
        }
        if(t1.getText().equalsIgnoreCase("Corolla") && t2.getText().equalsIgnoreCase("2017")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("589000000");
        }
        if(t1.getText().equalsIgnoreCase("Corolla") && t2.getText().equalsIgnoreCase("2016")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("51500000");
        }
        if(t1.getText().equalsIgnoreCase("Corolla") && t2.getText().equalsIgnoreCase("2015")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("49900000");
        }
        if(t1.getText().equalsIgnoreCase("Hylux") && t2.getText().equalsIgnoreCase("2021")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("146000000");
        }
        if(t1.getText().equalsIgnoreCase("Hylux") && t2.getText().equalsIgnoreCase("2020")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("135000000");
        }
        if(t1.getText().equalsIgnoreCase("Hylux") && t2.getText().equalsIgnoreCase("2019")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("186200000");
        }
        if(t1.getText().equalsIgnoreCase("Hylux") && t2.getText().equalsIgnoreCase("2018")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("120900000");
        }
        if(t1.getText().equalsIgnoreCase("Hylux") && t2.getText().equalsIgnoreCase("2017")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("114000000");
        }
        if(t1.getText().equalsIgnoreCase("Hylux") && t2.getText().equalsIgnoreCase("2016")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("105000000");
        }
        if(t1.getText().equalsIgnoreCase("Hylux") && t2.getText().equalsIgnoreCase("2015")&& t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("88000000");
        }
        if(t1.getText().equalsIgnoreCase("Escape Ecoboost") && t2.getText().equalsIgnoreCase("2021")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("134990000");
        }
        if(t1.getText().equalsIgnoreCase("Escape Ecoboost") && t2.getText().equalsIgnoreCase("2020")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("114990000");
        }
        if(t1.getText().equalsIgnoreCase("Escape Ecoboost") && t2.getText().equalsIgnoreCase("2019")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("95000000");
        }
        if(t1.getText().equalsIgnoreCase("Escape Ecoboost") && t2.getText().equalsIgnoreCase("2018")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("89200000");
        }
        if(t1.getText().equalsIgnoreCase("Escape Ecoboost") && t2.getText().equalsIgnoreCase("2017")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("69900000");
        }
        if(t1.getText().equalsIgnoreCase("Escape Ecoboost") && t2.getText().equalsIgnoreCase("2016")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("67990000");
        }
        if(t1.getText().equalsIgnoreCase("Escape Ecoboost") && t2.getText().equalsIgnoreCase("2015")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("57000000");
        }
        if(t1.getText().equalsIgnoreCase("Fusion") && t2.getText().equalsIgnoreCase("2021")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("160000000");
        }
        if(t1.getText().equalsIgnoreCase("Fusion") && t2.getText().equalsIgnoreCase("2020")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("126990000");
        }
        if(t1.getText().equalsIgnoreCase("Fusion") && t2.getText().equalsIgnoreCase("2019")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("105990000");
        }
        if(t1.getText().equalsIgnoreCase("Fusion") && t2.getText().equalsIgnoreCase("2018")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("76900000");
        }
        if(t1.getText().equalsIgnoreCase("Fusion") && t2.getText().equalsIgnoreCase("2017")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("70000000");
        }
        if(t1.getText().equalsIgnoreCase("Fusion") && t2.getText().equalsIgnoreCase("2016")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("58900000");
        }
        if(t1.getText().equalsIgnoreCase("Fusion") && t2.getText().equalsIgnoreCase("2015")&& t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("55990000");
        }
        if(t1.getText().equalsIgnoreCase("Hylux")&& t4.getText().equalsIgnoreCase("Ford")|| t1.getText().equalsIgnoreCase("Corolla") && t4.getText().equalsIgnoreCase("Ford")){
            t3.setText("El vahiculo no existe");
        }
        if(t1.getText().equalsIgnoreCase("Escape EcoBoost")&& t4.getText().equalsIgnoreCase("Toyota")|| t1.getText().equalsIgnoreCase("Fusion") && t4.getText().equalsIgnoreCase("Toyota")){
            t3.setText("El vahiculo no existe");
        }
       
        if(ae.getActionCommand().equalsIgnoreCase("Nuevo Vehiculo")){
                t4.setText(null);
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t5.setText(null);
        }
        
        if(c1.isSelected()){
        double porce = 0;
        try{
        porce= Double.parseDouble(t3.getText())*0.05;
        }catch(Exception errorMain){
            t5.setText("no hay vehiculo");
            t6.setText("no hay vehiculo");
        }      
        double porcentaje;
        t6.setText(EliminarNotaciónCientifica(porce));
        porcentaje= Double.parseDouble(t3.getText())-porce;
        String c=EliminarNotaciónCientifica(porcentaje);
        t5.setText(c); 
        }else{t6.setText(null);}
        if(c3.isSelected()){
        double porcen = 0;
        try{
        porcen= Double.parseDouble(t3.getText())*0.08;
        }catch(Exception errorMain){
            t5.setText("no hay vehiculo");
            t8.setText("no hay vehiculo");
        }      
        t8.setText(EliminarNotaciónCientifica(porcen));
        double porcentaj1;
        porcentaj1= Double.parseDouble(t3.getText())-porcen;
        String h=EliminarNotaciónCientifica(porcentaj1);
        t5.setText(h); 
        }else{t8.setText(null);}
        if(c2.isSelected()){
        double porcen1 = 0;
        try{
        porcen1= Double.parseDouble(t3.getText())-100000;
        }catch(Exception errorMain){
            t5.setText("no hay vehiculo");
            t7.setText("no hay vehiculo");
        }      
        if (porcen1==0){
            t7.setText("0");
        }else{
        t7.setText("100000");
        }
        String h=EliminarNotaciónCientifica(porcen1);
        t5.setText(h); 
        }else{t7.setText(null);}
        if(c2.isSelected() && c1.isSelected() && c3.isSelected()){
        double porce2 = 0;
        try{
        porce2= Double.parseDouble(t3.getText())*0.05;
        }catch(Exception errorMain){
            t5.setText("no hay vehiculo");
            t6.setText("no hay vehiculo");
            t7.setText("no hay vehiculo");
            t8.setText("no hay vehiculo");
        }      
        t6.setText(EliminarNotaciónCientifica(porce2));
        double porcentaje;
        porcentaje= Double.parseDouble(t3.getText())-porce2;
        double por2;
        por2=porcentaje-100000;
        t7.setText("100000");
        double porcent1;
        porcent1=por2*0.08;
        t8.setText(EliminarNotaciónCientifica(porcent1));
        double total;
        total=por2-porcent1;
        String d=EliminarNotaciónCientifica(total);
        t5.setText(d); 
        }
        if(c2.isSelected() && c1.isSelected()){
        double porce2 = 0;
        try{
        porce2= Double.parseDouble(t3.getText())*0.05;
        }catch(Exception errorMain){
            t5.setText("no hay vehiculo");
            t6.setText("no hay vehiculo");
            t7.setText("no hay vehiculo");
        }      
        t6.setText(EliminarNotaciónCientifica(porce2));
        double porcentaje;
        porcentaje= Double.parseDouble(t3.getText())-porce2;
        double por2;
        por2=porcentaje-100000;
        t7.setText("100000");
        String d=EliminarNotaciónCientifica(por2);
        t5.setText(d); 
        }
        if(c1.isSelected() && c3.isSelected()){
        double porce2 = 0;
        try{
        porce2= Double.parseDouble(t3.getText())*0.05;
        }catch(Exception errorMain){
            t5.setText("no hay vehiculo");
            t6.setText("no hay vehiculo");
            t8.setText("no hay vehiculo");
        }      
        t6.setText(EliminarNotaciónCientifica(porce2));
        double porcentaje;
        porcentaje= Double.parseDouble(t3.getText())-porce2;
        double porcent1;
        porcent1=porcentaje*0.08;
        t8.setText(EliminarNotaciónCientifica(porcent1));
        double total;
        total=porcentaje-porcent1;
        String d=EliminarNotaciónCientifica(total);
        t5.setText(d); 
        }
        if(c2.isSelected() && c3.isSelected()){
        double porce2 = 0;
        try{
        porce2= Double.parseDouble(t3.getText())-100000;
        }catch(Exception errorMain){
            t5.setText("no hay vehiculo");
            t8.setText("no hay vehiculo");
            t7.setText("no hay vehiculo");
        }      
        t7.setText("100000");
        double porcent1;
        porcent1=porce2*0.08;
        t8.setText(EliminarNotaciónCientifica(porcent1));
        double total;
        total=porce2-porcent1;
        String d=EliminarNotaciónCientifica(total);
        t5.setText(d); 
        }
        }
    
}
