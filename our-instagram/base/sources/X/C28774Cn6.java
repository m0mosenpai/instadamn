package X;

/* renamed from: X.Cn6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28774Cn6 implements InterfaceC31064Dl6 {
    public final /* synthetic */ BXF A00;

    @Override // X.InterfaceC31064Dl6
    public final void DBe(long j) {
    }

    @Override // X.InterfaceC31064Dl6
    public final void onCancel() {
    }

    public C28774Cn6(BXF bxf) {
        this.A00 = bxf;
    }

    @Override // X.InterfaceC31064Dl6
    public final void DBw(long j) {
        C28262Cd7 A00;
        C5DP c5dp;
        BXF bxf = this.A00;
        bxf.A02 = C119365at.A07(bxf.A02, j);
        CWQ cwq = bxf.A03;
        if (cwq != null && (A00 = cwq.A00()) != null) {
            C119365at A0R = AbstractC25225BEi.A0R(C119365at.A07(bxf.A01, bxf.A02));
            InterfaceC74953Yl interfaceC74953Yl = bxf.A0G;
            interfaceC74953Yl.Egh(A0R);
            int F8T = bxf.A08.F8T(A00.A01(AbstractC25235BEs.A08(interfaceC74953Yl), true));
            long A002 = C60Z.A00(F8T, F8T);
            InterfaceC74953Yl interfaceC74953Yl2 = bxf.A0K;
            if (A002 != AbstractC25228BEl.A0G(interfaceC74953Yl2)) {
                CWQ cwq2 = bxf.A03;
                if ((cwq2 == null || AbstractC25230BEn.A1X(cwq2.A0B)) && (c5dp = bxf.A05) != null) {
                    ((C5DO) c5dp).A00.performHapticFeedback(9);
                }
                bxf.A0C.invoke(new C5C3(AbstractC25226BEj.A0i(interfaceC74953Yl2).A01, null, A002));
            }
        }
    }

    @Override // X.InterfaceC31064Dl6
    public final void Dnv(long j) {
        C28262Cd7 A00;
        InterfaceC1131459c interfaceC1131459c;
        BXF bxf = this.A00;
        long A06 = bxf.A06(true);
        long A002 = AbstractC119395aw.A00(C119365at.A01(A06), C119365at.A02(A06) - 1.0f);
        CWQ cwq = bxf.A03;
        if (cwq != null && (A00 = cwq.A00()) != null) {
            InterfaceC1131459c interfaceC1131459c2 = A00.A01;
            if (interfaceC1131459c2 != null && interfaceC1131459c2.CQ7() && (interfaceC1131459c = A00.A00) != null && interfaceC1131459c.CQ7()) {
                A002 = interfaceC1131459c.Chl(interfaceC1131459c2, A002);
            }
            BXF.A03(bxf, A002);
            bxf.A0H.Egh(EnumC27356C5l.Cursor);
            BXF.A05(bxf, false);
        }
    }

    @Override // X.InterfaceC31064Dl6
    public final void Dwm() {
        BXF.A02(this.A00);
    }

    @Override // X.InterfaceC31064Dl6
    public final void onStop() {
        BXF.A02(this.A00);
    }
}
