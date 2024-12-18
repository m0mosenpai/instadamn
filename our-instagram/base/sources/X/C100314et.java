package X;

import android.os.SystemClock;

/* renamed from: X.4et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100314et extends AbstractC100064eU implements InterfaceC100294er {
    public int A00;
    public final long[] A01 = new long[5];

    @Override // X.InterfaceC100294er
    public final void ASt(boolean z) {
        long[] jArr = this.A01;
        synchronized (jArr) {
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            jArr[i] = SystemClock.uptimeMillis();
            this.A00 = i2 % jArr.length;
        }
    }

    public C100314et() {
        C87973w5.A02.A00(this);
    }
}
