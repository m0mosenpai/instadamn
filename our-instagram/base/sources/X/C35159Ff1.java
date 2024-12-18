package X;

/* renamed from: X.Ff1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35159Ff1 {
    public static final C35159Ff1 A00 = new Object();

    public final void A02(AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(abstractC12990ll, 0);
        A00(abstractC12990ll, null, null, null, str);
    }

    public static final void A00(AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, Boolean bool, Integer num, String str) {
        String str2;
        AbstractC167017dG.A1N(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "back_button_tapped");
        AbstractC31172DnG.A1O(A0f);
        AbstractC31175DnJ.A0y(A0f);
        AbstractC31171DnF.A1A(A0f, str);
        AbstractC31179DnN.A17(A0f, A01, A002);
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC35274Fh9.A09(A0f, abstractC12990ll);
        String str3 = null;
        if (enumC33445EqI != null) {
            str2 = enumC33445EqI.A00;
        } else {
            str2 = null;
        }
        AbstractC31171DnF.A19(A0f, str2);
        if (num != null) {
            str3 = AbstractC31178DnM.A0f(AbstractC34293FAn.A00(num));
        }
        A0f.AAP("chosen_signup_type", str3);
        A0f.A7v("is_standalone", bool);
        A0f.Cht();
    }

    public final void A01(AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, String str) {
        AbstractC167017dG.A1N(abstractC12990ll, str);
        A00(abstractC12990ll, enumC33445EqI, null, null, str);
    }
}
