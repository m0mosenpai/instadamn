package X;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes9.dex */
public final class O7D {
    public final String A00;
    public final Date A01;

    public O7D(Date date) {
        this.A01 = date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.A00 = String.valueOf(calendar.get(5));
    }
}
