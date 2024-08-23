package dominio.bootcamp.courses;

import java.time.LocalDate;
import java.util.Set;

public class Content{

     private Atribute atribute;
    private Set<LiveMentoring> lives;
    private int xp;
    private int workload;
    private int contentDificulty;

    public Content(Atribute atribute,int xp, int workload, int contentDificulty){
        this.atribute = atribute;
        this.workload = workload;
        this.xp = xp;
        this.contentDificulty = contentDificulty;
    }

    public void addLive(LiveMentoring live){
        lives.add(live);
    }
    public void excludeLive(LiveMentoring live){
        LocalDate now = LocalDate.now();
        if (live.getEventDate().isBefore(now)) {
            lives.remove(live);
        }
    }
    public void removeLive(LiveMentoring live){
        lives.remove(live);
    }

    public void calculateXp(){
        atribute.calculaXpWithDificulty(xp,workload,contentDificulty);
    }

    public Atribute getAtribute() {
        return atribute;
    }

    public void setAtribute(Atribute atribute) {
        this.atribute = atribute;
    }

    public Set<LiveMentoring> getLives() {
        return lives;
    }

    public void setLives(Set<LiveMentoring> lives) {
        this.lives = lives;
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

    public int getContentDificulty() {
        return contentDificulty;
    }

    public void setContentDificulty(int contentDificulty) {
        this.contentDificulty = contentDificulty;
    }
}
