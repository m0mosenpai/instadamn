package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.FCu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34352FCu {
    public static final void A00(AbstractC12990ll abstractC12990ll, Boolean bool, String str, String str2, String str3, boolean z, boolean z2) {
        long j;
        boolean A1a = AbstractC167017dG.A1a(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "facebook_sso_error");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, A01, A00);
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.AAP("error", str3);
        A0f.A9K("fbid", AbstractC25233BEq.A0n(str2));
        A0f.A7v("found_unlinked_account", AbstractC31173DnH.A0d(A0f, Boolean.valueOf(z), "has_response", z2));
        if (bool.equals(AbstractC31173DnH.A0d(A0f, Boolean.valueOf(AbstractC23851Es.A03()), "fb4a_installed", A1a))) {
            j = 1;
        } else {
            j = 0;
        }
        A0f.A9K("token_source", Long.valueOf(j));
        A0f.Cht();
    }
}
