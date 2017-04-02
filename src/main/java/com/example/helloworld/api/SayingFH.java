package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

public class SayingFH {
    private long id;
    private Date date=new Date();

    @Length(max = 3)
    private String content;

    public SayingFH() {
        // Jackson deserialization
    }

    public SayingFH(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("content", content)
                .toString();
    }

    @JsonProperty
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
