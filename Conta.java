public class Conta {
    
    private int numConta;
    private String tipoConta;
    //public String contaCorrente; //testes meus
    //public String contaPoupanca; // testes meus
    private String donoNome;
    private double saldo;
    public boolean status; //status para ver se a conta esta aberta ou fechada
    

    public String getdonoNome(){
        return this.donoNome;
    }

    public String setdonoNome(String donoNome){
        return this.donoNome;
    }

    public double getSaldo(){
        return this.saldo;

    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String gettipoConta(){
        return this.tipoConta;

    }

    public void contaCorrente(){
        //this.contaCorrente = this.tipoConta;
        this.tipoConta = "Conta Corrente";
        

    }

    public void contaPoupanca(){
        //this.contaPoupanca = this.tipoConta;
        this.tipoConta = "Conta Poupança";
    }
    
    public void abrirConta(){
        this.status = true;
        

       
    }

    public void fecharConta(){
        this.status = false;
        
        
    }

    public void depositar(){ //adicionar ao sistema
        
        

    }

    public void sacar(){ //adicionar ao sistema


    }

    public void pagarMensal(){ //adicionar ao sistema
        
    }

    
}
