package X;

import java.util.List;

/* renamed from: X.BmZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26452BmZ extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final AbstractC50812Vc A02;
    public final C26355Bl0 A03;
    public final C27985CVi A04;
    public final InterfaceC16660sJ A05;

    public C26452BmZ(AbstractC50812Vc abstractC50812Vc, C26355Bl0 c26355Bl0, C27985CVi c27985CVi, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 4);
        this.A03 = c26355Bl0;
        this.A01 = interfaceC16820sZ;
        this.A00 = interfaceC16820sZ2;
        this.A05 = interfaceC16660sJ;
        this.A04 = c27985CVi;
        this.A02 = abstractC50812Vc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, DED.A00);
        C27985CVi c27985CVi = this.A04;
        EnumC72438Xdi enumC72438Xdi = EnumC72438Xdi.CIRCLE_HANDLE;
        EnumC27424C8r enumC27424C8r = EnumC27424C8r.OUTLINE;
        Integer num = C05F.A00;
        List A1J = AbstractC166987dD.A1J(new C27918CSd(enumC72438Xdi, enumC27424C8r, num, AbstractC77623dm.A0F(c76223bS, 2131973056), new C29895DGj(48, A00, this)));
        C2XE c2xe = c76223bS.A05;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        A0P.A00(new C26399Bli(c27985CVi.A01, c27985CVi.A00, A1J, c27985CVi.A02));
        A0P.A00(this.A02);
        C2WF c2wf = new C2WF(null, null, null, A0P.A01, false);
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        C75933ay c75933ay = C51722Yv.A02;
        long A0F = AbstractC25229BEm.A0F();
        long doubleToRawLongBits = Double.doubleToRawLongBits(22.0d);
        C51722Yv A0D = AbstractC25234BEr.A0D(AbstractC25234BEr.A0F(null, AbstractC25227BEk.A0b(A0F), 0, doubleToRawLongBits), AbstractC25225BEi.A0n(C05F.A1F, 0, A0F), 0, AbstractC25230BEn.A0L());
        C2XE c2xe2 = A0P2.A00;
        C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe2);
        A0P3.A00(new C26487Bn8(EnumC72438Xdi.ARROW_LEFT, EnumC72438Xdi.ARROW_RIGHT, enumC27424C8r, new C51722Yv(null, null).A00(C9CU.A00(null, C05F.A09, 0, A0F)), num, AbstractC77623dm.A0F(A0P3, 2131973055), new C29895DGj(49, A00, this)));
        AbstractC25230BEn.A1G(this.A03, A0P3, A0P2, A0D);
        InterfaceC16660sJ interfaceC16660sJ = this.A05;
        long A0D2 = AbstractC25229BEm.A0D();
        C3F1 c3f1 = AbstractC169037gc.A00;
        C2V3 c2v3 = c2xe2.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C168877gM c168877gM = new C168877gM(c2xe2);
        interfaceC16660sJ.invoke(c168877gM);
        A0P2.A00(new C168977gW(c3f1, null, null, null, null, null, AbstractC168947gT.A01(c2xe2, c2vf, num, 1, Integer.MIN_VALUE, AbstractC25232BEp.A0n(A0P2, A0D2), false, z), c168877gM.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false));
        C2WF c2wf2 = new C2WF(null, null, null, A0P2.A01, false);
        if (AbstractC25229BEm.A1W(A00)) {
            c2wf = c2wf2;
        }
        return AbstractC76963ci.A03(AbstractC25232BEp.A11(c2wf, c2xe), c76223bS, AbstractC25230BEn.A0d(null, C05F.A01, 100.0f, 0));
    }
}
