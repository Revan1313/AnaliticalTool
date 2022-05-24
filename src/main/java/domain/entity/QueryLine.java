package domain.entity;

import java.text.ParseException;
import java.util.Date;

public class QueryLine extends CommonLine {
    private Date dateTo;


    public QueryLine(String characterType, String service_id, String question_type_id, CommonLine.response_type response_type, Date dateFrom, int timeInMinutesOfWaiting) {
        super(characterType, service_id, question_type_id, response_type, dateFrom, timeInMinutesOfWaiting);
    }

    public QueryLine(String[] characteristics) throws ParseException {
        super(characteristics);
    }
}
