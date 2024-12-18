package X;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public abstract class W8R {
    public static AtomicReference A00 = new AtomicReference();

    public static Calendar A00() {
        A00.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar A01(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        Calendar A0l = AbstractC65702TsY.A0l();
        A0l.set(calendar2.get(1), calendar2.get(2), calendar2.get(5));
        return A0l;
    }
}
