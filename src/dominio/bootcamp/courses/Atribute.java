package dominio.bootcamp.courses;

import java.time.LocalDate;

public class Atribute {

    protected String name;
    protected  String description;
    protected int xp;
    protected int workload;
    private int contentDificulty;
    protected LocalDate initDate = LocalDate.now();
    protected LocalDate finishDate = initDate.plusDays(30);

    public Atribute(String name, String description, int xp, int workload, int contentDificulty) {
        this.name = name;
        this.description = description;
        this.xp = xp;
        this.workload = workload;
        this.contentDificulty = contentDificulty;
    }
    public Atribute(){

    }

    public int calculaXpWithDificulty(int workload, int xp, int contentDificulty) {
        return xp * workload * contentDificulty;
    }
    public int calculaXpWithDificultyAndLive(int workload, int xp, int contentDificulty, boolean watchedLive) {
        if (watchedLive){
            return xp * workload * contentDificulty * 2;
        }
        return xp * workload * contentDificulty;
    }

    public int calculaXpWithLive(int workload, int xp, boolean watchedLive){
        if(watchedLive){
            return xp * workload * 2;
        }else return xp * workload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public void setInitDate(LocalDate initDate) {
        this.initDate = initDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public int getContentDificulty() {
        return contentDificulty;
    }

    public void setContentDificulty(int contentDificulty) {
        this.contentDificulty = contentDificulty;
    }
}
