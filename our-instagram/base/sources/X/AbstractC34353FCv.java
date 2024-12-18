package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.FCv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34353FCv {
    public static final void A00(AbstractC12990ll abstractC12990ll, C35161Ff3 c35161Ff3, Boolean bool, String str, String str2) {
        String str3;
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "facebook_sso_success");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, A01, A00);
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, "instagram_id", str2);
        Boolean bool2 = null;
        if (c35161Ff3 != null) {
            str3 = c35161Ff3.A00.getString(AbstractC31176DnK.A0r(EnumC33320EoF.A0B));
        } else {
            str3 = null;
        }
        A0f.AAP("recovery_type", str3);
        if (c35161Ff3 != null) {
            bool2 = AbstractC31174DnI.A0n(c35161Ff3.A00, AbstractC31176DnK.A0r(EnumC33320EoF.A0C));
        }
        A0f.A7v("was_from_recovery_flow", bool2);
        A0f.A7v("is_facebook_linking_flow", null);
        A0f.A7v("found_unlinked_account", bool);
        A0f.A7v("is_signup_with_confirmed_phone_flow", null);
        A0f.Cht();
    }
}
