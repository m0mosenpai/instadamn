package X;

/* loaded from: classes6.dex */
public abstract class FEW {
    public static volatile String A00;
    public static volatile String A01;

    public static final void A00(AbstractC12990ll abstractC12990ll, String str, String str2) {
        AbstractC167017dG.A1O(abstractC12990ll, str2);
        String A02 = AbstractC31172DnG.A0P(abstractC12990ll).A02(C19T.A2A);
        if (A02 != null && A02.length() != 0) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "send_phone_id_request");
            String A0c = AbstractC31179DnN.A0c(abstractC12990ll);
            double A012 = AbstractC31171DnF.A01();
            if (A0f.isSampled()) {
                AbstractC31176DnK.A1K(A0f, A012);
                AbstractC31177DnL.A1B(A0f, A012, AbstractC31171DnF.A00());
                AbstractC35274Fh9.A06(A0f);
                AbstractC25225BEi.A1O(A0f, str2);
                A0f.AAP("prefill_type", "both");
                AbstractC31176DnK.A1J(A0f, AbstractC31171DnF.A00());
                AbstractC31175DnJ.A0y(A0f);
                AbstractC31171DnF.A1A(A0f, str);
                AbstractC35274Fh9.A04(A0f);
                A0f.AAP("fb_family_device_id", AbstractC35274Fh9.A02(abstractC12990ll));
                AbstractC31178DnM.A13(A0f);
                AbstractC31175DnJ.A16(A0f, A0c);
            }
            C18C.A0E(true);
            C25621Ms A0c2 = AbstractC167017dG.A0c(abstractC12990ll);
            A0c2.A0B("accounts/contact_point_prefill/");
            A0c2.A9s("usage", "prefill");
            A0c2.A9s("phone_id", A02);
            A0c2.A0S(C32202ECx.class, FYK.class);
            C1ON A0U = AbstractC31172DnG.A0U(A0c2, true);
            A0U.A00 = new C32536EUm(abstractC12990ll, str, str2);
            C1GJ.A03(A0U);
        }
    }
}
