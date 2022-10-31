package calculadoraimpostos;

public class Imposto {
    
    private float vlrProduto, vlrIPI, vlrFrete, vlrDespesa, redBas, mva, fcp;
    private float baseICMS, vlrICMS;
    public Imposto(){
    
    }

    public float getVlrProduto() {
        return vlrProduto;
    }

    public void setVlrProduto(float vlrProduto) {
        this.vlrProduto = vlrProduto;
    }

    public float getVlrIPI() {
        return vlrIPI;
    }

    public void setVlrIPI(float vlrIPI) {
        this.vlrIPI = vlrIPI;
    }

    public float getVlrFrete() {
        return vlrFrete;
    }

    public void setVlrFrete(float vlrFrete) {
        this.vlrFrete = vlrFrete;
    }

    public float getVlrDespesa() {
        return vlrDespesa;
    }

    public void setVlrDespesa(float vlrDespesa) {
        this.vlrDespesa = vlrDespesa;
    }

    public float getRedBas() {
        return redBas;
    }

    public void setRedBas(float redBas) {
        this.redBas = redBas;
    }

    public float getMva() {
        return mva;
    }

    public void setMva(float mva) {
        this.mva = mva;
    }

    public float getFcp() {
        return fcp;
    }

    public void setFcp(float fcp) {
        this.fcp = fcp;
    }
    
    public float getBaseICMS() {
        return baseICMS;
    }

    public void setBaseICMS(float baseICMS) {
        this.baseICMS = baseICMS;
    }

    public float getVlrICMS() {
        return vlrICMS;
    }

    public void setVlrICMS(float vlrICMS) {
        this.vlrICMS = vlrICMS;
    }
    
    // Métodos para calcular os impostos de acordo com a CST selecionada.
    
    public void calculaICMS(float vlrproduto, float vlripi, float vlrfrete, float vlrdespesa, String ufOrigem, float vlrFcp){
        float base = vlrproduto + vlripi + vlrfrete + vlrdespesa;
        this.baseICMS = base;
        
        UF uf = new UF();
        
        for(int i = 0; i < uf.getUFs().length; i++){
            for(int j = 0; j < uf.getUFs()[i].length; j++){
               if(uf.getUFs()[i][j] == ufOrigem){
                float icms = Float.parseFloat(uf.getUFs()[i][1]);
                float resultadoicms = getBaseICMS() * (icms / 100);
                float resultadofcp = getBaseICMS() * (vlrFcp / 100);
                this.vlrICMS = resultadoicms;
                this.fcp = resultadofcp;
                
                }
            }
        }
    }
    
    public void calculaICMSST(float vlrproduto, float vlripi, float vlrfrete, float vlrdespesa, String ufOrigem, float vlrFcp, float mva){
        float base = vlrproduto + vlripi + vlrfrete + vlrdespesa;
        this.baseICMS = base;
        
    }
    
    public void calculaRedBaseICMS(){
    
    }


    
    
}
