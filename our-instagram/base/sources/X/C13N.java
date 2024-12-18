package X;

import android.content.Context;

/* renamed from: X.13N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13N extends AbstractC211911v {
    public C226418s A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Context A06;
    public final C211211o A07;

    public C13N(Context context, C211211o c211211o, long j, long j2, long j3, long j4, long j5) {
        C14360o3.A0B(context, 1);
        this.A06 = context;
        this.A02 = j;
        this.A04 = j2;
        this.A05 = j3;
        this.A03 = j4;
        this.A01 = j5;
        this.A07 = c211211o;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "AppStartupTrackerInitializer";
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    @Override // X.AbstractC211911v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13N.A07():void");
    }

    public final C226418s A08() {
        C226418s c226418s = this.A00;
        if (c226418s != null) {
            return c226418s;
        }
        C14360o3.A0F("appStartupTracker");
        throw C00O.createAndThrow();
    }
}
