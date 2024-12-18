package X;

/* loaded from: classes6.dex */
public final class GFU implements InterfaceC37181GZs {
    public final /* synthetic */ EOI A00;
    public final /* synthetic */ InterfaceC190488c6 A01;

    public GFU(EOI eoi, InterfaceC190488c6 interfaceC190488c6) {
        this.A01 = interfaceC190488c6;
        this.A00 = eoi;
    }

    @Override // X.InterfaceC37181GZs
    public final void DHQ() {
        this.A01.Clg();
    }

    @Override // X.InterfaceC37181GZs
    public final void DjG(String str) {
        this.A01.ClV();
        C65974TxR c65974TxR = this.A00.A09;
        if (c65974TxR == null) {
            C14360o3.A0F("typeaheadManager");
            throw C00O.createAndThrow();
        }
        c65974TxR.A06(str);
    }

    @Override // X.InterfaceC37181GZs
    public final void DjI(String str) {
        if (str.length() == 0) {
            EOI eoi = this.A00;
            if (eoi.A0L.isEmpty()) {
                eoi.updateUi(MXS.A04, C16930sl.A00);
                EOI.A05(eoi);
                eoi.A0O.clear();
                eoi.A0D.clear();
                return;
            }
            eoi.A0B(EOI.A02(eoi));
            return;
        }
        C65974TxR c65974TxR = this.A00.A09;
        if (c65974TxR == null) {
            C14360o3.A0F("typeaheadManager");
            throw C00O.createAndThrow();
        }
        c65974TxR.A06(str);
    }
}
