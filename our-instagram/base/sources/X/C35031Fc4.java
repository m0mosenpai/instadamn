package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.Fc4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35031Fc4 {
    public static final C35031Fc4 A00 = new Object();

    public final void A01(AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, Boolean bool, Boolean bool2, Integer num, String str, String str2) {
        String str3;
        C14360o3.A0B(abstractC12990ll, 0);
        InterfaceC02900Bo A002 = C0BQ.A00(abstractC12990ll);
        double A01 = AbstractC31171DnF.A01();
        double A003 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "next_button_tapped");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, A01, A003);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        String str4 = null;
        if (enumC33445EqI != null) {
            str3 = enumC33445EqI.A00;
        } else {
            str3 = null;
        }
        AbstractC31171DnF.A19(A0f, str3);
        if (num != null) {
            str4 = AbstractC31178DnM.A0f(AbstractC34293FAn.A00(num));
        }
        A0f.AAP("cp_type_given", str4);
        A0f.A7v("keyboard", bool);
        A0f.A7v("is_private", bool2);
        A0f.AAP("instagram_id", str2);
        A0f.AAk("logged_in_accounts", AbstractC166987dD.A1F(A002.BOd()));
        AbstractC35274Fh9.A0B(A0f, abstractC12990ll);
    }

    public final void A02(AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(abstractC12990ll, 0);
        A01(abstractC12990ll, null, null, null, null, str, null);
    }

    public final void A00(AbstractC12990ll abstractC12990ll, C35161Ff3 c35161Ff3, String str) {
        String str2;
        double A002 = AbstractC31177DnL.A00(abstractC12990ll);
        double A003 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "next_button_tapped");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, A002, A003);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        if (c35161Ff3 != null) {
            str2 = c35161Ff3.A00.getString(AbstractC31176DnK.A0r(EnumC33320EoF.A06));
        } else {
            str2 = null;
        }
        A0f.AAP("cp_type_given", str2);
        A0f.Cht();
    }
}
