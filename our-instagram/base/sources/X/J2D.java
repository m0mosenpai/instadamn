package X;

/* loaded from: classes7.dex */
public final class J2D implements InterfaceC58091PpG {
    public final /* synthetic */ IND A00;

    public J2D(IND ind) {
        this.A00 = ind;
    }

    @Override // X.InterfaceC58091PpG
    public final void Dpw(C59644QjO c59644QjO) {
        String A00;
        String A09;
        if (c59644QjO != null && (A09 = c59644QjO.A09((A00 = AbstractC58317Pt9.A00(49)))) != null && A09.length() != 0) {
            IND ind = this.A00;
            if (C18U.A06(C06090Tz.A05, ind.A01, 36312690062263510L)) {
                JI6 ji6 = ind.A07;
                C41753IeT A002 = C41753IeT.A00(ji6);
                A002.A0A = c59644QjO.A09(A00);
                C41726Idx.A02(ji6, A002);
            }
        }
    }

    @Override // X.InterfaceC58091PpG
    public final void onFailure() {
        C0w9.A03(AbstractC111324zv.A00(1598), AbstractC111324zv.A00(1624));
    }
}
