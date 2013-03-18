package hm.orz.sumpic.sample.jjbs.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * JSFにおけるページの項目表示と入力・送信値の画面反映サンプル。
 * @author kazuhito_m
 */
@ManagedBean(name = "js")
@RequestScoped
public class JsfSample {
    
    private String receivedText = "";
    
    public String getSampleText() {
        return "Sample Text dayo !";
    }
    
    public String repeatText() {
        return "jsfSample.xhtml";
    }

    // Setter/Getter群
    
    /**
     * @return the receivedText
     */
    public String getReceivedText() {
        return receivedText;
    }

    /**
     * @param receivedText the receivedText to set
     */
    public void setReceivedText(String receivedText) {
        this.receivedText = receivedText;
    }
    
}
