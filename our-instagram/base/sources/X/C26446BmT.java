package X;

/* renamed from: X.BmT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26446BmT extends AbstractC51572Yf {
    public final float A00;
    public final C51722Yv A01;
    public final C64 A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16620sF A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, DCI.A00);
        InterfaceC16660sJ A01 = AbstractC85303rL.A01(c76223bS, new DRQ(this, 28));
        InterfaceC16620sF A02 = AbstractC85303rL.A02(c76223bS, new C30495Dbe(this, 40));
        Float valueOf = Float.valueOf(this.A00);
        C64 c64 = this.A02;
        C1I4 c1i4 = (C1I4) AbstractC77183d4.A00(c76223bS, C29901DGp.A00(A01, A00, this, A02, 0), new Object[]{A01, A02, valueOf, c64});
        int ordinal = c64.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                i = 1;
            } else {
                throw B4Z.A00();
            }
        } else {
            i = 0;
        }
        Integer num = C05F.A01;
        C51722Yv c51722Yv = this.A01;
        long A0D = AbstractC25229BEm.A0D();
        C3F1 c3f1 = AbstractC169037gc.A00;
        C2XE c2xe = c76223bS.A05;
        C2V3 c2v3 = c2xe.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C168877gM c168877gM = new C168877gM(c2xe);
        this.A03.invoke(new C28942Cpq(c168877gM.A00, c168877gM));
        return new C168977gW(c3f1, null, null, c1i4, c51722Yv, null, AbstractC168947gT.A01(c2xe, c2vf, num, i, -1, AbstractC25232BEp.A0n(c76223bS, A0D), false, z), c168877gM.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false);
    }

    public /* synthetic */ C26446BmT(C51722Yv c51722Yv, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF) {
        C64 c64 = C64.A02;
        C14360o3.A0B(c51722Yv, 6);
        this.A02 = c64;
        this.A04 = interfaceC16660sJ;
        this.A05 = interfaceC16620sF;
        this.A00 = 0.5f;
        this.A01 = c51722Yv;
        this.A03 = interfaceC16660sJ2;
    }
}
