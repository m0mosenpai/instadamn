package X;

/* renamed from: X.UwA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67683UwA extends AbstractC69677VtM {
    public final Uw4 A00;

    public C67683UwA(Uw4 uw4) {
        super(uw4);
        this.A00 = uw4;
    }

    @Override // X.AbstractC69677VtM
    public final boolean A03(AbstractC69677VtM abstractC69677VtM) {
        boolean A03 = super.A03(abstractC69677VtM);
        if (!(abstractC69677VtM instanceof C67683UwA) || !A03) {
            return false;
        }
        Uw4 uw4 = this.A00;
        InterfaceC72024XFm interfaceC72024XFm = uw4.A00;
        Uw4 uw42 = ((C67683UwA) abstractC69677VtM).A00;
        if (!C14360o3.A0K(interfaceC72024XFm, uw42.A00) || uw4.A02 != uw42.A02) {
            return false;
        }
        return true;
    }
}
