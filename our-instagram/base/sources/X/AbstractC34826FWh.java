package X;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: X.FWh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34826FWh {
    public static final boolean A01(long j, boolean z) {
        if (z && j <= A00(13) && j > A00(18)) {
            return true;
        }
        return false;
    }

    public static final long A00(int i) {
        Calendar calendar = Calendar.getInstance();
        return new GregorianCalendar(calendar.get(1) - i, calendar.get(2), AbstractC31173DnH.A05(calendar)).getTimeInMillis();
    }
}
