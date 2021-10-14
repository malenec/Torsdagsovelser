package com.company;

public class Controller {
Dialog dialog;
CalculateVAT calculateVat;
View view;

    public Controller(){
        dialog = new Dialog();
        calculateVat = new CalculateVAT();
        view = new View();
    }

    public void runController() {
        double userIn = dialog.doDiag();
        double moms = calculateVat.doVAT(userIn);
        View.doView(moms);
    }
}
