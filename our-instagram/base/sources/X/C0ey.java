package X;

import android.app.Application;

/* renamed from: X.0ey, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ey implements C0OH {
    public final long A00;

    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(c0na, 1);
        if (num == C05F.A1I) {
            C15280pi c15280pi = new C15280pi(this, 20);
            C10020gF c10020gF = new C0N9() { // from class: X.0gF
                /* JADX WARN: Type inference failed for: r0v0, types: [X.049, java.lang.Object] */
                @Override // X.C0N9
                public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                    Application application = c0nk.A0J;
                    ?? obj = new Object();
                    obj.A00 = application;
                    return obj;
                }
            };
            C15280pi c15280pi2 = new C15280pi(this, 19);
            C0M6 c0m6 = C0M6.CRITICAL_REPORT;
            c0na.A02(c0m6, c15280pi);
            c0na.A02(c0m6, c10020gF);
            if (C0M4.A00()) {
                c0m6 = C0M6.LARGE_REPORT;
            }
            c0na.A02(c0m6, c15280pi2);
        }
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C14360o3.A0B(c0nm, 1);
        return c0nm;
    }

    public C0ey(long j) {
        this.A00 = j;
    }
}
