package X;

/* renamed from: X.L7x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47775L7x {
    public int A00;
    public int A01;
    public long A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final InterfaceC16820sZ A06;

    public final boolean A00() {
        long A0N = AbstractC166987dD.A0N(this.A06.invoke());
        long j = this.A02;
        boolean z = true;
        if (A0N >= j) {
            z = false;
            if (j > 0) {
                this.A00 = 0;
                this.A02 = 0L;
            }
        }
        return z;
    }

    public C47775L7x(InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, int i4, int i5, long j) {
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A06 = interfaceC16820sZ;
        this.A00 = i4;
        this.A01 = i5;
        this.A02 = j;
    }
}
