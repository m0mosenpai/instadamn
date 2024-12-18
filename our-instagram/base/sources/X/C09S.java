package X;

import android.app.ActivityManager;
import java.util.HashSet;

/* renamed from: X.09S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C09S extends Thread {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final ActivityManager A04;
    public final Object A05;
    public final java.util.Set A06;
    public volatile C11240ig A07;
    public final /* synthetic */ C09V A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09S(ActivityManager activityManager, C11240ig c11240ig, C09V c09v, long j) {
        super(AnonymousClass001.A0R("ProcessAnrErrorMonitorThread:", C0L6.A01()));
        this.A08 = c09v;
        this.A05 = new Object();
        this.A06 = new HashSet();
        this.A04 = activityManager;
        this.A07 = c11240ig;
        this.A03 = j;
        this.A00 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, X.09Q] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09S.run():void");
    }
}
