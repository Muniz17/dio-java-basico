public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 20;

        if(valorSolicitado <= saldo)
        {
            saldo = saldo - valorSolicitado;
            System.out.println("novo saldo "+saldo);
        }else
        { 
            System.out.println("Saldo insuficiente!");
        }
    }
}
