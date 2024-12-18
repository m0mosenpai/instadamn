package X;

/* renamed from: X.Dp3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31281Dp3 implements GZ3 {
    public GZ3 A00;
    public final InterfaceC37261GbE A01;

    @Override // X.GZ3
    public final void DFl(C114675Fx c114675Fx, Integer num) {
        InterfaceC37261GbE interfaceC37261GbE = this.A01;
        C162337Ov.A0Z(interfaceC37261GbE.B4C(), num);
        interfaceC37261GbE.DUq(c114675Fx, null);
        GZ3 gz3 = this.A00;
        if (gz3 != null) {
            gz3.DFl(c114675Fx, num);
        }
    }

    @Override // X.GZ3
    public final void DqN(InterfaceC37134GXv interfaceC37134GXv, Integer num) {
        String str;
        InterfaceC37261GbE interfaceC37261GbE = this.A01;
        C162337Ov.A0a(interfaceC37261GbE.BtO(), num);
        try {
            str = interfaceC37134GXv.BK3();
        } catch (Exception unused) {
            C18950wb.A00("Item ID doesn't exist in Send Callback", 20134884, true).report();
            str = null;
        }
        interfaceC37261GbE.DUq(null, str);
        GZ3 gz3 = this.A00;
        if (gz3 != null) {
            gz3.DqN(interfaceC37134GXv, num);
        }
    }

    public C31281Dp3(InterfaceC37261GbE interfaceC37261GbE, GZ3 gz3) {
        this.A01 = interfaceC37261GbE;
        this.A00 = gz3;
    }
}
