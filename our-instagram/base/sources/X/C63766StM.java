package X;

/* renamed from: X.StM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63766StM implements InterfaceC65570Tn3 {
    public final InterfaceC65476Tkt A00;
    public final byte[] A01;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return this.A00.Avg();
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        interfaceC65471Tko.D9H(this.A00.AK3(this.A01));
    }

    public C63766StM(InterfaceC65476Tkt interfaceC65476Tkt, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = interfaceC65476Tkt;
    }
}
