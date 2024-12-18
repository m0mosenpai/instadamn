package X;

/* loaded from: classes7.dex */
public final /* synthetic */ class J6x extends C03E implements InterfaceC16820sZ {
    public J6x(Object obj) {
        super(0, obj, C86803ts.class, "onDismiss", "onDismiss()V", 0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C86803ts c86803ts = (C86803ts) this.receiver;
        c86803ts.A05.A0K(EnumC75203Zn.A03);
        C12210kP A0P = AbstractC31177DnL.A0P(c86803ts.A01);
        InterfaceC60442pS interfaceC60442pS = c86803ts.A02;
        A0P.A00 = interfaceC60442pS;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0P.A00(), "instagram_thumbnail_dismissal");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1M(EnumC120795dP.A0M, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
            C38321qM c38321qM = c86803ts.A00;
            if (c38321qM != null) {
                String id = c38321qM.getId();
                if (id != null) {
                    A0f.AAP("media_compound_key", id);
                    AbstractC25230BEn.A1C(A0f, r5.getPosition());
                    C38321qM c38321qM2 = c86803ts.A00;
                    if (c38321qM2 != null) {
                        AbstractC37302Gc3.A0z(A0f, c38321qM2);
                        C38321qM c38321qM3 = c86803ts.A00;
                        if (c38321qM3 != null) {
                            AbstractC37302Gc3.A0y(A0f, c38321qM3);
                            A0f.Cht();
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C14360o3.A0F("thumbnailMedia");
            throw C00O.createAndThrow();
        }
        return C0eB.A00;
    }
}
