package X;

import android.app.Application;
import java.io.File;

/* renamed from: X.07D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07D implements C0OH {
    public final File A00;

    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(c0na, 1);
        if (num == C05F.A0C) {
            c0na.A05.A01.add(0, new C15280pi(this, 16));
        }
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C14360o3.A0B(c0nm, 1);
        return c0nm;
    }

    public C07D(Application application) {
        File dir = application.getDir("hprof", 0);
        C14360o3.A07(dir);
        this.A00 = dir;
    }
}
