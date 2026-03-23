package br.edu.insper.desagil.pi.tocha;

public class FiltroSobelX extends Filtro {
    @Override
    public double[][] getKernel() {
        return new double[][] {
                { -1, 0, 1 },
                { -2, 0, 2 },
                { -1, 0, 1 }
            };
        }
    }

