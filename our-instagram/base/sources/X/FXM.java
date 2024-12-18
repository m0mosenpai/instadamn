package X;

/* loaded from: classes6.dex */
public abstract class FXM {
    public static final void A00(AbstractC12990ll abstractC12990ll, EnumC77213d7 enumC77213d7, EnumC77213d7 enumC77213d72, InterfaceC38391qT interfaceC38391qT) {
        C14360o3.A0B(interfaceC38391qT, 1);
        C11T.A06("This operation must be run on UI thread.");
        if (enumC77213d7 != enumC77213d72) {
            interfaceC38391qT.Ed3(enumC77213d72);
            if (enumC77213d72 == EnumC77213d7.A03 && interfaceC38391qT.BqL() != null && interfaceC38391qT.BqL().size() > 0) {
                interfaceC38391qT.BqL().clear();
            }
            interfaceC38391qT.AEH(abstractC12990ll);
        }
    }

    public static final void A01(AbstractC12990ll abstractC12990ll, InterfaceC38391qT interfaceC38391qT, boolean z) {
        EnumC77213d7 enumC77213d7;
        EnumC77213d7 enumC77213d72;
        if (z) {
            enumC77213d7 = EnumC77213d7.A04;
            enumC77213d72 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A03;
            enumC77213d72 = EnumC77213d7.A04;
        }
        A00(abstractC12990ll, enumC77213d7, enumC77213d72, interfaceC38391qT);
    }
}
