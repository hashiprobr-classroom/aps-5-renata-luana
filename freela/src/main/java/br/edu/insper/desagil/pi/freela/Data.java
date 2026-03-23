package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia) {
        ano = ajusta(novoAno, 1970, 2070);
        mes = ajusta(novoMes, 1, 12);
        int dias = limite.get(mes);
        dia = ajusta(novoDia, 1, dias);
    }

    @Override
    public int minutos(){
        int r = 0;
        r += (dia-1)*24*60;
        for (int m : limite.keySet()) {
            int dias = limite.get(m);
            if (m < mes) {
                r += dias*24*60;
            }
        }
        int anos = ano - 1970;
        r += anos*365*24*60;
        return r;
    }
}
