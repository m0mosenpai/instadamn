package X;

/* renamed from: X.1Bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23351Bx {
    public int A00;
    public int A01;
    public final EnumC23341Bw A02;
    public final int A03;

    public final synchronized void A00(C1QY c1qy) {
        if (c1qy.A09 == this.A02) {
            if (C1RN.A00(c1qy)) {
                this.A01++;
            } else {
                this.A00++;
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final synchronized boolean A01() {
        boolean z;
        z = false;
        if (this.A01 + this.A00 < this.A03) {
            z = true;
        }
        return z;
    }

    public C23351Bx(EnumC23341Bw enumC23341Bw, int i) {
        this.A02 = enumC23341Bw;
        this.A03 = i;
    }
}
