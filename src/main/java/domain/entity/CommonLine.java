package domain.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CommonLine {
    private character_type characterType;
    private String service_id;
    private String question_type_id;
    private response_type response_type;
    private Date dateFrom;


    public CommonLine(String characterType, String service_id, String question_type_id,
                      CommonLine.response_type response_type, Date dateFrom, int timeInMinutesOfWaiting) {
        this.characterType = character_type.valueOf(characterType);
        this.service_id = service_id;
        this.question_type_id = question_type_id;
        this.response_type = response_type;
        this.dateFrom = dateFrom;
    }

    public CommonLine(String[] characteristics) throws ParseException {
        this.characterType = character_type.valueOf(characteristics[0]);
        this.service_id = characteristics[1];
        this.question_type_id = characteristics[2];
        this.response_type = response_type.valueOf(characteristics[3]);
        this.dateFrom = new SimpleDateFormat("dd.MM.yyyy").parse(characteristics[4]);
    }



    enum response_type {
        //first answer
        P,
        //next answer
        N
    }
    enum character_type {
        //waiting timeline
        D,
        //query
        C
    }
}
