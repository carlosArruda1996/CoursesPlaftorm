package dominio.bootcamp.courses;

import java.time.LocalDate;

public class LiveMentoring {

    private String title;
    private String description;

    private Double hourCourse = 2.0;

    private LocalDate eventDate = LocalDate.of(1970, 1,1);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null && !description.equalsIgnoreCase("")){
            this.description = description;
        }
    }

    public Double getHourCourse() {
        return hourCourse;
    }

    public void setHourCourse(Double hourCourse) {
        if(hourCourse > 0 && !hourCourse.isInfinite() && !hourCourse.isNaN()){
            this.hourCourse = hourCourse;
        }
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        if (eventDate.isAfter(LocalDate.now())){
            this.eventDate = eventDate;
        }
    }
}
