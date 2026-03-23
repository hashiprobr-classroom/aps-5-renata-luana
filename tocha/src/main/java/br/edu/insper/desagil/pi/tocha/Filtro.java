package br.edu.insper.desagil.pi.tocha;

public abstract class Filtro {

    public Imagem processa(Imagem imagem) {
            int[][] entrada = imagem.getPixels();

            int altura = entrada.length;
            if (altura < 3) {
                throw new IllegalStateException("altura pequena");
            }

            int largura = entrada[0].length;
            if (largura < 3) {
                throw new IllegalStateException("largura pequena");
            }

            int[][] saida = new int[altura - 2][largura - 2];

            double[][] kernel = getKernel();

            for (int y = 1; y < altura - 1; y++) {
                for (int x = 1; x < largura - 1; x++) {
                    double s = 0;
                    for (int dy = -1; dy < 2; dy++) {
                        for (int dx = -1; dx < 2; dx++) {
                            s += entrada[y + dy][x + dx] * kernel[dy + 1][dx + 1];
                        }
                    }
                    saida[y - 1][x - 1] = (int) s;
                }
            }

            return new Imagem(saida);
        }
    public abstract double[][] getKernel();
}
