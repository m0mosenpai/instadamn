package X;

/* loaded from: classes8.dex */
public final class LGT {
    public final C2O5 A00 = C2O5.A09;
    public final EnumC31203Dnm A01 = EnumC31203Dnm.ANDROID;
    public final C18920wW A02;

    public LGT(C18920wW c18920wW) {
        this.A02 = c18920wW;
    }

    public static EnumC31203Dnm A00(InterfaceC02590Ai interfaceC02590Ai, LGT lgt, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A8R(lgt.A00, "product_type");
        return lgt.A01;
    }

    public final void A01(C44881Jtv c44881Jtv, String str) {
        AbstractC167017dG.A1N(str, c44881Jtv);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "user_click_appreciationfeed_atomic");
        if (A0f.isSampled()) {
            JQ0.A13(A00(A0f, this, AbstractC50529MSi.A01(), str), A0f, c44881Jtv);
            A0f.Cht();
        }
    }

    public final void A02(C44881Jtv c44881Jtv, String str) {
        AbstractC167017dG.A1N(str, c44881Jtv);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "client_load_appreciationfeed_display");
        if (A0f.isSampled()) {
            JQ0.A13(A00(A0f, this, AbstractC50529MSi.A01(), str), A0f, c44881Jtv);
            A0f.Cht();
        }
    }
}
