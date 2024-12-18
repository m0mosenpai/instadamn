package X;

/* loaded from: classes10.dex */
public final class SNL {
    public final InterfaceC02550Ad A00;

    public final void A00(C2O5 c2o5, C58850QCl c58850QCl, String str) {
        InterfaceC02590Ai A0H = MSY.A0H(this.A00, "user_click_target_atomic");
        if (A0H.isSampled()) {
            JQ0.A13(AbstractC58320PtC.A0K(c2o5, A0H, AbstractC63083Sc6.A00(), str), A0H, c58850QCl);
            A0H.Cht();
        }
    }

    public final void A01(C2O5 c2o5, C58852QCn c58852QCn, String str) {
        InterfaceC02590Ai A0H = MSY.A0H(this.A00, "client_load_view_success");
        if (A0H.isSampled()) {
            JQ0.A13(AbstractC58320PtC.A0K(c2o5, A0H, AbstractC63083Sc6.A00(), str), A0H, c58852QCn);
            A0H.Cht();
        }
    }

    public SNL(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = interfaceC02550Ad;
    }
}
