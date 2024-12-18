package X;

import android.os.Handler;

/* loaded from: classes8.dex */
public final class JQ6 {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(JQ7.A00);
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C50157MDk(this, 38));
    public final boolean A06;
    public final boolean A07;

    public final void A00() {
        if (this.A06 && !this.A00) {
            ((Handler) this.A04.getValue()).post((Runnable) this.A05.getValue());
        }
    }

    public JQ6(int i, int i2, long j, boolean z, boolean z2) {
        this.A06 = z;
        this.A02 = i;
        this.A03 = j;
        this.A01 = i2;
        this.A07 = z2;
    }
}
