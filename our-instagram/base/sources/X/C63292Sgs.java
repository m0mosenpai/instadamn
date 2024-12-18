package X;

/* renamed from: X.Sgs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63292Sgs {
    public int A00;
    public int A01;
    public int A02;
    public final byte[] A03;

    public /* synthetic */ C63292Sgs() {
    }

    public static int A00(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long A01(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public final void A02() {
        this.A02 = 0;
        int i = this.A00 + this.A01;
        this.A00 = i;
        if (i <= 0) {
            this.A01 = 0;
        } else {
            this.A01 = i;
            this.A00 = i - i;
        }
    }

    public /* synthetic */ C63292Sgs(byte[] bArr) {
        this();
        this.A02 = Integer.MAX_VALUE;
        this.A03 = bArr;
        this.A00 = 0;
    }
}
