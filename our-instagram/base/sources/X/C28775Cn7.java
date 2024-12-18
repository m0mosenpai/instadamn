package X;

/* renamed from: X.Cn7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28775Cn7 implements InterfaceC31064Dl6 {
    public final /* synthetic */ BXF A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC31064Dl6
    public final void Dnv(long j) {
    }

    @Override // X.InterfaceC31064Dl6
    public final void onCancel() {
    }

    public C28775Cn7(BXF bxf, boolean z) {
        this.A00 = bxf;
        this.A01 = z;
    }

    @Override // X.InterfaceC31064Dl6
    public final void DBe(long j) {
        EnumC27356C5l enumC27356C5l;
        C28262Cd7 A00;
        InterfaceC1131459c interfaceC1131459c;
        BXF bxf = this.A00;
        boolean z = this.A01;
        if (z) {
            enumC27356C5l = EnumC27356C5l.SelectionStart;
        } else {
            enumC27356C5l = EnumC27356C5l.SelectionEnd;
        }
        bxf.A0H.Egh(enumC27356C5l);
        long A06 = bxf.A06(z);
        long A002 = AbstractC119395aw.A00(C119365at.A01(A06), C119365at.A02(A06) - 1.0f);
        CWQ cwq = bxf.A03;
        if (cwq != null && (A00 = cwq.A00()) != null) {
            InterfaceC1131459c interfaceC1131459c2 = A00.A01;
            if (interfaceC1131459c2 != null && interfaceC1131459c2.CQ7() && (interfaceC1131459c = A00.A00) != null && interfaceC1131459c.CQ7()) {
                A002 = interfaceC1131459c.Chl(interfaceC1131459c2, A002);
            }
            BXF.A03(bxf, A002);
            bxf.A00 = -1;
            CWQ cwq2 = bxf.A03;
            if (cwq2 != null) {
                AbstractC25227BEk.A1A(cwq2.A0B, true);
            }
            BXF.A05(bxf, false);
        }
    }

    @Override // X.InterfaceC31064Dl6
    public final void DBw(long j) {
        BXF bxf = this.A00;
        long A07 = C119365at.A07(bxf.A02, j);
        bxf.A02 = A07;
        C119365at A0R = AbstractC25225BEi.A0R(C119365at.A07(bxf.A01, A07));
        InterfaceC74953Yl interfaceC74953Yl = bxf.A0G;
        interfaceC74953Yl.Egh(A0R);
        BXF.A00(C28157Cb4.A00, bxf, AbstractC25226BEj.A0i(bxf.A0K), AbstractC25235BEs.A08(interfaceC74953Yl), false, this.A01, true);
        BXF.A05(bxf, false);
    }

    @Override // X.InterfaceC31064Dl6
    public final void Dwm() {
        BXF bxf = this.A00;
        BXF.A02(bxf);
        BXF.A05(bxf, true);
    }

    @Override // X.InterfaceC31064Dl6
    public final void onStop() {
        BXF bxf = this.A00;
        BXF.A02(bxf);
        BXF.A05(bxf, true);
    }
}
