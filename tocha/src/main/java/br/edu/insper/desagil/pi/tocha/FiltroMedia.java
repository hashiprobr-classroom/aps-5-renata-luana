package br.edu.insper.desagil.pi.tocha;

public class FiltroMedia extends Filtro{
    @Override
    public double[][] getKernel() {
        return new double[][] {
                { 0.111111, 0.111111, 0.111111 },
                { 0.111111, 0.111111, 0.111111 },
                { 0.111111, 0.111111, 0.111111 }
        };
    }
}
