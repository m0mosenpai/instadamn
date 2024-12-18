package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Feq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35148Feq {
    public long A00;
    public long A01;
    public long A02;
    public Date A03;
    public Date A04;

    public C35148Feq(String str, long j, long j2) {
        C14360o3.A0B(str, 1);
        this.A04 = A00().getTime();
        A01(this);
        this.A01 = j;
        A01(this);
        this.A00 = j2;
        A01(this);
    }

    public final long A02() {
        if (C14360o3.A0K(this.A03, A00().getTime())) {
            return this.A01;
        }
        return 0L;
    }

    public static final Calendar A00() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static void A01(C35148Feq c35148Feq) {
        c35148Feq.A03 = A00().getTime();
    }
}
