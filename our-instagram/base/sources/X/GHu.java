package X;

/* loaded from: classes6.dex */
public final class GHu implements InterfaceC70493Ek {
    public final int A00;
    public final Object A01;

    public GHu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC70493Ek
    public final void DeM() {
        C65974TxR c65974TxR;
        switch (this.A00) {
            case 0:
                EVZ evz = (EVZ) this.A01;
                if (evz.A03 || !evz.A06.isResumed()) {
                    return;
                }
                evz.A04 = true;
                EVZ.A00(evz);
                return;
            case 1:
                ((C32353ENa) this.A01).A02();
                return;
            default:
                C31535DtK c31535DtK = (C31535DtK) this.A01;
                c31535DtK.A0e = true;
                FNH fnh = c31535DtK.A0F;
                if (fnh != null) {
                    fnh.A03.clear();
                    FNH fnh2 = c31535DtK.A0F;
                    if (fnh2 != null) {
                        if (fnh2.A00) {
                            c65974TxR = fnh2.A01;
                        } else {
                            c65974TxR = fnh2.A02;
                        }
                        c65974TxR.A06("");
                        return;
                    }
                }
                C14360o3.A0F("followListFragmentQueryManager");
                throw C00O.createAndThrow();
        }
    }
}
