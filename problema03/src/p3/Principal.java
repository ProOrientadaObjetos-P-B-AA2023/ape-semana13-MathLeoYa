package p3;

import p1.*;
import p2.TipoMatricula;

import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> matricula= new ArrayList<>();
        matricula.add(new MatriculaCampamento(50,20,10));
        matricula.add(new MatriculaColegio(100,10,75,10));
        matricula.add( new MatriculaEscuela(50,25,10,60));
        matricula.add (new MatriculaJardin(50,90,100));
        matricula.add(new MatriculaMaternal(50,75,150));
        matricula.add(new MatriculaMaternal(50,75,150));
        for (Matricula matriculas: matricula){
            matriculas.establecerTarifa();
        }
        TipoMatricula tipoMatricula= new TipoMatricula(matricula);
        for (Matricula matriculas: matricula)
            System.out.println(matriculas);
        System.out.printf("Tarifas: %s\n", tipoMatricula.establecerPromedioTarifas());
    }
}
