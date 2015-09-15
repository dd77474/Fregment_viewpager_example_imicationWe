package sx.com.info;

import java.util.List;

/**
 * Created by ranran on 2015/8/16.
 */
public class MainTxlTittle {
    private List<MainTxlInfo> mainTxlInfoList;
    private String Tittle;

    public MainTxlTittle(List<MainTxlInfo> mainTxlInfoList, String tittle) {
        this.mainTxlInfoList = mainTxlInfoList;
        Tittle = tittle;
    }

    public List<MainTxlInfo> getMainTxlInfoList() {
        return mainTxlInfoList;
    }

    public void setMainTxlInfoList(List<MainTxlInfo> mainTxlInfoList) {
        this.mainTxlInfoList = mainTxlInfoList;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }
}
