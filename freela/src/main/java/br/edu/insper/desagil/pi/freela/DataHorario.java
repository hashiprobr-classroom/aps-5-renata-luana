package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {
    private int hora;
    private int minuto;
    private Data data;

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public DataHorario(Data data) {
        this.data = data;
        this.hora = 0;
        this.minuto = 0;
    }

    public void atualiza(int h, int m){
        hora = ajusta(h, 0, 23);
        minuto = ajusta(m, 0, 59);
    }
    @Override
    public int minutos() {
        int r = hora*60;
        r += minuto;
        r += data.minutos();
        return r;
    }
}
