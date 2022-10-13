
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mauri
 */
public class Parametro {
    
    private boolean arredonda;
    private boolean trunca;
    private boolean contribuinte;
    private boolean calculadifal;

    public boolean isArredonda() {
        return arredonda;
    }

    public void setArredonda(boolean arredonda) {
        this.arredonda = arredonda;
    }

    public boolean isTrunca() {
        return trunca;
    }

    public void setTrunca(boolean trunca) {
        this.trunca = trunca;
    }

    public boolean isContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(boolean contribuinte) {
        this.contribuinte = contribuinte;
    }

    public boolean isCalculadifal() {
        return calculadifal;
    }

    public void setCalculadifal(boolean calculadifal) {
        this.calculadifal = calculadifal;
    }
    
    public String arredondaIcms(double formatIcms){
        String resultado = new DecimalFormat("#,##0.00").format(formatIcms);
        return resultado;
    }
    
    public String truncaICMS(double formatIcms){
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String resultado = decimalFormat.format(formatIcms);
        return resultado;
    }
    
}
