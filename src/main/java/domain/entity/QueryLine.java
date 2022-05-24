package domain.entity;

import java.util.Date;

public class QueryLine extends CommonLine {
    private Date dateTo;

    public QueryLine(String characterType, String service_id, String question_type_id,
                     CommonLine.response_type response_type, Date date, int timeInMinutesOfWaiting) {
        super(characterType, service_id, question_type_id, response_type, date, timeInMinutesOfWaiting);
    }

    public QueryLine(String characterType, String service_id, String question_type_id,
                     CommonLine.response_type response_type, Date dateFrom, int timeInMinutesOfWaiting, Date dateTo) {
        super(characterType, service_id, question_type_id, response_type, dateFrom, timeInMinutesOfWaiting);
        this.dateTo = dateTo;
    }
}
