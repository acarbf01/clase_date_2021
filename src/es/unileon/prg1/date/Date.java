package es.unileon.prg1.date;

import javax.lang.model.util.ElementScanner6;

public class Date{

    private int day;
    private int month;
    private int year;
/**
	 * Constructor de la clase. Crea una fecha con los valores recibidos
	 * 
	 * @param day
     * @param month
     * @param year
	 *            valor del numero
	 * 
	 */
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
/**
	 * Constructor de la clase. Crea una fecha con valores 0
	 * 
	 */
    public Date(){
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }
/**
	 * Modifica el valor del dia
	 * 
	 * @return Valor del dia
	 */
    void setday(int nuevoday){
        this.day = nuevoday;
    }
    /**
	 * Modifica el valor del mes
	 * 
	 * @return Valor del mes
	 */

    void setmonth(int nuevomonth){
        this.month = nuevomonth;
    }
/**
	 * Modifica el valor del año
	 * 
	 * @return Valor del año
	 */
    void setyear(int nuevoyear){
        this.year = nuevoyear;
    }
/**
	 * Retorna el valor del dia
	 * 
	 * @return Valor del dia
	 */
    int getday(){
        return this.day;
    }
/**
	 * Retorna el valor del mes
	 * 
	 * @return Valor del mes
	 */
    int getmoth(){
        return this.month;
    }
/**
	 * Retorna el valor del año
	 * 
	 * @return Valor del año
	 */
    int getyear(){
        return this.year;
    }
/**
    *Compara si las 2 fechas tienen el mismo año 
    * 
    * @param year
    * @return True o False
    */
    public boolean isSameYear(int year){
        if(this.year==year)
        return true;
        else
        return false;
    }
/**
    *Compara si las 2 fechas tienen el mismo mes 
    * 
    * @param month
    * @return True o False
    */
    public boolean isSameMonth(int month){
        if(this.month == month)
        return true;
        else
        return false;
    }
/**
    *Compara si las 2 fechas tienen el mismo dia 
    * 
    * @param dia
    * @return True o False
    */
    public boolean isSameDay(int day){
        if(this.day == day)
        return true;
        else
        return false;
    }
/**
 * Compara las 2 fechas para saber si son identicas
 * 
 * @return True o False
 */
    public boolean isSame(){
        if((isSameDay(day)==true) && (isSameMonth(month)==true) && (isSameYear(year)==true))
        return true;
        else
        return false;
    }
/**
    *Compara si las 2 fechas tienen el mismo dia 
    * 
    * @param dia
    * @return True o False
    */
    public boolean isSameDayNew(int day){
        return(this.day == day);
    }
/**
    *Compara si las 2 fechas tienen el mismo mes 
    * 
    * @param month
    * @return True o False
    */
    public boolean isSameMonthNew(int month){
        return(this.month == month);
    }
/**
    *Compara si las 2 fechas tienen el mismo año 
    * 
    * @param year
    * @return True o False
    */

    public boolean isSameYearNew(int year){
        return(this.year == year);
    }
/**
 * Compara las 2 fechas para saber si son identicas
 * 
 * @return True o False
 */
    public boolean isSameNew(){

        return(isSameDayNew(day) && isSameMonthNew(month) && isSameYearNew(year));

    }
/**
 * Nos indica el nombre del mes segun el numero de este.
 * 
 * @return Nombre del mes
 */
    public String monthName(){
        StringBuffer mes = new StringBuffer();
        switch (this.month) {
            case 1:
                mes.append("Enero");
            case 2:
                mes.append("Febrero");
            case 3:
                mes.append("Marzo");
            case 4:
                mes.append("Mayo");
            case 5:
                mes.append("Mayo");
            case 6:
                mes.append("Junio");
            case 7:
                mes.append("Julio");
            case 8:
                mes.append("Agosto");
            case 9:
                mes.append("Septiembre");
            case 10:
                mes.append("Octubre");
            case 11:
                mes.append("Noviembre");
            case 12:
                mes.append("Diciembre");
            default:

                break;
        }
        return mes.toString();
    }

    public boolean checkDay(){
        switch (this.month) {
            case value:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(this.day > 31){
                    system.out.println("Error, es imposible que un mes tenga más de 31 dias.");
                    return false;}
                else
                    return true;
            
            case 2:
                if(this.day > 29 && (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0))){
                    System.out.println("Error, Febrero no puede tener más de 29 días");
                    return false;
                }
                else 
                    return true;
                if(this.day > 28)
                    return false;
                else
                    return true;
                default:
                if(this.day > 30){
                    system.out.println("Error, estes meses no pueden tener mas de 30 dias.");
                    return false;}
                    else
                    return true;
                
        }
    }

}