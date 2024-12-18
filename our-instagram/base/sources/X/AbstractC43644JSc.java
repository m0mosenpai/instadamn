package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JSc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43644JSc {
    public static final ThreadLocal A01 = new C43789JYc();
    public static final ThreadLocal A00 = new C43788JYb();

    public static final long A00(long j) {
        Object obj = A00.get();
        if (obj != null) {
            Calendar calendar = (Calendar) obj;
            Object obj2 = A01.get();
            if (obj2 != null) {
                Calendar calendar2 = (Calendar) obj2;
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar.setTimeInMillis(TimeUnit.MICROSECONDS.toMillis(j));
                int i = calendar2.get(1) - calendar.get(1);
                int i2 = calendar2.get(6);
                if (i2 < calendar.get(6) && i == 1) {
                    i2 += calendar.getActualMaximum(6);
                } else if (i >= 1) {
                    return 365L;
                }
                return i2 - r1;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A01(Context context, long j) {
        int i;
        String string;
        String string2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(System.currentTimeMillis());
        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
        long hours2 = hours - timeUnit2.toHours(j);
        long minutes = timeUnit.toMinutes(System.currentTimeMillis()) - timeUnit2.toMinutes(j);
        if (minutes < 1) {
            i = 2131958647;
        } else {
            if (minutes < 60) {
                string = context.getString(2131958646, Long.valueOf(minutes));
            } else {
                if (hours2 < 24) {
                    string2 = context.getString(2131958644, Long.valueOf(hours2));
                    C14360o3.A07(string2);
                    return string2;
                }
                long A002 = A00(j);
                if (A002 >= 14) {
                    string = context.getString(2131958633);
                } else if (A002 >= 7) {
                    i = 2131958645;
                } else if (A002 > 1) {
                    String A10 = AbstractC43593JPy.A10(new SimpleDateFormat("EEEE", C1Q2.A02()), AbstractC166987dD.A0L(j));
                    C14360o3.A07(A10);
                    string = context.getString(2131958634, A10);
                } else {
                    i = 2131958648;
                }
            }
            C14360o3.A0A(string);
            return string;
        }
        string2 = context.getString(i);
        C14360o3.A07(string2);
        return string2;
    }
}
