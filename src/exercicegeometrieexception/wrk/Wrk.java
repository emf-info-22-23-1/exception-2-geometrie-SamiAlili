package exercicegeometrieexception.wrk;

public class Wrk implements IWrkCtrl {

    /**
     * Calcule le rayon d'un cercle en fonction de son aire.
     *
     * @param area Aire du cercle
     *
     * @return Le rayon
     */
    @Override
    public double calcRadiusCircleFromArea( double area ) {
        return Math.pow( area / Math.PI, 0.5 );
    }

    /**
     * Calcule le rayon d'un cercle en fonction de son périmètre.
     *
     * @param perimeter Périmètre du cercle
     *
     * @return Le rayon
     */
    public double calcRadiusCircleFromPerimeter( double perimeter ) {
        return perimeter / ( 2 * Math.PI );
    }

    /**
     * Calcule la largeur d'un rectangle en fonction de son aire et de sa longueur.
     *
     * @param area Aire totale du rectangle
     * @param x    Longueur du rectangle
     *
     * @return Largeur du rectangle
     *
     * @exception ArithmeticException En cas de division par 0
     */
    @Override
    public double calcLargeurFromRectangle( double area, double x ) throws ArithmeticException {
        if ( x == 0 ) {
            throw new ArithmeticException( "division par 0!" );
        }
        return area / x;
    }
}
