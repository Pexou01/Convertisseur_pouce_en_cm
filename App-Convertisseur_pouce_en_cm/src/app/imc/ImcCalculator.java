package app.imc;

/**
 *
 * @author Administrateur
 */
public  class ImcCalculator {

    

    private double poids;
    private double taille;
    private Double imc;

    public ImcCalculator(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
        //Calcul de l'imc à l'instanciation de l'objet
        calculateImc();
    }//fin de constructeur


    public double getPoids() {
        return poids;
    }//fin méthode getPoids

// les méthode set permet de modifier la valeur de la méthode
    public void setPoids(double poids) {
        this.poids = poids;
        //si le poid change faut  recalculer l'imc
        calculateImc();
    }//fin méthode setPoids

    public double getTaille() {
        return taille;
    }//fin méthode getTaille

    public void setTaille(double taille) {
        this.taille = taille;
        //si le taille change faut  recalculer l'imc
        calculateImc();
    }//fin méthode setTaille

    public double getImc() {
        return imc;
    }//fin méthode getImc

    void calculateImc() {
        imc = poids / (taille * taille);
    }//fin méthode calculateImc
public String traduireIMC(){
    String message;
    if(imc < 16.5){
        message = " anaurexique";
    } else if (imc >16.5 && imc < 18.5){
        message = " maigre";
    }else if (imc > 18.5 && imc < 25){
        message = " corpulence normale";
    }else if (imc > 25 && imc < 30){
        message = "surpoids";
    }else if (imc > 30 && imc < 35){
        message = " obésité";
            }else if ( imc > 35 && imc < 40){
                message = "obésité sévère";
            }else{
             message = "obèsité morbide" ;
}
    return message;
}
}//fin class
