package andb.example.merge234lab;

public class FootballPlayers {
    private int imgPlayers;
    private String name;
    private String dob;
    private int imgFlag;

    public FootballPlayers(int imgPlayers, String name, String dob, int imgFlag) {
        this.imgPlayers = imgPlayers;
        this.name = name;
        this.dob = dob;
        this.imgFlag = imgFlag;
    }

    public int getImgPlayers() {
        return imgPlayers;
    }

    public void setImgPlayers(int imgPlayers) {
        this.imgPlayers = imgPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getImgFlag() {
        return imgFlag;
    }

    public void setImgFlag(int imgFlag) {
        this.imgFlag = imgFlag;
    }
}
