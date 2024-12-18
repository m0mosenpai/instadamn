package X;

/* renamed from: X.P2k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56397P2k implements YRL {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;
    public final int A04;

    @Override // X.YRL
    public final void CGW(C72783Xn3 c72783Xn3) {
        C14360o3.A0B(c72783Xn3, 0);
        c72783Xn3.A02 = 0;
        c72783Xn3.A03 = 0;
        int i = this.A01;
        int i2 = this.A04;
        if (i != i2) {
            c72783Xn3.A02 = (i2 - i) / 2;
        } else {
            int i3 = this.A00;
            int i4 = this.A03;
            if (i3 != i4) {
                c72783Xn3.A03 = (i4 - i3) / 2;
            }
        }
        c72783Xn3.A01 = i;
        c72783Xn3.A00 = this.A00;
    }

    @Override // X.InterfaceC199658sH
    public final void cleanup() {
    }

    @Override // X.YRL
    public final int B8d() {
        return 0;
    }

    @Override // X.YRL
    public final int Bmd() {
        return this.A00;
    }

    @Override // X.YRL
    public final int Bmj() {
        return this.A01;
    }

    @Override // X.YRL
    public final void EcX(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC199658sH
    public final int getHeight() {
        return this.A03;
    }

    @Override // X.InterfaceC199658sH
    public final int getWidth() {
        return this.A04;
    }

    public C56397P2k(int i, int i2, boolean z) {
        this.A04 = i;
        this.A03 = i2;
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
    }
}
