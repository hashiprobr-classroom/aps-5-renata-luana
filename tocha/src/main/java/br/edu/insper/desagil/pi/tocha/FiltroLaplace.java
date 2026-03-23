package br.edu.insper.desagil.pi.tocha;

public class FiltroLaplace extends Filtro {
    @Override
    public double[][] getKernel() {
        return new double[][] {
                { 0, -1, 0 },
                { -1, 4, -1 },
                { 0, -1, 0 }
        };
    }
}
