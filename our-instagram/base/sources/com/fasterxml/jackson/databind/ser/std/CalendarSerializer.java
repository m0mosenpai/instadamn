package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Calendar;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class CalendarSerializer extends DateTimeSerializerBase {
    public static final CalendarSerializer A00 = new DateTimeSerializerBase(null, Calendar.class, null);

    public CalendarSerializer() {
        super(null, Calendar.class, null);
    }
}
