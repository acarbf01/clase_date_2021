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

    public boolean isSameNew(Date fecha){

        return(isSameDayNew(day) && isSameMonthNew(month) && isSameYearNew(year));

    }
}