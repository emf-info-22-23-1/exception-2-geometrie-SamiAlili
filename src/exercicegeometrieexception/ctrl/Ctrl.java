package exercicegeometrieexception.ctrl;

import exercicegeometrieexception.ihm.IIhmCtrl;
import exercicegeometrieexception.wrk.IWrkCtrl;

public class Ctrl implements ICtrlIhm {

    private IIhmCtrl refIhm;
    private IWrkCtrl refWorker;

    public void demarrer() {
        refIhm.demarrer();
    }

    @Override
    public void selectCalcRadius(String value) {

        try {
            refIhm.afficheMessage("");
            double valueDouble = Double.parseDouble(value);
            refIhm.afficheResultatCircle(String.valueOf(refWorker.calcRadiusCircleFromArea(valueDouble)));
        } catch (NumberFormatException nEx) {
            refIhm.afficheMessage("Veuillez entrer un valeur valide pour l'aire du cercle (" + value + " invalide)");
        }

    }

    @Override
    public void selectCalcLargeur(String valueArea, String valueLongueur) {
        boolean areaValide = false;
        try {
            refIhm.afficheMessage("");
            double valueAreaDouble = Double.parseDouble(valueArea);
            areaValide = true;
            double valueLongueurDouble = Double.parseDouble(valueLongueur);
            refIhm.afficheResultatRectangle(String.valueOf(refWorker.calcLargeurFromRectangle(valueAreaDouble, valueLongueurDouble)));
        } catch (NumberFormatException nEx) {
            if (areaValide) {
                refIhm.afficheMessage("Veuillez entrer une valeur valide pour la longueur du rectange (" + valueLongueur + " invalide)");
            } else {
                refIhm.afficheMessage("Veuillez entrer une valeur valide pour l'aire du rectangle (" + valueArea + " invalide)");
            }
        } catch (ArithmeticException arEx) {
            refIhm.afficheMessage("Un problème est survenu : 'division par 0'");
        }

    }

    public void setRefIhm(IIhmCtrl refIhm) {
        this.refIhm = refIhm;
    }

    public void setRefWorker(IWrkCtrl refWorker) {
        this.refWorker = refWorker;
    }

}
