package X;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes6.dex */
public abstract class F1C {
    public static final String A00(long j) {
        String str;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar2.setTime(new Date(j));
        if (calendar.get(1) == calendar2.get(1)) {
            str = "MMM d";
        } else {
            str = "MMM d, yyyy";
        }
        return MX0.A04(str, j);
    }
}
