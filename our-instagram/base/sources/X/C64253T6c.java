package X;

/* renamed from: X.T6c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64253T6c implements InterfaceC65591TnW {
    public final SZR A00;
    public final InterfaceC65665Tqv A01;
    public final C63031Sb3 A02;

    public C64253T6c(SZR szr, InterfaceC65665Tqv interfaceC65665Tqv, C63031Sb3 c63031Sb3) {
        this.A02 = c63031Sb3;
        this.A00 = szr;
        this.A01 = interfaceC65665Tqv;
    }

    public static C64253T6c A00(SZR szr, InterfaceC65665Tqv interfaceC65665Tqv, C63031Sb3 c63031Sb3) {
        return new C64253T6c(szr, interfaceC65665Tqv, c63031Sb3);
    }

    @Override // X.InterfaceC65591TnW
    public final int FFX(Object obj) {
        C63031Sb3 c63031Sb3 = this.A02;
        return c63031Sb3.A01(c63031Sb3.A02(obj));
    }

    @Override // X.InterfaceC65591TnW
    public final int FFn(Object obj) {
        return this.A02.A02(obj).hashCode();
    }

    @Override // X.InterfaceC65591TnW
    public final RO8 FGC() {
        InterfaceC65665Tqv interfaceC65665Tqv = this.A01;
        if (interfaceC65665Tqv instanceof RO8) {
            return ((RO8) interfaceC65665Tqv).A0M();
        }
        return interfaceC65665Tqv.FGs().A03();
    }

    @Override // X.InterfaceC65591TnW
    public final void FGM(Object obj) {
        this.A02.A06(obj);
        this.A00.A01();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC65591TnW
    public final void FGS(Object obj, Object obj2) {
        AbstractC63410Sjl.A0F(this.A02, obj, obj2);
    }

    @Override // X.InterfaceC65591TnW
    public final void FGa(C62905SWm c62905SWm, Object obj, byte[] bArr, int i, int i2) {
        RO8 ro8 = (RO8) obj;
        if (ro8.zzc == C63372Sid.A00()) {
            ro8.zzc = C63372Sid.A01();
        }
        throw null;
    }

    @Override // X.InterfaceC65591TnW
    public final void FGe(InterfaceC65599Tno interfaceC65599Tno, Object obj) {
        this.A00.A00();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC65591TnW
    public final boolean FGh(Object obj, Object obj2) {
        C63031Sb3 c63031Sb3 = this.A02;
        return AbstractC25230BEn.A1Q(c63031Sb3.A02(obj).equals(c63031Sb3.A02(obj2)) ? 1 : 0);
    }

    @Override // X.InterfaceC65591TnW
    public final boolean FGl(Object obj) {
        this.A00.A00();
        throw C00O.createAndThrow();
    }
}
