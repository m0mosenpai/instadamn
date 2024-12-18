package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass451;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C45T;
import X.C914045z;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class DateDeserializers$CalendarDeserializer extends DateDeserializers$DateBasedDeserializer {
    public final Constructor A00;

    public DateDeserializers$CalendarDeserializer(Class cls) {
        super(GregorianCalendar.class);
        this.A00 = C914045z.A0A(GregorianCalendar.class, false);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Date A0l = A0l(c16l, anonymousClass469);
        if (A0l == null) {
            return null;
        }
        Constructor constructor = this.A00;
        if (constructor == null) {
            TimeZone timeZone = ((C45T) anonymousClass469.A02).A01.A0A;
            if (timeZone == null) {
                timeZone = AnonymousClass451.A0B;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(A0l);
            return calendar;
        }
        try {
            Calendar calendar2 = (Calendar) constructor.newInstance(new Object[0]);
            calendar2.setTimeInMillis(A0l.getTime());
            TimeZone timeZone2 = ((C45T) anonymousClass469.A02).A01.A0A;
            if (timeZone2 == null) {
                timeZone2 = AnonymousClass451.A0B;
            }
            if (timeZone2 == null) {
                return calendar2;
            }
            calendar2.setTimeZone(timeZone2);
            return calendar2;
        } catch (Exception e) {
            anonymousClass469.A0f(A0H(), e);
            throw C00O.createAndThrow();
        }
    }

    public DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer dateDeserializers$CalendarDeserializer, String str, DateFormat dateFormat) {
        super(dateDeserializers$CalendarDeserializer, str, dateFormat);
        this.A00 = dateDeserializers$CalendarDeserializer.A00;
    }

    public DateDeserializers$CalendarDeserializer() {
        super(Calendar.class);
        this.A00 = null;
    }
}
