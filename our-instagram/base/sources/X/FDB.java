package X;

/* loaded from: classes6.dex */
public abstract class FDB {
    public static final void A00(AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, EnumC31713DwI enumC31713DwI, String str) {
        String str2;
        AbstractC25233BEq.A0v(0, abstractC12990ll, enumC31713DwI, str);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "suggestion_prefilled");
        AbstractC31177DnL.A1B(A0f, A01, A00);
        if (enumC33445EqI == null || (str2 = enumC33445EqI.A00) == null) {
            str2 = "null";
        }
        AbstractC31171DnF.A19(A0f, str2);
        AbstractC31171DnF.A1A(A0f, enumC31713DwI.A01);
        AbstractC31179DnN.A1A(A0f, "username_suggestion_string", str, A00);
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC35274Fh9.A04(A0f);
        AbstractC35274Fh9.A09(A0f, abstractC12990ll);
        A0f.AAP("app_device_id", AbstractC35274Fh9.A00());
        A0f.Cht();
    }
}
