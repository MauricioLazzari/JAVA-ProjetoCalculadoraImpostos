public class Imposto {
    
    private double vlrProduto, vlrIPI, vlrFrete, vlrDespesa, redBas, mva, fcp;
    private double baseICMS, vlrICMS;
    public Imposto(){
    
    }

    public double getVlrProduto() {
        return vlrProduto;
    }

    public void setVlrProduto(double vlrProduto) {
        this.vlrProduto = vlrProduto;
    }

    public double getVlrIPI() {
        return vlrIPI;
    }

    public void setVlrIPI(double vlrIPI) {
        this.vlrIPI = vlrIPI;
    }

    public double getVlrFrete() {
        return vlrFrete;
    }

    public void setVlrFrete(double vlrFrete) {
        this.vlrFrete = vlrFrete;
    }

    public double getVlrDespesa() {
        return vlrDespesa;
    }

    public void setVlrDespesa(double vlrDespesa) {
        this.vlrDespesa = vlrDespesa;
    }

    public double getRedBas() {
        return redBas;
    }

    public void setRedBas(double redBas) {
        this.redBas = redBas;
    }

    public double getMva() {
        return mva;
    }

    public void setMva(double mva) {
        this.mva = mva;
    }

    public double getFcp() {
        return fcp;
    }

    public void setFcp(double fcp) {
        this.fcp = fcp;
    }
    
    public double getBaseICMS() {
        return baseICMS;
    }

    public void setBaseICMS(double baseICMS) {
        this.baseICMS = baseICMS;
    }

    public double getVlrICMS() {
        return vlrICMS;
    }

    public void setVlrICMS(double vlrICMS) {
        this.vlrICMS = vlrICMS;
    }
    
    // Métodos para calcular os impostos de acordo com a CST selecionada.
    
    public void calculaICMS(double vlrproduto, double vlripi, double vlrfrete, double vlrdespesa, String ufOrigem, double vlrFcp){
        double base = vlrproduto + vlripi + vlrfrete + vlrdespesa;
        this.baseICMS = base;
        
        UF uf = new UF();
        
        for(int i = 0; i < uf.getUFs().length; i++){
            for(int j = 0; j < uf.getUFs()[i].length; j++){
               if(uf.getUFs()[i][j] == ufOrigem){
                double icms = Float.parseFloat(uf.getUFs()[i][1]);
                double resultadoicms = getBaseICMS() * (icms / 100);
                double resultadofcp = getBaseICMS() * (vlrFcp / 100);
                this.vlrICMS = resultadoicms;
                this.fcp = resultadofcp;
                
                }
            }
        }
    }
    
    public void calculaICMSST(){
    
    }
    
    public void calculaRedBaseICMS(){
    
    }


    
    
}
