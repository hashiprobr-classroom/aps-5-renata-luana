package br.edu.insper.desagil.pi.tocha;

public class FiltroSobelY extends Filtro {
    @Override
    public double[][] getKernel() {
        return new double[][] {
                { -1, -2, -1 },
                { 0, 0, 0 },
                { 1, 2, 1 }
        };
    }
}
