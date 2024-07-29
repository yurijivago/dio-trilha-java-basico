import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        
        /* 2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
        Programa: "Por favor, digite o número da Agência !"
        Usuário: 1021 *(depois ENTER para o próximo campo) */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta!");
        Integer numero = Integer.parseInt(scanner.nextLine());
        conta.setNumero(numero);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();
        conta.setAgencia(agencia);

        System.out.println("Por favor, digite o nome do titular da conta!");
        String nomeCliente = scanner.nextLine();
        conta.setNomeCliente(nomeCliente);

        System.out.println("Por favor, digite o saldo da conta!");
        Double saldo = Double.parseDouble(scanner.nextLine());
        conta.setSaldo(saldo);
        
        /* 3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
        "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque". */
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo R$" + conta.getSaldo() + " já está disponível para saque");
    }
}
public class Conta{
    //Numero    | Inteiro  | 1021
    //Agencia   | Texto    | 067-8
    //Nome Cliente | Texto    | MARIO ANDRADE
    //Saldo | Decimal |237.48
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;
    
    public Conta(){}

    public Conta(Integer numero, String agencia, String nomeCliente, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    
}
