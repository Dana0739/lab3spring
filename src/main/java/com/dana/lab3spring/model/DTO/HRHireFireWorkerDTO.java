package com.dana.lab3spring.model.DTO;

import com.dana.lab3spring.model.Position;
import com.dana.lab3spring.model.Status;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HRHireFireWorkerDTO {
    @XmlElement
    Long organizationId;
    @XmlElement
    Position position;
    @XmlElement
    Status status;
    @XmlElement
    Date startDate;
    @XmlElement
    Date endDate;
}
