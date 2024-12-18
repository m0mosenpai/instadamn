package X;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ns9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53877Ns9 {
    public static final Integer A00(Date date, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        long time = j - calendar.getTime().getTime();
        if (time < 0) {
            MSX.A1R(calendar2, j);
            if (calendar.get(6) != calendar2.get(6) || calendar.get(1) != calendar2.get(1)) {
                MSX.A1R(calendar2, TimeUnit.DAYS.toMillis(1L) + j);
                if (calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1)) {
                    return C05F.A01;
                }
                MSX.A1R(calendar2, j);
                if (calendar.get(1) != calendar2.get(1)) {
                    return C05F.A00;
                }
                return C05F.A0j;
            }
            return C05F.A0C;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (time < timeUnit.toMillis(7L)) {
            MSX.A1R(calendar2, j);
            if (calendar.get(5) != calendar2.get(5)) {
                MSX.A1R(calendar2, j - timeUnit.toMillis(1L));
                if (calendar.get(5) == calendar2.get(5)) {
                    return C05F.A0N;
                }
                MSX.A1R(calendar2, j);
                if (calendar2.get(7) != calendar.get(7)) {
                    return C05F.A0Y;
                }
            }
            return C05F.A0C;
        }
        MSX.A1R(calendar2, j);
        if (calendar.get(1) != calendar2.get(1)) {
            return C05F.A0u;
        }
        return C05F.A0j;
    }
}
