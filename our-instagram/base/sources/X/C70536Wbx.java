package X;

/* renamed from: X.Wbx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70536Wbx implements InterfaceC97394Yz {
    public final InterfaceC97394Yz A00;
    public final long A01;

    @Override // X.InterfaceC97394Yz
    public final boolean CbZ() {
        return this.A00.CbZ();
    }

    @Override // X.InterfaceC97394Yz
    public final void Coy() {
        this.A00.Coy();
    }

    @Override // X.InterfaceC97394Yz
    public final int E7y(C96084Tr c96084Tr, C96094Ts c96094Ts, int i) {
        int E7y = this.A00.E7y(c96084Tr, c96094Ts, i);
        if (E7y == -4) {
            c96094Ts.A01 = Math.max(0L, c96094Ts.A01 + this.A01);
        }
        return E7y;
    }

    @Override // X.InterfaceC97394Yz
    public final int Em7(long j) {
        return this.A00.Em7(j - this.A01);
    }

    public C70536Wbx(InterfaceC97394Yz interfaceC97394Yz, long j) {
        this.A00 = interfaceC97394Yz;
        this.A01 = j;
    }

    @Override // X.InterfaceC97394Yz
    public final /* synthetic */ long CAC(int i) {
        return -9223372036854775807L;
    }
}
