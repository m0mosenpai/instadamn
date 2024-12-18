package X;

import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: X.0Yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06850Yc extends AbstractC02970Bv {
    public final SparseArray A00 = new SparseArray();
    public final C02870Bl A01 = new Object();
    public final C02870Bl A02 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Bu, java.lang.Object] */
    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new Object();
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        long j;
        long j2;
        C07070Yz c07070Yz = (C07070Yz) abstractC02960Bu;
        synchronized (this) {
            AbstractC03000By.A00(c07070Yz);
            C02870Bl c02870Bl = this.A01;
            c07070Yz.A01 = c02870Bl.A00;
            C02870Bl c02870Bl2 = this.A02;
            c07070Yz.A00 = c02870Bl2.A00;
            long j3 = c02870Bl.A02;
            if (c02870Bl.A01 > 0) {
                j = SystemClock.uptimeMillis() - c02870Bl.A03;
            } else {
                j = 0;
            }
            c07070Yz.A03 = j3 + j;
            long j4 = c02870Bl2.A02;
            if (c02870Bl2.A01 > 0) {
                j2 = SystemClock.uptimeMillis() - c02870Bl2.A03;
            } else {
                j2 = 0;
            }
            c07070Yz.A02 = j4 + j2;
        }
        return true;
    }
}
