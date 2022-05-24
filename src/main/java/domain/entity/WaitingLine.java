package domain.entity;

import java.util.Date;

public class WaitingLine extends CommonLine {
    public WaitingLine(String characterType, String service_id, String question_type_id, CommonLine.response_type response_type, Date date, int timeInMinutesOfWaiting) {
        super(characterType, service_id, question_type_id, response_type, date, timeInMinutesOfWaiting);
    }
}
