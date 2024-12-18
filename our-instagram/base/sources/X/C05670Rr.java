package X;

import android.os.SystemClock;

/* renamed from: X.0Rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05670Rr extends AbstractC02970Bv {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Bu, java.lang.Object] */
    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new Object();
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        C05680Rs c05680Rs = (C05680Rs) abstractC02960Bu;
        AbstractC03000By.A00(c05680Rs);
        c05680Rs.A00 = SystemClock.elapsedRealtime();
        c05680Rs.A01 = SystemClock.uptimeMillis();
        return true;
    }
}
