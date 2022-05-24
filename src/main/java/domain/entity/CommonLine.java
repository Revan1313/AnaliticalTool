package domain.entity;

import java.util.Date;
import java.util.Objects;

public class CommonLine {
    private String characterType;
    private String service_id;
    private String question_type_id;
    private response_type response_type;
    private Date dateFrom;
    private int timeInMinutesOfWaiting;

    public CommonLine(String characterType, String service_id, String question_type_id,
                      CommonLine.response_type response_type, Date dateFrom, int timeInMinutesOfWaiting) {
        this.characterType = characterType;
        this.service_id = service_id;
        this.question_type_id = question_type_id;
        this.response_type = response_type;
        this.dateFrom = dateFrom;
        this.timeInMinutesOfWaiting = timeInMinutesOfWaiting;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getQuestion_type_id() {
        return question_type_id;
    }

    public void setQuestion_type_id(String question_type_id) {
        this.question_type_id = question_type_id;
    }

    public CommonLine.response_type getResponse_type() {
        return response_type;
    }

    public void setResponse_type(CommonLine.response_type response_type) {
        this.response_type = response_type;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public int getTimeInMinutesOfWaiting() {
        return timeInMinutesOfWaiting;
    }

    public void setTimeInMinutesOfWaiting(int timeInMinutesOfWaiting) {
        this.timeInMinutesOfWaiting = timeInMinutesOfWaiting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommonLine that)) return false;
        return Objects.equals(getCharacterType(), that.getCharacterType()) && Objects.equals(getService_id(), that.getService_id()) && Objects.equals(getQuestion_type_id(), that.getQuestion_type_id()) && getResponse_type() == that.getResponse_type();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCharacterType(), getService_id(), getQuestion_type_id(), getResponse_type());
    }

    enum response_type {
        FIRST_ANSWER,
        NEXT_ANSWER
    }
}
