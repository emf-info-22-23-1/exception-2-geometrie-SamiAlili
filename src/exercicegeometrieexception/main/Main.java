package exercicegeometrieexception.main;

import exercicegeometrieexception.ihm.*;
import exercicegeometrieexception.ctrl.*;
import exercicegeometrieexception.wrk.*;

public class Main {

    public static void main( String[] args ) {
        Ctrl ctrl = new Ctrl();
        Ihm ihm = new Ihm();
        Wrk wrk = new Wrk();

        ctrl.setRefIhm( ihm );
        ctrl.setRefWorker( wrk );

        ihm.setRefCtrl( ctrl );

        ctrl.demarrer();
    }

}
