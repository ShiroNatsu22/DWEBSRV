package Practica1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jgarcias on 21/09/16.
 */
public class Agenda {


    private int any;
    private List<Pagina> pagines = new ArrayList<>();
    private int paginaActual=0;

    public Agenda (){
        Scanner s = new Scanner(System.in);
        System.out.println("De quin any es l'agenda?");
        for (int i = 0; i < 9 ; i++) {

            Pagina p = new Pagina (1+i,9,false);
            pagines.add(p);
        }
        pagines.get(paginaActual);

    }
    void passaPagina( int pagina) {
        if(pagines.size() > paginaActual);
        paginaActual++;
    }

    void tornaPagina (int pagina){
        if(paginaActual >0){
            paginaActual--;
        }
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public List<Pagina> getPagines() {
        return pagines;
    }

    public void setPagines(List<Pagina> pagines) {
        this.pagines = pagines;
    }
}

class Pagina {
    private int dia;
    private int mes;
    private boolean festiu;
    private List<Cita> cita = new ArrayList<>();

    public Pagina(int d, int m, boolean fes){
        dia = d;
        mes = m;
        festiu = fes;
    }
    void escriureCita(String escriure){
        String horaI, horaF;


        Scanner s = new Scanner (System.in);
        System.out.println("hora inici");
        horaI=s.nextLine();
        System.out.println("Hora final cita");
        horaF=s.nextLine();
        System.out.println("inici "+ horaI +" final"+ horaF );

        Cita c = new Cita(horaI,horaF);

        c.writeContents();
        cita.add(c);
    }

    void esborraCita(){

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isFestiu() {
        return festiu;
    }

    public void setFestiu(boolean festiu) {
        this.festiu = festiu;
    }
}

class Cita{
    private String motiu;
    private String horaInici;
    private String horaFi;

    public Cita(String horaI,String horaF){
        this.horaInici = horaI;
        this.horaFi= horaF;
    }

    public void writeContents (){

        Scanner s = new Scanner (System.in);
        motiu =s.nextLine();

        System.out.println(motiu);
    }

    void motiu(String motiu){

}

    public String getMotiu() {
        return motiu;
    }

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }

    public String getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(String horaInici) {
        this.horaInici = horaInici;
    }

    public String getHoraFi() {
        return horaFi;
    }

    public void setHoraFi(String horaFi) {
        this.horaFi = horaFi;
    }
}