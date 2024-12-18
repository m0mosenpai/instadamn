package X;

/* renamed from: X.WRh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70327WRh implements XGj {
    public final XGj A00;
    public final long A01;

    @Override // X.XGj
    public final boolean E3t(byte[] bArr, int i, int i2, boolean z) {
        return this.A00.E3t(bArr, 0, i2, z);
    }

    @Override // X.XGj
    public final boolean E88(byte[] bArr, int i, int i2, boolean z) {
        return this.A00.E88(bArr, 0, i2, z);
    }

    @Override // X.XGj
    public final int Em5(int i) {
        return this.A00.Em5(1);
    }

    @Override // X.XGj
    public final void AB0(int i) {
        this.A00.AB0(i);
    }

    @Override // X.XGj
    public final long Bc8() {
        return this.A00.Bc8() - this.A01;
    }

    @Override // X.XGj
    public final long BeZ() {
        return this.A00.BeZ() - this.A01;
    }

    @Override // X.XGj
    public final int E3p(byte[] bArr, int i, int i2) {
        return this.A00.E3p(bArr, i, i2);
    }

    @Override // X.XGj
    public final void E3s(byte[] bArr, int i, int i2) {
        this.A00.E3s(bArr, i, i2);
    }

    @Override // X.XGj
    public final void EJn() {
        this.A00.EJn();
    }

    @Override // X.XGj
    public final void Em8(int i) {
        this.A00.Em8(i);
    }

    @Override // X.XGj
    public final long getLength() {
        return this.A00.getLength() - this.A01;
    }

    @Override // X.XGj, X.InterfaceC71873X8g
    public final int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }

    @Override // X.XGj
    public final void readFully(byte[] bArr, int i, int i2) {
        this.A00.readFully(bArr, i, i2);
    }

    public C70327WRh(XGj xGj, long j) {
        this.A00 = xGj;
        WDn.A01(MSY.A1R((xGj.BeZ() > j ? 1 : (xGj.BeZ() == j ? 0 : -1))));
        this.A01 = j;
    }
}
