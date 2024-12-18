package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Date;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class DateSerializer extends DateTimeSerializerBase {
    public static final DateSerializer A00 = new DateTimeSerializerBase(null, Date.class, null);

    public DateSerializer() {
        super(null, Date.class, null);
    }
}
