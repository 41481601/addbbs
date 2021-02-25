package cn.miaogu.domain;

public class Bbspaqu {
    private Long id;

    private String biaoti;

    private String shijian;

    private String laiyuan;

    private String zuoze;

    private String zaiyao;

    private String guanjianci;

    private String miaosu;

    private String zhengwen;

    private String pandaweburl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBiaoti() {
        return biaoti;
    }

    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti == null ? null : biaoti.trim();
    }

    public String getShijian() {
        return shijian;
    }

    public void setShijian(String shijian) {
        this.shijian = shijian == null ? null : shijian.trim();
    }

    public String getLaiyuan() {
        return laiyuan;
    }

    public void setLaiyuan(String laiyuan) {
        this.laiyuan = laiyuan == null ? null : laiyuan.trim();
    }

    public String getZuoze() {
        return zuoze;
    }

    public void setZuoze(String zuoze) {
        this.zuoze = zuoze == null ? null : zuoze.trim();
    }

    public String getZaiyao() {
        return zaiyao;
    }

    public void setZaiyao(String zaiyao) {
        this.zaiyao = zaiyao == null ? null : zaiyao.trim();
    }

    public String getGuanjianci() {
        return guanjianci;
    }

    public void setGuanjianci(String guanjianci) {
        this.guanjianci = guanjianci == null ? null : guanjianci.trim();
    }

    public String getMiaosu() {
        return miaosu;
    }

    public void setMiaosu(String miaosu) {
        this.miaosu = miaosu == null ? null : miaosu.trim();
    }

    public String getZhengwen() {
        return zhengwen;
    }

    public void setZhengwen(String zhengwen) {
        this.zhengwen = zhengwen == null ? null : zhengwen.trim();
    }

    public String getPandaweburl() {
        return pandaweburl;
    }

    public void setPandaweburl(String pandaweburl) {
        this.pandaweburl = pandaweburl == null ? null : pandaweburl.trim();
    }
}