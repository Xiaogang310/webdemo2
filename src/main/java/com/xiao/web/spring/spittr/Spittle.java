package com.xiao.web.spring.spittr;

import lombok.Getter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * Spittle
 *
 * @author : Gang
 * @date : 2019/2/2
 */
public class Spittle {

    @Getter
    private final Long id;
    @Getter
    private final String message;
    @Getter
    private final Date time;
    @Getter
    private Double latitude;
    @Getter
    private Double longitude;

    public Spittle(String message, Date time, Double longitude, Double latitude){
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Spittle(String message, Date time){
        this(message, time, null, null);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj, "id", "time");
    }
}
