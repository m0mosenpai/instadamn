package X;

/* loaded from: classes9.dex */
public final class MXj implements InterfaceC58113Ppc {
    public final /* synthetic */ C50643MXf A00;

    public MXj(C50643MXf c50643MXf) {
        this.A00 = c50643MXf;
    }

    public static void A00(C50643MXf c50643MXf) {
        if (c50643MXf.A0D.A01.isEmpty()) {
            AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "segment store cannot be empty", null);
        }
    }

    @Override // X.InterfaceC58113Ppc
    public final int BsJ() {
        C50643MXf c50643MXf = this.A00;
        A00(c50643MXf);
        return MSW.A06(c50643MXf.A0D);
    }

    @Override // X.InterfaceC58113Ppc
    public final int BsN(int i) {
        C50643MXf c50643MXf = this.A00;
        A00(c50643MXf);
        return c50643MXf.A0D.A01(i) + c50643MXf.A0D.A00(i);
    }

    @Override // X.InterfaceC58113Ppc
    public final int BsQ(int i) {
        C50643MXf c50643MXf = this.A00;
        A00(c50643MXf);
        return c50643MXf.A0D.A01(i);
    }
}
