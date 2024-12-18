package X;

import android.content.Intent;
import android.os.SystemClock;

/* renamed from: X.1KT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1KT {
    public static long A00;
    public static Intent A01;
    public static C1KS A02;
    public static C1KQ A03;
    public static C1KO A04;
    public static boolean A05;
    public static final C19L A07 = AnonymousClass194.A02(C12L.A00.AOT(1562465960, 3).A00(1));
    public static final InterfaceC09390do A06 = AbstractC09440dt.A01(C1KU.A00);

    static {
        long uptimeMillis = SystemClock.uptimeMillis();
        A04 = new C1KO("open_app", uptimeMillis, uptimeMillis);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        C1KQ c1kq = new C1KQ(new C1KO("kill_app", uptimeMillis2, uptimeMillis2), "app_terminated", "app_terminated", null, "kill_app", SystemClock.uptimeMillis());
        A03 = c1kq;
        A02 = new C1KS(c1kq, A04, null, -408413369, "cold_start", "cold_start", null, SystemClock.uptimeMillis());
    }

    public static final C1KS A00() {
        return A02;
    }

    public static final void A01(C1KR c1kr) {
        if (A05) {
            c1kr.toString();
            C19L c19l = A07;
            C206649Cv c206649Cv = new C206649Cv(c1kr, null, 38);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(C1KO c1ko) {
        if (A05) {
            c1ko.toString();
            if (!(c1ko instanceof C3JI) || !C5I0.A00((C3JI) c1ko)) {
                A04 = c1ko;
            }
            C19L c19l = A07;
            C206649Cv c206649Cv = new C206649Cv(c1ko, null, 39);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
        }
    }
}
